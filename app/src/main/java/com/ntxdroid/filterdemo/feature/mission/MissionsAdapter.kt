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