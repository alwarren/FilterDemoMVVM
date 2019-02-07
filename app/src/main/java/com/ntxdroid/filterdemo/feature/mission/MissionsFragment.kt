/*
 * Copyright (c) 2019. Al Warren
 *
 * Licensed under the Apache License, Version 2.0 (the "License")
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
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