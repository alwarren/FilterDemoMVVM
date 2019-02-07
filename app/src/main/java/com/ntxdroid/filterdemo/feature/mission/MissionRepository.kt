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

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.ntxdroid.filterdemo.data.Mock
import com.ntxdroid.filterdemo.domain.FilterState
import com.ntxdroid.filterdemo.domain.FilterState.*

/**
 * Created by Al Warren on 2/6/2019.
 */

object MissionRepository {
    private val missions = MutableLiveData<List<Mission>>()

    fun getMissionGroup(filter: FilterState? = FilterState.None):LiveData<List<Mission>> {
        val data = when (filter) {
            Red -> Mock.missions.filter { it.missionGroup == 0 }
            Blue -> Mock.missions.filter { it.missionGroup == 1 }
            None -> Mock.missions
            else -> emptyList()
        }
        missions.value = data
        return missions
    }
}