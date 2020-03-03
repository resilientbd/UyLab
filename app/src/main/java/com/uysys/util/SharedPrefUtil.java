package com.uysys.util;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPrefUtil {
    public static final String DEFAULT_NAME = "ujala_pref";

    public static void ADD_PREFERENCE(Context context, String name, String value) {

        SharedPreferences pref = context.getSharedPreferences(DEFAULT_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        editor.putString(name, value);
        editor.commit();
    }

    public static void CLEAR_PREFERENCE(Context context) {

        SharedPreferences pref = context.getSharedPreferences(DEFAULT_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        editor.clear();
        editor.commit();
    }

    public static String GET_PREFERENCE(Context context, String name) {
        SharedPreferences pref = context.getSharedPreferences(DEFAULT_NAME, Context.MODE_PRIVATE);
        String value = pref.getString(name, "");
        return value;
    }

}
