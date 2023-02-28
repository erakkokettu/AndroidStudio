package com.example.checkboxthing;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    CheckBox ch, ch1, ch2, ch3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Binding MainActivity.java with activity_main.xml file
        setContentView(R.layout.activity_main);

        // Finding CheckBox by its unique ID
        ch=(CheckBox)findViewById(R.id.checkBox);
        ch1=(CheckBox)findViewById(R.id.checkBox2);
        ch2=(CheckBox)findViewById(R.id.checkBox3);
        ch3=(CheckBox)findViewById(R.id.checkBox4);
    }

    // This function is invoked when the button is pressed.
    public void Check(View v)
    {
        String msg="";

        // Concatenation of the checked options in if

        // isChecked() is used to check whether
        // the CheckBox is in true state or not.

        if(ch.isChecked())
            msg = msg + " Ratsastus ";
        if(ch1.isChecked())
            msg = msg + " Koodaus ";
        if(ch2.isChecked())
            msg = msg + " Laulu ";
        if(ch3.isChecked())
            msg = msg + " Lenkkeily ";

        // Toast is created to display the
        // message using show() method.
        Toast.makeText(this, msg + "on valittu",
                Toast.LENGTH_LONG).show();
    }
}