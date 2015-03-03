package com.jaxdepot.activity.lifecycle;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	private TextView statusText;
	private TextView show_hint_text_id;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		statusText = (TextView)findViewById(R.id.show_status_text_id);
		show_hint_text_id = (TextView)findViewById(R.id.show_hint_text_id);
		statusText.setText("Now in On Create"+"\n");
		show_hint_text_id.append("\n"+"\n");
		show_hint_text_id.append("2) If you pressed home button then onPause and onStope will be called onDestroy will be calledonly if system is running out of space" +
				"If you start the app from recent tasklist or from icon the app will starts from onRestart follwed by onStart if and only if onDestroy is not called.");
		mt("On Create");
	}
	
	@Override
	protected void onStart() {
		super.onStart();
		statusText.append("Now in On Start"+"\n");
		mt("On Start");
	}
	
	@Override
	protected void onResume() {
		super.onResume();
		statusText.append("Now in On Resume"+"\n");
		mt("On Resume");
	}
	
	@Override
	protected void onPause() {
		super.onPause();
		statusText.append("Now in On Pause"+"\n");
		mt("On Pause");
	}
	
	@Override
	protected void onStop() {
		super.onStop();
		statusText.append("Now in On Stop"+"\n");
		mt("On Stop");
	}
	
	@Override
	protected void onDestroy() {
		super.onDestroy();
		statusText.append("Now in On Destroy"+"\n");
		mt("On Destroy");
	}
	
	@Override
	protected void onRestart() {
		super.onRestart();
		statusText.append("Now in On Restart"+"\n");
		mt("On Restart");
	}
	private void mt(String text)
	{
		Toast.makeText(this, text, Toast.LENGTH_LONG).show();
	}
}
