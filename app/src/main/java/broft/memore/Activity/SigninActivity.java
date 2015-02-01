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
                //��� ��ư�� ������
            	//�ٽ� �α��� ȭ������ ���ư���
            	Toast.makeText(getApplicationContext(), "��ҵǾ����!", 2000).show();
            	startActivity(new Intent(getApplicationContext(),
            						LoginActivity.class));
            }
        });
		
		RegisterButton = (Button) findViewById(R.id.Register);
		RegisterButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
            	//ȸ�������� ������
            	//�ٽ� �α��� ȭ������ ���ư���
            	//���⿣ �Ƹ� �Է��� ������ DB�� �����ϴ� �ڵ尡 �����ҵ�!
            	Toast.makeText(getApplicationContext(), "ȸ�������� �Ǿ����!", 2000).show();
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
