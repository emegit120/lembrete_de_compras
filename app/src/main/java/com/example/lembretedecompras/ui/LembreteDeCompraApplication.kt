package com.example.lembretedecompras.ui

import android.app.Application
import com.example.lembretedecompras.BuildConfig
import com.facebook.stetho.Stetho

class LembreteDeCompraApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        if(BuildConfig.DEBUG){
            Stetho.initializeWithDefaults(this)
        }
    }
}