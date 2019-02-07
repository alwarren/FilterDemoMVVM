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

import androidx.lifecycle.*
import com.ntxdroid.filterdemo.domain.FilterState
import com.ntxdroid.filterdemo.domain.FilterState.*
import timber.log.Timber

/**
 * Created by Al Warren on 2/6/2019.
 */

class MissionsViewModel(private val repository: MissionRepository) : ViewModel() {

    // observed by the ViewModel as a trigger to retrieve data from the source
    private var liveTrigger: MutableLiveData<FilterState> = MutableLiveData()

    // observed by Activity/Fragment as a trigger to do something with the data
    private var liveData: LiveData<List<Mission>>
    // for readability
    val missions get() = liveData

    init {
        // default observable trigger (we need a starting value that will change)
        liveTrigger.value = FilterState.Init

        // observe liveTrigger and reload observable liveData when trigger changes
        liveData = Transformations.switchMap(liveTrigger) {
            repository.getMissionGroup(liveTrigger.value)
        }
    }

    // changing liveTrigger's value causes Transformations.switchMap to send a value to the repository
    // where it's live value is updated. The repository returns it's live data which replaces the
    // ViewModel's live data. The Activity/Fragment observer sees the change and updates it's UI
    // with the new value.
    private fun setFilter(trigger: FilterState) {
        Timber.d("---> Updating the ViewModel with missionGroup ${trigger.javaClass.simpleName}")
        liveTrigger.value = trigger
    }

    // special case from a click listener that returns missionGroup (Int)
    fun setFilter(value: Int) {
        setFilter( FilterState.fromInt(value))
    }

    // convenience function for readability
    fun loadMissions() {
        setFilter(None)
    }

    class Factory(
        private val repository: MissionRepository
    ) : ViewModelProvider.NewInstanceFactory() {

        @Suppress("UNCHECKED_CAST")
        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            return MissionsViewModel(repository) as T
        }
    }
}

