package com.njit.frameanimation;

import android.app.Activity;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.MessageQueue;
import android.widget.TextView;

public class MainActivity extends Activity
{

	private AnimationDrawable drawable;
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		TextView textView = (TextView) findViewById(R.id.textView);
		textView.setBackgroundResource(R.drawable.frame);
		drawable = (AnimationDrawable)textView.getBackground();
		
		getMainLooper().myQueue().addIdleHandler(new MessageQueue.IdleHandler()
		{

			@Override
			public boolean queueIdle()
			{
				drawable.start();
				return false;
			}
			
		});
	}
}
