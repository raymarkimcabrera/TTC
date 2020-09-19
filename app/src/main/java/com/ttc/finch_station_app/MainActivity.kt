package com.ttc.finch_station_app

import android.os.Bundle
import androidx.activity.viewModels
import com.ttc.finch_station_app.base.BaseActivity
import com.ttc.finch_station_app.viewmodel.MainViewModel

class MainActivity : BaseActivity() {
    private val mainViewModel: MainViewModel by viewModels { viewModelFactory }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainViewModel.getPost()
    }
}
