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