package com.example.broft.memore.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends ActionBarActivity {
	
	Button AddButton;
	Button ProfileButton;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		AddButton = (Button) findViewById(R.id.Add);
		AddButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //친구 추가하는 창으로 넘어가기
            	startActivity(new Intent(getApplicationContext(),
    					AddActivity.class));
            }
        });
		
		ProfileButton = (Button) findViewById(R.id.Profile);
		ProfileButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //프로필 화면으로 넘어가기
            	startActivity(new Intent(getApplicationContext(),
    					ProfileActivity.class));
            }
        });
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
