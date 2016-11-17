package com.example.appdev;

import android.app.Activity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends Activity implements OnClickListener {

	Button bn;
		
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      
        bn= (Button) findViewById(R.id.bn);
        
        bn.setOnClickListener(this);

		
        }

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		Intent i = new Intent (this, Seite2.class);
		EditText et1= (EditText)findViewById(R.id.textfeld);
		String inhalt = et1.getText().toString();
		i.putExtra("key", inhalt);
		startActivity(i);
		
	}
    }

