package com.example.alex.stochiometryapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.example.alex.util.Atom;
import com.example.alex.util.Elements_OLD;

import java.util.ArrayList;
import java.util.List;

public class StochiometryCalculator extends AppCompatActivity {

    Spinner fromSpinner;
    Spinner toSpinner;
    Elements_OLD elements_OLD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stochiometry_calculator);

        elements_OLD = new Elements_OLD();
        fromSpinner = (Spinner) findViewById(R.id.from_spinner);
        toSpinner = (Spinner) findViewById(R.id.to_spinner);

        List<String> elementNames = new ArrayList<String>();

        for (Atom atom : elements_OLD.allElements)
        {
            elementNames.add(atom.NAME);
        }

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, elementNames);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        fromSpinner.setAdapter(dataAdapter);
        toSpinner.setAdapter(dataAdapter);

        fromSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
