package com.example.autocompletetextview;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends Activity {

    String[] countries={"India","Australia","West indies","indonesia","Indiana",
            "South Africa","England","Bangladesh","Srilanka","singapore"};

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,countries);
        AutoCompleteTextView textView=(AutoCompleteTextView)findViewById(R.id.txtcountries);
        textView.setThreshold(3);
        textView.setAdapter(adapter);
    }
}