package com.example.radiobutton;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    private RadioGroup radioGroup;
    Button submit, clear;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        submit = (Button)findViewById(R.id.submit);
        clear = (Button)findViewById(R.id.clear);
        radioGroup = (RadioGroup)findViewById(R.id.groupradio);


        radioGroup.clearCheck();

        radioGroup.setOnCheckedChangeListener(
                new RadioGroup
                        .OnCheckedChangeListener() {
                    @Override

                    public void onCheckedChanged(RadioGroup group,
                                                 int checkedId)
                    {

                        RadioButton
                                radioButton
                                = (RadioButton)group
                                .findViewById(checkedId);
                    }
                });

        submit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v)
            {

                int selectedId = radioGroup.getCheckedRadioButtonId();
                if (selectedId == -1) {
                    Toast.makeText(MainActivity.this,
                                    "Mitään ei ole valittuna",
                                    Toast.LENGTH_SHORT)
                            .show();
                }
                else {

                    RadioButton radioButton
                            = (RadioButton)radioGroup
                            .findViewById(selectedId);

                    Toast.makeText(MainActivity.this,
                                    radioButton.getText(),
                                    Toast.LENGTH_SHORT)
                            .show();
                }
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v)
            {
                radioGroup.clearCheck();
            }
        });
    }
}
