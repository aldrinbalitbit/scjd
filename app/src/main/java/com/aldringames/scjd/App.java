package com.aldringames.scjd;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.StrictMode;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public class App extends Application {
	
	public static boolean isOnline(Context ctx) {
		ConnectivityManager cm = (ConnectivityManager)ctx.getSystemService(Context.CONNECTIVITY_SERVICE);
		NetworkInfo networkInfo = cm.getActiveNetworkInfo();
		return (networkInfo != null && networkInfo.isConnected());
	}
	
	@TargetApi(Build.VERSION_CODES.KITKAT)
    public static void enableStrictMode() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.GINGERBREAD) {
            StrictMode.ThreadPolicy.Builder threadPolicyBuilder =
				new StrictMode.ThreadPolicy.Builder()
				.detectAll()
				.penaltyLog();
            StrictMode.VmPolicy.Builder vmPolicyBuilder =
				new StrictMode.VmPolicy.Builder()
				.detectAll()
				.penaltyLog();

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
                threadPolicyBuilder.penaltyFlashScreen();
                vmPolicyBuilder
				    .setClassInstanceLimit(MainActivity.class, 1)
					.setClassInstanceLimit(TVActivity.class, 1);
            }
            StrictMode.setThreadPolicy(threadPolicyBuilder.build());
            StrictMode.setVmPolicy(vmPolicyBuilder.build());
        }
    }
	
}
