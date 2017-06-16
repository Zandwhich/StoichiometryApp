package com.example.alex.stochiometryapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import com.example.alex.util.*;

public class MainActivity extends AppCompatActivity {

    Button doneButton;
    EditText elementChooser;
    TextView descriptionText;

    Elements_OLD elementsOLD;

    public static final String ELEMENT_INFO_MESSAGE = "com.example.alex.stochiometryapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        doneButton = (Button) findViewById(R.id.doneButton);
        elementChooser = (EditText) findViewById(R.id.elementChooser);
        descriptionText = (TextView) findViewById(R.id.descriptionView);
        elementsOLD = new Elements_OLD();
    }

    public void doneClicked(View view) {
        String input = elementChooser.getText().toString();
        Intent intent = new Intent(this, ElementInfo.class);

        if (input.equals("")) {
            intent.putExtra(ELEMENT_INFO_MESSAGE, "Please specify an element.");
        }
        else {
            intent.putExtra(ELEMENT_INFO_MESSAGE, input);

        }
        startActivity(intent);
    }
}
