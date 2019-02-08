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

