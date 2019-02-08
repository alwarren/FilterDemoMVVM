/*
 * Copyright (c) 2019.
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