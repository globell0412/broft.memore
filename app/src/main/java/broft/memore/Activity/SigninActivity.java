package com.example.broft.memore.Activity;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SigninActivity extends ActionBarActivity {
	
	Button CancelButton;
	Button RegisterButton;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_signin);
		
		CancelButton = (Button) findViewById(R.id.Cancel01);
		CancelButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //취소 버튼이 눌리고
            	//다시 로그인 화면으로 돌아가기
            	Toast.makeText(getApplicationContext(), "취소되었어요!", 2000).show();
            	startActivity(new Intent(getApplicationContext(),
            						LoginActivity.class));
            }
        });
		
		RegisterButton = (Button) findViewById(R.id.Register);
		RegisterButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
            	//회원가입이 끝나고
            	//다시 로그인 화면으로 돌아가기
            	//여기엔 아마 입력한 정보를 DB에 저장하는 코드가 존재할듯!
            	Toast.makeText(getApplicationContext(), "회원가입이 되었어요!", 2000).show();
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
