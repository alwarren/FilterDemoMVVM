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

package com.ntxdroid.filterdemo.domain

/**
 * Created by Al Warren on 2/6/2019.
 */

sealed class FilterState {
    object Init: FilterState()
    object Red: FilterState()
    object Blue: FilterState()
    object None: FilterState()
    companion object {
        fun fromInt(value: Int) =
            when (value) {
                0 -> Red
                1 -> Blue
                else -> None
            }
    }
}