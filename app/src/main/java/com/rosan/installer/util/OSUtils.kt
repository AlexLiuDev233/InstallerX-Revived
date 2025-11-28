package com.rosan.installer.util

import android.annotation.SuppressLint
import android.os.SystemProperties
import com.rosan.installer.data.reflect.repo.ReflectRepo
import org.koin.core.component.KoinComponent
import org.koin.core.component.get

object OSUtils : KoinComponent {
    private val reflect = get<ReflectRepo>()

    // Key for MIUI version name
    private const val KEY_MIUI_VERSION_NAME = "ro.miui.ui.version.name"

    // Key for HyperOS version name
    private const val KEY_HYPEROS_VERSION_NAME = "ro.hyperos.version.name"

    /**
     * Checks if the device is running HyperOS.
     */
    fun isHyperOS(): Boolean {
        return !SystemProperties.get(KEY_HYPEROS_VERSION_NAME).isNullOrEmpty()
    }

    /**
     * Checks if the device is running MIUI.
     */
    fun isMIUI(): Boolean {
        return !SystemProperties.get(KEY_MIUI_VERSION_NAME).isNullOrEmpty()
    }
}
