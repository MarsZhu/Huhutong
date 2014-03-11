package com.huhutong.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

import com.huhutong.MapActivity;
import com.huhutong.R;

public class MainActivity extends Activity implements OnClickListener{

	private ImageView comprehensive;
	private ImageView radio;
	private ImageView television;
	private ImageView map;
	private ImageView lottery;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		setupViews();
	}

	private void setupViews() {
		comprehensive=(ImageView) findViewById(R.id.comprehensive);
		radio=(ImageView) findViewById(R.id.radio);
		television=(ImageView) findViewById(R.id.television);
		map=(ImageView) findViewById(R.id.map);
		lottery=(ImageView) findViewById(R.id.lottery);
		comprehensive.setOnClickListener(this);
		radio.setOnClickListener(this);
		television.setOnClickListener(this);
		map.setOnClickListener(this);
		lottery.setOnClickListener(this);
		
	}

	@Override
	public void onClick(View arg0) {
		Intent intent=new Intent();
		switch(arg0.getId()){
		case R.id.comprehensive:
			intent.setClass(this, MainTabActivity.class);
			startActivity(intent);break;
		case R.id.radio:
			intent.setClass(this, RadioActivity.class);
			startActivity(intent);break;
		case R.id.television:
			intent.setClass(this, TelevisionActivity.class);
			startActivity(intent);break;
		case R.id.map:
			intent.setClass(this, MapActivity.class);
			startActivity(intent);break;
		case R.id.lottery:
			intent.setClass(this, LotteryActivity.class);
			startActivity(intent);break;
		}
		
	}

}
