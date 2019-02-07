package com.ntxdroid.filterdemo.core.di

import com.ntxdroid.filterdemo.feature.mission.MissionRepository
import com.ntxdroid.filterdemo.feature.mission.MissionsAdapter
import com.ntxdroid.filterdemo.feature.mission.MissionsViewModel

/**
 * Created by Al Warren on 2/6/2019.
 */

object Injection {
    val viewModelFactory = MissionsViewModel.Factory(MissionRepository)
    val missionsAdapter = MissionsAdapter()
    val iconColors = listOf("#d50000", "#2962ff")
}