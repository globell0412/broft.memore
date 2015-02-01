package com.example.broft.memore.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ProfileActivity extends ActionBarActivity {
	
	Button PhotoEditButton;
	Button CancelButton;
	Button SaveButton;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_profile);
		
		PhotoEditButton = (Button) findViewById(R.id.PhotoEdit);
		PhotoEditButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //사진 수정하는 화면 띄우기
            	Toast.makeText(getApplicationContext(), "수정되었어요!", 2000).show();
            }
        });
		
		CancelButton = (Button) findViewById(R.id.Cancel02);
		CancelButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
            	Toast.makeText(getApplicationContext(), "취소되었어요!", 2000).show();
            	startActivity(new Intent(getApplicationContext(),
            						MainActivity.class));
            }
        });
		SaveButton = (Button) findViewById(R.id.Save02);
		PhotoEditButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //DB에 저장하는 코드 추가하기
            	Toast.makeText(getApplicationContext(), "저장되었어요!", 2000).show();
            	startActivity(new Intent(getApplicationContext(),
            						LoginActivity.class));
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
