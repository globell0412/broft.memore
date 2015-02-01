package com.example.broft.memore.Activity;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class LoginActivity extends ActionBarActivity {
	
	Button LoginButton;
	Button SigninButton;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		
		LoginButton = (Button) findViewById(R.id.Login);
		LoginButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
            	boolean correct = true;
                //DB�� ���Ͽ� �Է��� ID�� PW�� ��ġ�ϴ°� �߰��ϱ�
            	if(correct == true){
            		startActivity(new Intent(getApplicationContext(),
    					MainActivity.class));
            		finish();
            	}
            	if(correct == false){
            		Toast.makeText(getApplicationContext(), "��й�ȣ�� Ʋ�Ƚ��ϴ�.", 2000).show();
            		//���� ID�� �Է��ߴ���
            		//ID�� ��й�ȣ�� ��ġ������ �����ϸ� ������?
            	}
            }
        });
		
		SigninButton = (Button) findViewById(R.id.Signin);
		SigninButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),
                					SigninActivity.class));
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
