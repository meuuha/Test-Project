package com.meuuha.testproject;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;

public class MainScreenActivity extends Activity implements OnClickListener{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_screen);
		
		findViewById(R.id.button1).setOnClickListener(this);
		findViewById(R.id.button2).setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main_screen, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
			case R.id.button1:
				Toast.makeText(this, "button click 1", Toast.LENGTH_SHORT).show();
				break;
			case R.id.button2:
				Toast.makeText(this, "button click 2", Toast.LENGTH_SHORT).show();
				break;
		}
	}

}
