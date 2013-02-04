package com.example.hellorapsmith;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity
{
	public final static String EXTRA_MESSAGE = "com.example.hellorapsmith.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
    /** Called when the user clicks the Send button */
    public void sendMessage(View view)
    {
    	CheckBox newActivity = (CheckBox)findViewById(R.id.check_newactivity);
    	EditText messageEdit = (EditText)findViewById(R.id.edit_message);
    	String message = messageEdit.getText().toString();
    	
    	if (newActivity.isChecked())
    	{
        	Intent intent = new Intent(this, DisplayMessageActivity.class);
        	intent.putExtra(EXTRA_MESSAGE, message);
        	startActivity(intent);
    	}
    	else
    	{
    		TextView messageView = (TextView)findViewById(R.id.text_message);
    		messageView.setText(message);
    	}
    }
}
