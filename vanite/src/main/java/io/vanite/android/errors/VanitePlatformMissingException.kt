package io.vanite.android.errors

import io.vanite.android.models.VaniteExceptionDetails

/**
 * Created By : Yazan Tarifi
 * Date : 10/9/2019
 * Time : 9:00 PM
 */

class VanitePlatformMissingException(details: VaniteExceptionDetails<*>) : VaniteException(details)
