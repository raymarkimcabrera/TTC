package com.example.poc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.example.poc.base.BaseActivity
import com.example.poc.viewmodel.MainViewModel
import timber.log.Timber

class MainActivity : BaseActivity() {
    private val mainViewModel: MainViewModel by viewModels { viewModelFactory }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainViewModel.getPost()
    }
}
