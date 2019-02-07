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

import android.annotation.SuppressLint
import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import timber.log.Timber

@SuppressLint("Registered")
open class LoggingActivity : AppCompatActivity() {
    init {
        Timber.d("$TAG init is called")
    }

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        Timber.d("$TAG onCreate is called")
        super.onCreate(savedInstanceState, persistentState)
    }

    override fun onPause() {
        Timber.d("$TAG onPause is called")
        super.onPause()
    }

    override fun onDestroy() {
        Timber.d("$TAG onDestroy is called")
        super.onDestroy()
    }

    override fun onStart() {
        Timber.d("$TAG onStart is called")
        super.onStart()
    }

    override fun onResume() {
        Timber.d("$TAG onResume is called")
        super.onResume()
    }

    override fun onStop() {
        Timber.d("$TAG onStop is called")
        super.onStop()
    }

    override fun onBackPressed() {
        Timber.d("$TAG onBack is called")
        super.onBackPressed()
    }

    companion object {
        private const val TAG = "Logging---->"
    }
}