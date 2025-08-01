package com.newtaxiprime.user.appcommon.views

import android.content.Context
import android.content.res.Configuration
import android.content.res.Resources
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.newtaxiprime.user.appcommon.configs.SessionManager
import com.newtaxiprime.user.appcommon.network.AppController
import java.util.*
import javax.inject.Inject

open class CommonActivity : AppCompatActivity() {
    @Inject
    lateinit var local: SessionManager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AppController.appComponent.inject(this)
        updateLocale()
    }

    override fun attachBaseContext(newBase: Context?) {
        AppController.appComponent.inject(this)
        super.attachBaseContext(updateLocale(newBase))
    }

    fun updateLocale(newBase: Context?): Context? {
        var newBase = newBase
        val lang: String = local.languageCode!! // your language or load from SharedPref
        val locale = Locale(lang)
        val config = Configuration(newBase?.resources?.configuration)
        Locale.setDefault(locale)
        config.setLocale(locale)
        newBase = newBase?.createConfigurationContext(config)
        newBase?.resources?.updateConfiguration(config, newBase.resources.displayMetrics)
        return newBase
    }

    fun updateLocale() {
        val locale = Locale(local.languageCode!!)
        Locale.setDefault(locale)
        val resources: Resources = getResources()
        val config: Configuration = resources.getConfiguration()
        config.setLocale(locale)
        resources.updateConfiguration(config, resources.getDisplayMetrics())
    }

}