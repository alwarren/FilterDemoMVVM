/*
 * Copyright (c) 2019. Al Warren
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.ntxdroid.filterdemo.feature.mission

import android.os.Bundle
import android.view.*
import com.ntxdroid.filterdemo.R
import com.ntxdroid.filterdemo.core.di.Injection
import com.ntxdroid.filterdemo.core.platform.LoggingFragment
import com.ntxdroid.filterdemo.core.platform.extensions.observe
import com.ntxdroid.filterdemo.core.platform.extensions.viewModel
import kotlinx.android.synthetic.main.missions_fragment.*

/**
 * Created by Al Warren on 2/6/2019.
 */

class MissionsFragment : LoggingFragment() {
    private val adapter = Injection.missionsAdapter
    private val viewModelFactory = Injection.viewModelFactory
    private lateinit var viewModel: MissionsViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = viewModel(viewModelFactory) {
            observe(missions, ::renderMissionsList)
        }
        setHasOptionsMenu(true)
    }

    private fun renderMissionsList(missions: List<Mission>?) {
        adapter.collection = missions.orEmpty()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? =
        inflater.inflate(R.layout.missions_fragment, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initializeView()
        if (adapter.isEmpty())
            loadMissions()
    }

    private fun initializeView() {
        missionsList.adapter = adapter
        adapter.clickListener = { mission ->
            viewModel.setFilter(mission.missionGroup)
        }
    }

    private fun loadMissions() = viewModel.loadMissions()

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) =
            inflater.inflate(R.menu.menu_missions, menu)

    override fun onOptionsItemSelected(item: MenuItem) =
        item.itemId.run {
            when (this) {
                R.id.refresh -> loadMissions()
            }
            true
        }
}