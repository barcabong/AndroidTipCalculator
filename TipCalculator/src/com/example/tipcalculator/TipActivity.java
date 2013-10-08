package com.example.tipcalculator;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.Menu;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class TipActivity extends Activity {
	EditText editItem;
	String tipValue;
	TextView tipAmount;
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tip);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.tip, menu);
        return true;
    }
    
    public void onTenPercentClick(View v) {
    	editItem = (EditText) findViewById(R.id.editText1);
    	tipValue = calculateTip(editItem.getText().toString(), 0.1);
    	tipAmount = (TextView) findViewById(R.id.textView2);
    	tipAmount.setText(tipValue);
    }
    
    public void onFifteenPercentClick(View v) {
    	editItem = (EditText) findViewById(R.id.editText1);
    	tipValue = calculateTip(editItem.getText().toString(), 0.15);
    	tipAmount = (TextView) findViewById(R.id.textView2);
    	tipAmount.setText(tipValue);
    }
    
    public void onTwentyPercentClick(View v) {
    	editItem = (EditText) findViewById(R.id.editText1);
    	tipValue = calculateTip(editItem.getText().toString(), 0.2);
    	tipAmount = (TextView) findViewById(R.id.textView2);
    	tipAmount.setText(tipValue);
    }
    
    String calculateTip(String text, double tip) {
    	if (text == null || text.isEmpty()) {
    		return new String ("0.0");
    	}
		return Double.toString(Double.parseDouble(text) * tip);    	
    }
}
