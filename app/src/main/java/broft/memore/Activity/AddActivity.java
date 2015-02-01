package com.example.broft.memore.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AddActivity extends ActionBarActivity {
	
	Button AddforMeButton;
	Button RejectButton;
	Button AddRequestButton;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_add);
		
		AddforMeButton = (Button) findViewById(R.id.AddforMe);
		AddforMeButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //내 친구 목록에 추가하기
            	Toast.makeText(getApplicationContext(), "추가되었습니다!", 2000).show();
            	//친구추가 목록에서 지우기
            }
        });
		
		RejectButton = (Button) findViewById(R.id.Reject);
		RejectButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
            	Toast.makeText(getApplicationContext(), "거절되었습니다!", 2000).show();
            	//친구추가 목록에서 지우기
            }
        });
		
		AddRequestButton = (Button) findViewById(R.id.AddRequest);
		AddRequestButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
            	//상대에게 친구추가 요청하기
            	Toast.makeText(getApplicationContext(), "요청되었습니다!", 2000).show();
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
