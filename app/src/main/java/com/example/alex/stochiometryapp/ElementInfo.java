package com.example.alex.stochiometryapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.alex.util.*;

public class ElementInfo extends AppCompatActivity {

    TextView elementInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_element_info);

        Intent intent = getIntent();
        String input = intent.getStringExtra(MainActivity.ELEMENT_INFO_MESSAGE);

        elementInfo = (TextView) findViewById(R.id.elementInfo);

        for (Atom element: Elements.allElements) {
            if (element.NAME.equals(input)) {
                elementInfo.setText(input);
                break;
            }
        }

        if (elementInfo.getText().equals("")){
            elementInfo.setText("Please specify an element");
        }
    }
}
