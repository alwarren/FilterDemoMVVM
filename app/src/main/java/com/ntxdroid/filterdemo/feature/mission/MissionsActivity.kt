package com.ntxdroid.filterdemo.feature.mission

import android.os.Bundle
import com.ntxdroid.filterdemo.R
import com.ntxdroid.filterdemo.core.platform.LoggingActivity

// base class logs lifecycle events
class MissionsActivity : LoggingActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
