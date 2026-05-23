package com.hab;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

@CapacitorPlugin(name = "HabWidget")
public class HabWidgetPlugin extends Plugin {

    @PluginMethod
    public void updateWidgetData(PluginCall call) {
        String title = call.getString("title", "Novice Tracker");
        int level = call.getInt("level", 1);
        int progress = call.getInt("progress", 0);
        int completedCount = call.getInt("completedCount", 0);
        int totalCount = call.getInt("totalCount", 0);
        String nextHabit = call.getString("nextHabit", "None");

        Context context = getContext();
        SharedPreferences pref = context.getSharedPreferences("HabWidgetPrefs", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        editor.putString("title", title);
        editor.putInt("level", level);
        editor.putInt("progress", progress);
        editor.putInt("completedCount", completedCount);
        editor.putInt("totalCount", totalCount);
        editor.putString("nextHabit", nextHabit);
        editor.apply();

        // Broadcast to trigger AppWidgetProvider to redraw the homescreen widget
        try {
            Intent intent = new Intent(context, HabWidgetProvider.class);
            intent.setAction(AppWidgetManager.ACTION_APPWIDGET_UPDATE);
            int[] ids = AppWidgetManager.getInstance(context).getAppWidgetIds(
                new ComponentName(context, HabWidgetProvider.class)
            );
            intent.putExtra(AppWidgetManager.EXTRA_APPWIDGET_IDS, ids);
            context.sendBroadcast(intent);
        } catch (Exception e) {
            e.printStackTrace();
        }

        call.resolve();
    }
}
