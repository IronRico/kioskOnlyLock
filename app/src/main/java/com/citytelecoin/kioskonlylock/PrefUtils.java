package com.citytelecoin.kioskonlylock;

/**
 * Created by carlosp on 11/8/17.
 */
/**
 * Created by carlosp on 11/2/17.
 */

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;


public class PrefUtils {
    private static final String PREF_KIOSK_MODE = "pref_kiosk_mode";


    public static boolean isKioskModeActive(final Context context) {
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(context);
        return sp.getBoolean(PREF_KIOSK_MODE, false);
    }

    public static void setKioskModeActive(final boolean active, final Context context) {
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(context);
        sp.edit().putBoolean(PREF_KIOSK_MODE, active).commit();
    }
}