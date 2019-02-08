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

import android.graphics.Color
import android.graphics.PorterDuff
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.ntxdroid.filterdemo.R
import com.ntxdroid.filterdemo.core.di.Injection
import com.ntxdroid.filterdemo.core.platform.AbstractListRecycler
import kotlinx.android.synthetic.main.mission_card.view.*

/**
 * Created by Al Warren on 2/4/2019.
 */

class MissionsAdapter : AbstractListRecycler<Mission>() {
    override fun layoutId() = R.layout.mission_card

    override fun createViewHolder(view: View) = MissionViewHolder(view)

    class MissionViewHolder(itemView: View): RecyclerView.ViewHolder(itemView), Binder<Mission> {
        private val colors = Injection.iconColors
        override fun bind(data: Mission, clickListener: (Mission) -> Unit) {
            itemView.missionInitial.apply {
                text = data.missionName[0].toString()
                background.setColorFilter(Color.parseColor(colors[data.missionGroup]),
                    PorterDuff.Mode.SRC_OVER)
            }
            itemView.missionName.text = data.missionName
            itemView.missionInitial.text = data.missionName[0].toString()
            itemView.manufacturers.text = data.manufacturers.joinToString(", ")
            itemView.setOnClickListener { clickListener(data) }
        }
    }
}