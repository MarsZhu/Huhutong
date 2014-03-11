package com.huhutong;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.huhutong.ui.MainActivity;

public class SplashActivity extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash);
		Intent intent =new Intent();
		intent.setClass(this,MainActivity.class);
		startActivity(intent);
		this.finish();
		
	}
   
}
