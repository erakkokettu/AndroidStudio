package com.example.spinner;

import android.widget.AdapterView;
import android.view.View;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public abstract class MainActivity
        extends AppCompatActivity
        implements AdapterView.OnItemSelectedListener {

    // create array of Strings
    // and store name of courses
    String[] courses = { "C", "Data structures",
            "Interview prep", "Algorithms",
            "DSA with java", "OS" };

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spino = findViewById(R.id.coursesspinner);
        spin.setOnItemSelectedListener(this);

        ArrayAdapter ad
                = new ArrayAdapter(
                this,
                android.R.layout.simple_spinner_item,
                courses);

        ad.setDropDownViewResource(
                android.R.layout
                        .simple_spinner_dropdown_item);
        spino.setAdapter(ad);
    }

    @Override
    public void onItemSelected(AdapterView<*> arg0,
                               View arg1,
                               int position,
                               long id)
    {

        Toast.makeText(getApplicationContext(),
                        courses[position],
                        Toast.LENGTH_LONG)
                .show();
    }

    @Override
    public void onNothingSelected(AdapterView<*> arg0)
    {
        // Auto-generated method stub
    }
}
