package com.example.tipcalculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	private EditText editText1;
	
	private EditText editText2;
	private TextView outputTextView;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		editText1 = (EditText) findViewById(R.id.editText1);
		//editText2 = (EditText) findViewById(R.id.editText2);
		outputTextView = (TextView) findViewById(R.id.output); //initialize the textview getting a reference
		
	}
	
	
	
	public void on10(View v) {
		
		//Button b1 = (Button) findViewById(R.id.button1);
		
		   String total = editText1.getText().toString();
		   double tip =0.1*Double.parseDouble(total);
		   outputTextView.setText("tip is $" + String.valueOf(tip));
		   
	   //fire when button pressed
	}
	
		   public void on15(View v) {
			   String total = editText1.getText().toString();
			   double tip=0.15*Double.parseDouble(total);
			   editText2.setText("tip is $" + String.valueOf(tip));
		   //fire when button pressed
		   }
			   public void on20(View v) {
				   String total = editText1.getText().toString();
				   double tip=0.20*Double.parseDouble(total);
				   editText2.setText("tip is $" + String.valueOf(tip));
			   //fire when button pressed
			   }

			   
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	
			
}
