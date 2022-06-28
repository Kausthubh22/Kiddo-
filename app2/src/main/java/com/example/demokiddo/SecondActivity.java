package com.example.demokiddo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class SecondActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Spinner spinner3;
    String[] state2 = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        spinner3 = findViewById(R.id.select3);
        spinner3.setOnItemSelectedListener(this);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        if (position == 0) {
            Toast.makeText(parent.getContext(), "Select a medium" , Toast.LENGTH_SHORT).show();

        }

        if (position == 1) {
            Intent intent1 = new Intent(SecondActivity.this, SSCEnglishActivity.class);
            startActivity(intent1);
            Toast.makeText(parent.getContext(), "Selected Medium English" , Toast.LENGTH_SHORT).show();


        }
        if (position == 2) {
            Intent intent1 = new Intent(SecondActivity.this, SSCSemiEnglishActivity.class);
            startActivity(intent1);

            Toast.makeText(parent.getContext(), "Selected Medium Semi English" , Toast.LENGTH_SHORT).show();
        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
