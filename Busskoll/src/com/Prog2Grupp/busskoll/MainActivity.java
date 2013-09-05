package com.Prog2Grupp.busskoll;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.Window;
import android.widget.Button;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends Activity {
	Button button;
	Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
    	requestWindowFeature(Window.FEATURE_NO_TITLE);
    	super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton();
    }

    public void addListenerOnButton() {
    	 
		final Context context = this;
 
		button = (Button) findViewById(R.id.button1);
		button2= (Button) findViewById(R.id.button2);
 
		button.setOnClickListener(new OnClickListener() {
 
			@Override
			public void onClick(View arg0) {
 
			    Intent intent = new Intent(context, tabellactivity.class);
                            startActivity(intent);   
 
			}
			
 
		});
		button2.setOnClickListener(new OnClickListener() {
			 
			@Override
			public void onClick(View arg0) {
 
			    Intent intent2 = new Intent(context, trackabuss.class);
                            startActivity(intent2);   
 
			}
			
 
		});
		 
	}
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
