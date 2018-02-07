package com.example.mitchellkane.assignment2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;
import android.widget.*;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /* Here is where I need to update my onclick action */
    public void updateText(View myView){
        TextView starting = (TextView) findViewById(R.id.textView);
        EditText updated = (EditText) findViewById(R.id.editText);

        Validator v = new Validator();
        int value = v.validate(updated.getText().toString());
        String s = "Your password strength is: ";
        s += Integer.toString(value);
        s += " out of 5.";
        // issues are with this line here
        starting.setText(s);
        //starting.setText(v.validate(updated.getText().toString()));
        //starting.setText(updated.getText().toString());
    }
}
