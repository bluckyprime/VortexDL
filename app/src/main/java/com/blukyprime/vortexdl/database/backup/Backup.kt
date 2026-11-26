package com.blukyprime.vortexdl.database.backup

import com.blukyprime.vortexdl.database.objects.CommandTemplate
import com.blukyprime.vortexdl.database.objects.DownloadedVideoInfo
import com.blukyprime.vortexdl.database.objects.OptionShortcut
import kotlinx.serialization.Serializable

@Serializable
data class Backup(
    val templates: List<CommandTemplate>? = null,
    val shortcuts: List<OptionShortcut>? = null,
    val downloadHistory: List<DownloadedVideoInfo>? = null,
)
