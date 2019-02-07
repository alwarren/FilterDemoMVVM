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

package com.ntxdroid.filterdemo.core.platform

/**
 * Created by Al Warren on 2/6/2019.
 */

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import timber.log.Timber

open class LoggingFragment : Fragment() {
    init {
        Timber.d("$TAG init is called")
    }

    override fun onPause() {
        Timber.d("$TAG ${this.javaClass.simpleName} onPause is called")
        super.onPause()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        Timber.d("$TAG ${this.javaClass.simpleName} onViewCreated is called")
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        Timber.d("$TAG ${this.javaClass.simpleName} onCreate is called")
        super.onCreate(savedInstanceState)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        Timber.d("$TAG ${this.javaClass.simpleName} onActivityCreated is called")
        super.onActivityCreated(savedInstanceState)
    }

    override fun onStart() {
        Timber.d("$TAG ${this.javaClass.simpleName} onStart is called")
        super.onStart()
    }

    override fun onResume() {
        Timber.d("$TAG ${this.javaClass.simpleName} onResume is called")
        super.onResume()
    }

    override fun onDetach() {
        Timber.d("$TAG ${this.javaClass.simpleName} onDetach is called")
        super.onDetach()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        Timber.d("$TAG ${this.javaClass.simpleName} onCreateView is called")
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onDestroyView() {
        Timber.d("$TAG ${this.javaClass.simpleName} onDestroyView is called")
        super.onDestroyView()
    }

    override fun onStop() {
        Timber.d("$TAG ${this.javaClass.simpleName} onStop is called")
        super.onStop()
    }

    override fun onDestroy() {
        Timber.d("$TAG ${this.javaClass.simpleName} onDestroy is called")
        super.onDestroy()
    }

    companion object {
        private const val TAG = "Logging---->"
    }
}