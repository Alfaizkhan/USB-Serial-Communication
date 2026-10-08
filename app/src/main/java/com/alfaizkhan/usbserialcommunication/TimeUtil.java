package com.alfaizkhan.usbserialcommunication;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public final class TimeUtil {
    private static final SimpleDateFormat TIME_FORMAT = new SimpleDateFormat("HH:mm:ss.SSS", Locale.US);

    private TimeUtil() {}

    public static synchronized String formatCurrentTime() {
        return TIME_FORMAT.format(new Date());
    }

    public static synchronized String formatTimestamp(long millis) {
        return TIME_FORMAT.format(new Date(millis));
    }
}
