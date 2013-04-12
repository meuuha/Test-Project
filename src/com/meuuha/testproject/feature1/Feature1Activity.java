package com.meuuha.testproject.feature1;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;

import com.meuuha.testproject.R;

public class Feature1Activity extends Activity implements OnClickListener{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.feature1_screen);
		
		findViewById(R.id.feature1_button1).setOnClickListener(this);
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
			case R.id.feature1_button1:
				Toast.makeText(this, "feature 1 - button 1", Toast.LENGTH_SHORT).show();
				break;
		}
	}

}
