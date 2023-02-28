package com.example.timepicker;

import android.os.Bundle;
import android.widget.TimePicker;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    TimePicker timepick;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        timepick=(TimePicker)findViewById(R.id.timepick);
        timepick.setOnTimeChangedListener(new
            TimePicker.OnTimeChangedListener() {
                 @Override
                   public void onTimeChanged(TimePicker timePicker, int
                          hourofday, int minute) {
                      Toast.makeText(getApplicationContext(),"Kello on" +
                       hourofday + ":" +minute,Toast.LENGTH_SHORT).show();
                   }
                  });

    }
}