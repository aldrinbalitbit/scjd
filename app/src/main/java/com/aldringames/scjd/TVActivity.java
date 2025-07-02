package com.aldringames.scjd;

import android.graphics.*;
import android.media.*;
import android.net.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import com.aldringames.scjd.common.*;
import java.util.*;

public class TVActivity extends BaseActivity {
	
	private VideoView video;
	private Random random = new Random();
	private PopupWindow popupWindow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
		LinearLayout layout = new LinearLayout(this);
		layout.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT));
		layout.setGravity(Gravity.CENTER);
		video = new VideoView(this);
		video.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT));
		video.setMediaController(new MediaController(this));
		layout.addView(video);
		setContentView(layout);
    }
	
	private void startIntro() {
		video.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.intro));
		video.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
			@Override
			public void onCompletion(MediaPlayer mp) {
				startShow();
			}
		});
		video.start();
	}
	
	private void startSpongeBobSquarePants() {
		int side = new Random().nextInt(7);
		if (side == 0) {
			SBSP92101010101start();
		} else if (side == 1) {
			SBSP10101010101start();
		} else if (side == 2) {
			SBSP1561010101start();
		} else if (side == 3) {
			SBSP221010101start();
		} else if (side == 4) {
			SBSP3210101start();
		} else if (side == 5) {
			SBSP32221start();
		} else {
			SBSP59final();
		}
	}
	
	private void SBSP92101010101start() {
		video.setVideoURI(Uri.parse("https://ww.megacartoons.net/video/" + Titles.SpongeBobSquarePants.NAME + "-" + Titles.SpongeBobSquarePants.EPISODES.MINS8[random.nextInt(Titles.SpongeBobSquarePants.EPISODES.MINS8.length)] + ".mp4"));
		video.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
				@Override
				public void onCompletion(MediaPlayer mp) {
					SBSP82101010101next();
				}
			});
		video.start();
	}

	private void SBSP82101010101next() {
		video.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.intro));
		video.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
				@Override
				public void onCompletion(MediaPlayer mp) {
					SBSP82101010102start();
				}
			});
		video.start();
	}
	
	private void SBSP82101010102start() {
		video.setVideoURI(Uri.parse("https://ww.megacartoons.net/video/" + Titles.SpongeBobSquarePants.NAME + "-" + Titles.SpongeBobSquarePants.EPISODES.MINS2[random.nextInt(Titles.SpongeBobSquarePants.EPISODES.MINS2.length)] + ".mp4"));
		video.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
			@Override
			public void onCompletion(MediaPlayer mp) {
				SBSP82101010102next();
			}
		});
		video.start();
	}
	
	private void SBSP82101010102next() {
		video.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.intro));
		video.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
			@Override
			public void onCompletion(MediaPlayer mp) {
				SBSP82101010103start();
			}
		});
		video.start();
	}
	
	private void SBSP82101010103start() {
		video.setVideoURI(Uri.parse("https://ww.megacartoons.net/video/" + Titles.SpongeBobSquarePants.NAME + "-" + Titles.SpongeBobSquarePants.EPISODES.MINS10[random.nextInt(Titles.SpongeBobSquarePants.EPISODES.MINS10.length)] + ".mp4"));
		video.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
			@Override
			public void onCompletion(MediaPlayer mp) {
				SBSP82101010103next();
			}
		});
		video.start();
	}
	
	private void SBSP82101010103next() {
		video.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.intro));
		video.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
			@Override
			public void onCompletion(MediaPlayer mp) {
				SBSP82101010104start();
			}
		});
		video.start();
	}
	
	private void SBSP82101010104start() {
		video.setVideoURI(Uri.parse("https://ww.megacartoons.net/video/" + Titles.SpongeBobSquarePants.NAME + "-" + Titles.SpongeBobSquarePants.EPISODES.MINS10[random.nextInt(Titles.SpongeBobSquarePants.EPISODES.MINS10.length)] + ".mp4"));
		video.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
			@Override
			public void onCompletion(MediaPlayer mp) {
				SBSP82101010104next();
			}
		});
		video.start();
	}

	private void SBSP82101010104next() {
		video.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.intro));
		video.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
			@Override
			public void onCompletion(MediaPlayer mp) {
				SBSP82101010105start();
			}
		});
		video.start();
	}

	private void SBSP82101010105start() {
		video.setVideoURI(Uri.parse("https://ww.megacartoons.net/video/" + Titles.SpongeBobSquarePants.NAME + "-" + Titles.SpongeBobSquarePants.EPISODES.MINS10[random.nextInt(Titles.SpongeBobSquarePants.EPISODES.MINS10.length)] + ".mp4"));
		video.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
			@Override
			public void onCompletion(MediaPlayer mp) {
				SBSP82101010105next();
			}
		});
		video.start();
	}

	private void SBSP82101010105next() {
		video.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.intro));
		video.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
			@Override
			public void onCompletion(MediaPlayer mp) {
				SBSP82101010106final();
			}
		});
		video.start();
	}
	
	private void SBSP82101010106final() {
		video.setVideoURI(Uri.parse("https://ww.megacartoons.net/video/" + Titles.SpongeBobSquarePants.NAME + "-" + Titles.SpongeBobSquarePants.EPISODES.MINS10[random.nextInt(Titles.SpongeBobSquarePants.EPISODES.MINS10.length)] + ".mp4"));
		video.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
			@Override
			public void onCompletion(MediaPlayer mp) {
				startIntro();
			}
		});
		video.start();
	}
	
	private void SBSP10101010101start() {
		video.setVideoURI(Uri.parse("https://ww.megacartoons.net/video/" + Titles.SpongeBobSquarePants.NAME + "-" + Titles.SpongeBobSquarePants.EPISODES.MINS10[random.nextInt(Titles.SpongeBobSquarePants.EPISODES.MINS10.length)] + ".mp4"));
		video.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
				@Override
				public void onCompletion(MediaPlayer mp) {
					SBSP10101010101next();
				}
			});
		video.start();
	}

	private void SBSP10101010101next() {
		video.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.intro));
		video.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
				@Override
				public void onCompletion(MediaPlayer mp) {
					SBSP10101010102start();
				}
			});
		video.start();
	}

	private void SBSP10101010102start() {
		video.setVideoURI(Uri.parse("https://ww.megacartoons.net/video/" + Titles.SpongeBobSquarePants.NAME + "-" + Titles.SpongeBobSquarePants.EPISODES.MINS10[random.nextInt(Titles.SpongeBobSquarePants.EPISODES.MINS10.length)] + ".mp4"));
		video.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
				@Override
				public void onCompletion(MediaPlayer mp) {
					SBSP10101010102next();
				}
			});
		video.start();
	}

	private void SBSP10101010102next() {
		video.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.intro));
		video.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
				@Override
				public void onCompletion(MediaPlayer mp) {
					SBSP10101010103start();
				}
			});
		video.start();
	}

	private void SBSP10101010103start() {
		video.setVideoURI(Uri.parse("https://ww.megacartoons.net/video/" + Titles.SpongeBobSquarePants.NAME + "-" + Titles.SpongeBobSquarePants.EPISODES.MINS10[random.nextInt(Titles.SpongeBobSquarePants.EPISODES.MINS10.length)] + ".mp4"));
		video.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
				@Override
				public void onCompletion(MediaPlayer mp) {
					SBSP10101010103next();
				}
			});
		video.start();
	}

	private void SBSP10101010103next() {
		video.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.intro));
		video.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
				@Override
				public void onCompletion(MediaPlayer mp) {
					SBSP10101010104start();
				}
			});
		video.start();
	}

	private void SBSP10101010104start() {
		video.setVideoURI(Uri.parse("https://ww.megacartoons.net/video/" + Titles.SpongeBobSquarePants.NAME + "-" + Titles.SpongeBobSquarePants.EPISODES.MINS10[random.nextInt(Titles.SpongeBobSquarePants.EPISODES.MINS10.length)] + ".mp4"));
		video.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
				@Override
				public void onCompletion(MediaPlayer mp) {
					SBSP10101010104next();
				}
			});
		video.start();
	}

	private void SBSP10101010104next() {
		video.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.intro));
		video.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
				@Override
				public void onCompletion(MediaPlayer mp) {
					SBSP10101010105final();
				}
			});
		video.start();
	}

	private void SBSP10101010105final() {
		video.setVideoURI(Uri.parse("https://ww.megacartoons.net/video/" + Titles.SpongeBobSquarePants.NAME + "-" + Titles.SpongeBobSquarePants.EPISODES.MINS10[random.nextInt(Titles.SpongeBobSquarePants.EPISODES.MINS10.length)] + ".mp4"));
		video.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
				@Override
				public void onCompletion(MediaPlayer mp) {
					startIntro();
				}
			});
		video.start();
	}
	
	private void SBSP1561010101start() {
		video.setVideoURI(Uri.parse("https://ww.megacartoons.net/video/" + Titles.SpongeBobSquarePants.NAME + "-" + Titles.SpongeBobSquarePants.EPISODES.MINS15[random.nextInt(Titles.SpongeBobSquarePants.EPISODES.MINS15.length)] + ".mp4"));
		video.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
				@Override
				public void onCompletion(MediaPlayer mp) {
					SBSP1561010101next();
				}
			});
		video.start();
	}

	private void SBSP1561010101next() {
		video.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.intro));
		video.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
				@Override
				public void onCompletion(MediaPlayer mp) {
					SBSP1561010102start();
				}
			});
		video.start();
	}

	private void SBSP1561010102start() {
		video.setVideoURI(Uri.parse("https://ww.megacartoons.net/video/" + Titles.SpongeBobSquarePants.NAME + "-" + Titles.SpongeBobSquarePants.EPISODES.MINS6[random.nextInt(Titles.SpongeBobSquarePants.EPISODES.MINS6.length)] + ".mp4"));
		video.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
				@Override
				public void onCompletion(MediaPlayer mp) {
					SBSP1561010102next();
				}
			});
		video.start();
	}

	private void SBSP1561010102next() {
		video.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.intro));
		video.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
				@Override
				public void onCompletion(MediaPlayer mp) {
					SBSP1561010103start();
				}
			});
		video.start();
	}

	private void SBSP1561010103start() {
		video.setVideoURI(Uri.parse("https://ww.megacartoons.net/video/" + Titles.SpongeBobSquarePants.NAME + "-" + Titles.SpongeBobSquarePants.EPISODES.MINS10[random.nextInt(Titles.SpongeBobSquarePants.EPISODES.MINS10.length)] + ".mp4"));
		video.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
				@Override
				public void onCompletion(MediaPlayer mp) {
					SBSP1561010103next();
				}
			});
		video.start();
	}

	private void SBSP1561010103next() {
		video.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.intro));
		video.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
				@Override
				public void onCompletion(MediaPlayer mp) {
					SBSP1561010104start();
				}
			});
		video.start();
	}

	private void SBSP1561010104start() {
		video.setVideoURI(Uri.parse("https://ww.megacartoons.net/video/" + Titles.SpongeBobSquarePants.NAME + "-" + Titles.SpongeBobSquarePants.EPISODES.MINS10[random.nextInt(Titles.SpongeBobSquarePants.EPISODES.MINS10.length)] + ".mp4"));
		video.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
				@Override
				public void onCompletion(MediaPlayer mp) {
					SBSP1561010104next();
				}
			});
		video.start();
	}

	private void SBSP1561010104next() {
		video.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.intro));
		video.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
				@Override
				public void onCompletion(MediaPlayer mp) {
					SBSP1561010105final();
				}
			});
		video.start();
	}

	private void SBSP1561010105final() {
		video.setVideoURI(Uri.parse("https://ww.megacartoons.net/video/" + Titles.SpongeBobSquarePants.NAME + "-" + Titles.SpongeBobSquarePants.EPISODES.MINS10[random.nextInt(Titles.SpongeBobSquarePants.EPISODES.MINS10.length)] + ".mp4"));
		video.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
				@Override
				public void onCompletion(MediaPlayer mp) {
					startIntro();
				}
			});
		video.start();
	}
	
	private void SBSP221010101start() {
		video.setVideoURI(Uri.parse("https://ww.megacartoons.net/video/" + Titles.SpongeBobSquarePants.NAME + "-" + Titles.SpongeBobSquarePants.EPISODES.MINS22[random.nextInt(Titles.SpongeBobSquarePants.EPISODES.MINS22.length)] + ".mp4"));
		video.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
				@Override
				public void onCompletion(MediaPlayer mp) {
					SBSP221010101next();
				}
			});
		video.start();
	}

	private void SBSP221010101next() {
		video.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.intro));
		video.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
				@Override
				public void onCompletion(MediaPlayer mp) {
					SBSP221010102start();
				}
			});
		video.start();
	}

	private void SBSP221010102start() {
		video.setVideoURI(Uri.parse("https://ww.megacartoons.net/video/" + Titles.SpongeBobSquarePants.NAME + "-" + Titles.SpongeBobSquarePants.EPISODES.MINS10[random.nextInt(Titles.SpongeBobSquarePants.EPISODES.MINS10.length)] + ".mp4"));
		video.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
				@Override
				public void onCompletion(MediaPlayer mp) {
					SBSP221010102next();
				}
			});
		video.start();
	}

	private void SBSP221010102next() {
		video.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.intro));
		video.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
				@Override
				public void onCompletion(MediaPlayer mp) {
					SBSP221010103start();
				}
			});
		video.start();
	}

	private void SBSP221010103start() {
		video.setVideoURI(Uri.parse("https://ww.megacartoons.net/video/" + Titles.SpongeBobSquarePants.NAME + "-" + Titles.SpongeBobSquarePants.EPISODES.MINS10[random.nextInt(Titles.SpongeBobSquarePants.EPISODES.MINS10.length)] + ".mp4"));
		video.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
				@Override
				public void onCompletion(MediaPlayer mp) {
					SBSP221010103next();
				}
			});
		video.start();
	}

	private void SBSP221010103next() {
		video.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.intro));
		video.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
				@Override
				public void onCompletion(MediaPlayer mp) {
					SBSP221010104final();
				}
			});
		video.start();
	}

	private void SBSP221010104final() {
		video.setVideoURI(Uri.parse("https://ww.megacartoons.net/video/" + Titles.SpongeBobSquarePants.NAME + "-" + Titles.SpongeBobSquarePants.EPISODES.MINS10[random.nextInt(Titles.SpongeBobSquarePants.EPISODES.MINS10.length)] + ".mp4"));
		video.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
				@Override
				public void onCompletion(MediaPlayer mp) {
					startIntro();
				}
			});
		video.start();
	}
	
	private void SBSP3210101start() {
		video.setVideoURI(Uri.parse("https://ww.megacartoons.net/video/" + Titles.SpongeBobSquarePants.NAME + "-" + Titles.SpongeBobSquarePants.EPISODES.MINS32[random.nextInt(Titles.SpongeBobSquarePants.EPISODES.MINS32.length)] + ".mp4"));
		video.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
				@Override
				public void onCompletion(MediaPlayer mp) {
					SBSP3210101next();
				}
			});
		video.start();
	}

	private void SBSP3210101next() {
		video.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.intro));
		video.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
				@Override
				public void onCompletion(MediaPlayer mp) {
					SBSP3210102start();
				}
			});
		video.start();
	}

	private void SBSP3210102start() {
		video.setVideoURI(Uri.parse("https://ww.megacartoons.net/video/" + Titles.SpongeBobSquarePants.NAME + "-" + Titles.SpongeBobSquarePants.EPISODES.MINS10[random.nextInt(Titles.SpongeBobSquarePants.EPISODES.MINS10.length)] + ".mp4"));
		video.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
				@Override
				public void onCompletion(MediaPlayer mp) {
					SBSP3210102next();
				}
			});
		video.start();
	}

	private void SBSP3210102next() {
		video.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.intro));
		video.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
				@Override
				public void onCompletion(MediaPlayer mp) {
					SBSP3210103final();
				}
			});
		video.start();
	}

	private void SBSP3210103final() {
		video.setVideoURI(Uri.parse("https://ww.megacartoons.net/video/" + Titles.SpongeBobSquarePants.NAME + "-" + Titles.SpongeBobSquarePants.EPISODES.MINS10[random.nextInt(Titles.SpongeBobSquarePants.EPISODES.MINS10.length)] + ".mp4"));
		video.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
				@Override
				public void onCompletion(MediaPlayer mp) {
					startIntro();
				}
			});
		video.start();
	}
	
	private void SBSP32221start() {
		video.setVideoURI(Uri.parse("https://ww.megacartoons.net/video/" + Titles.SpongeBobSquarePants.NAME + "-" + Titles.SpongeBobSquarePants.EPISODES.MINS32[random.nextInt(Titles.SpongeBobSquarePants.EPISODES.MINS32.length)] + ".mp4"));
		video.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
				@Override
				public void onCompletion(MediaPlayer mp) {
					SBSP32221next();
				}
			});
		video.start();
	}

	private void SBSP32221next() {
		video.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.intro));
		video.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
				@Override
				public void onCompletion(MediaPlayer mp) {
					SBSP32222final();
				}
			});
		video.start();
	}

	private void SBSP32222final() {
		video.setVideoURI(Uri.parse("https://ww.megacartoons.net/video/" + Titles.SpongeBobSquarePants.NAME + "-" + Titles.SpongeBobSquarePants.EPISODES.MINS22[random.nextInt(Titles.SpongeBobSquarePants.EPISODES.MINS22.length)] + ".mp4"));
		video.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
				@Override
				public void onCompletion(MediaPlayer mp) {
					startIntro();
				}
			});
		video.start();
	}
	
	private void SBSP59final() {
		video.setVideoURI(Uri.parse("https://ww.megacartoons.net/video/" + Titles.SpongeBobSquarePants.NAME + "-" + Titles.SpongeBobSquarePants.EPISODES.MINS59[random.nextInt(Titles.SpongeBobSquarePants.EPISODES.MINS59.length)] + ".mp4"));
		video.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
				@Override
				public void onCompletion(MediaPlayer mp) {
					startIntro();
				}
			});
		video.start();
	}
	
	private void startCourageTheCowardlyDog() {
		/* int side = random.nextInt(2);
		if (side == 0) { */
			CTCC10101010101start();
		/* } else {
			CTCC211010101start();
		} */
	}
	
	private void CTCC10101010101start() {
		video.setVideoURI(Uri.parse("https://ww.megacartoons.net/video/" + Titles.SpongeBobSquarePants.NAME + "-" + Titles.SpongeBobSquarePants.EPISODES.MINS10[random.nextInt(Titles.SpongeBobSquarePants.EPISODES.MINS10.length)] + ".mp4"));
		video.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
				@Override
				public void onCompletion(MediaPlayer mp) {
					CTCC10101010101next();
				}
			});
		video.start();
	}

	private void CTCC10101010101next() {
		video.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.intro));
		video.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
				@Override
				public void onCompletion(MediaPlayer mp) {
					CTCC10101010102start();
				}
			});
		video.start();
	}

	private void CTCC10101010102start() {
		video.setVideoURI(Uri.parse("https://ww.megacartoons.net/video/" + Titles.SpongeBobSquarePants.NAME + "-" + Titles.SpongeBobSquarePants.EPISODES.MINS10[random.nextInt(Titles.SpongeBobSquarePants.EPISODES.MINS10.length)] + ".mp4"));
		video.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
				@Override
				public void onCompletion(MediaPlayer mp) {
					CTCC10101010102next();
				}
			});
		video.start();
	}

	private void CTCC10101010102next() {
		video.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.intro));
		video.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
				@Override
				public void onCompletion(MediaPlayer mp) {
					CTCC10101010103start();
				}
			});
		video.start();
	}

	private void CTCC10101010103start() {
		video.setVideoURI(Uri.parse("https://ww.megacartoons.net/video/" + Titles.SpongeBobSquarePants.NAME + "-" + Titles.SpongeBobSquarePants.EPISODES.MINS10[random.nextInt(Titles.SpongeBobSquarePants.EPISODES.MINS10.length)] + ".mp4"));
		video.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
				@Override
				public void onCompletion(MediaPlayer mp) {
					CTCC10101010103next();
				}
			});
		video.start();
	}

	private void CTCC10101010103next() {
		video.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.intro));
		video.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
				@Override
				public void onCompletion(MediaPlayer mp) {
					CTCC10101010104start();
				}
			});
		video.start();
	}

	private void CTCC10101010104start() {
		video.setVideoURI(Uri.parse("https://ww.megacartoons.net/video/" + Titles.SpongeBobSquarePants.NAME + "-" + Titles.SpongeBobSquarePants.EPISODES.MINS10[random.nextInt(Titles.SpongeBobSquarePants.EPISODES.MINS10.length)] + ".mp4"));
		video.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
				@Override
				public void onCompletion(MediaPlayer mp) {
					CTCC10101010104next();
				}
			});
		video.start();
	}

	private void CTCC10101010104next() {
		video.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.intro));
		video.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
				@Override
				public void onCompletion(MediaPlayer mp) {
					CTCC10101010105final();
				}
			});
		video.start();
	}

	private void CTCC10101010105final() {
		video.setVideoURI(Uri.parse("https://ww.megacartoons.net/video/" + Titles.SpongeBobSquarePants.NAME + "-" + Titles.SpongeBobSquarePants.EPISODES.MINS10[random.nextInt(Titles.SpongeBobSquarePants.EPISODES.MINS10.length)] + ".mp4"));
		video.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
				@Override
				public void onCompletion(MediaPlayer mp) {
					startIntro();
				}
			});
		video.start();
	}

	private void startShow() {
		int show = new Random().nextInt(2);
		if (show == 0) {
			startSpongeBobSquarePants();
		} else {
			startCourageTheCowardlyDog();
		}
		/*int show = random.nextInt(4);
		if (show == 0) {
			startSpongeBobSquarePants();
		} else if (show == 1) {
			startCourageTheCowardlyDog();
		} else if (show == 2) {
			startJohnnyBravo();
		} else {
			startDextersLaboratory();
		}*/
	}

	@Override
	protected void onStart() {
		super.onStart();
		startIntro();
	}
	
}
