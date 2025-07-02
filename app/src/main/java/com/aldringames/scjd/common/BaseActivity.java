package com.aldringames.scjd.common;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import com.aldringames.scjd.App;
import com.aldringames.scjd.BuildConfig;

public class BaseActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		overridePendingTransition(0, 0);
		if (BuildConfig.DEBUG) {
			App.enableStrictMode();
		}
		
		View mDecorView = getWindow().getDecorView();
		mDecorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE
										 | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
										 | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
										 | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
										 | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
	}
	
}
