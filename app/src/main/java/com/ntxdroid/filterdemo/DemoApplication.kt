package com.ntxdroid.filterdemo

import android.app.Application
import timber.log.Timber.DebugTree
import timber.log.Timber

/**
 * Created by Al Warren on 2/6/2019.
 */

@Suppress("unused")
class DemoApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) {
            Timber.plant(DebugTree())
        }
    }
}