package com.aldringames.scjd;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.VideoView;
import com.aldringames.scjd.common.BaseActivity;
import java.util.Random;

public class MainActivity extends BaseActivity {
	private VideoView video;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
		LinearLayout layout = new LinearLayout(this);
		layout.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT));
		layout.setGravity(Gravity.CENTER);
		video = new VideoView(this);
		video.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT));
		layout.addView(video);
		setContentView(layout);
    }
	
	private void startWelcome() {
		video.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.welcome));
		video.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
				@Override
				public void onCompletion(MediaPlayer mp) {
					Intent intent = new Intent();
					intent.setClass(getApplicationContext(), TVActivity.class);
					startActivity(intent);
					finish();
				}
			});
		video.start();
	}

	@Override
	protected void onStart() {
		super.onStart();
		startWelcome();
	}

	@Override
	public void onBackPressed() {
	}
	
}
