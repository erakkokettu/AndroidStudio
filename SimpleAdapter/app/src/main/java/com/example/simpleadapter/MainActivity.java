package com.example.simpleadapter;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    String hedelmaNimet[] = {"Banaani", "Viinirypäle", "Guava", "Mango", "Appelsiini", "Vesimeloni"};

    int hedelmaKuvat[] = {R.drawable.banana,
            R.drawable.grape,
            R.drawable.guava,
            R.drawable.mango,
            R.drawable.orange,
            R.drawable.watermelon};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        ArrayList<HashMap<String, Object>> list = new ArrayList<>();

        for (int i = 0; i < hedelmaNimet.length; i++) {
            HashMap<String, Object> map = new HashMap<>();

            map.put("hedelmaNimet", hedelmaNimet[i]);
            map.put("hedelmaKuvat", hedelmaKuvat[i]);

            list.add(map);
        }

        String[] from = {"hedelmaNimet", "hedelmaKuvat"};

        int to[] = {R.id.textView, R.id.imageView};

        SimpleAdapter simpleAdapter = new SimpleAdapter(getApplicationContext(), list, R.layout.list_row_items, from, to);

        listView.setAdapter(simpleAdapter);
    }
}
