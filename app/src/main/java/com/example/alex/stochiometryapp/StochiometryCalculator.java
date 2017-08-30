package com.example.alex.stochiometryapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.example.alex.util.Atom;
import com.example.alex.util.Elements_OLD;

import java.util.ArrayList;
import java.util.List;

public class StochiometryCalculator extends AppCompatActivity {

    Spinner fromSpinner;
    Elements_OLD elements_OLD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stochiometry_calculator);

        elements_OLD = new Elements_OLD();
        fromSpinner = (Spinner) findViewById(R.id.from_spinner);

        List<String> elementNames = new ArrayList<String>();

        for (Atom atom : elements_OLD.allElements)
        {
            elementNames.add(atom.NAME);
        }

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, elementNames);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        fromSpinner.setAdapter(dataAdapter);

    }
}
