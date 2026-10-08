package com.alfaizkhan.usbserialcommunication;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.core.content.ContextCompat;

public final class PermissionUtil {
    private PermissionUtil() {}

    public static boolean hasNotificationPermission(Context context) {
        if (Build.VERSION.SDK_INT >= 33) {
            return ContextCompat.checkSelfPermission(context, "android.permission.POST_NOTIFICATIONS")
                    == PackageManager.PERMISSION_GRANTED;
        }
        return true;
    }
}
