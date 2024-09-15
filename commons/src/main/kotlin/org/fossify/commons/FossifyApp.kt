package org.fossify.commons

import android.app.Application
import androidx.lifecycle.ProcessLifecycleOwner
import org.fossify.commons.extensions.appLockManager
import org.fossify.commons.extensions.checkUseEnglish

open class FossifyApp : Application() {

    override fun onCreate() {
        super.onCreate()
        checkUseEnglish()
        setupAppLockManager()
    }

    private fun setupAppLockManager() {
        ProcessLifecycleOwner.get().lifecycle.addObserver(appLockManager)
    }
}
