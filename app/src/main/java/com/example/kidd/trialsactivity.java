package com.example.kidd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.demokiddo.CBSEActivity;
import com.example.demokiddo.ICSEActivity;
import com.example.demokiddo.MainActivity2;
import com.example.demokiddo.SecondActivity;

public class trialsactivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    Spinner spinner1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trialsactivity);

        spinner1 = findViewById(R.id.select1);
        spinner1.setOnItemSelectedListener(this);


    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
        if (position == 0) {
            //state1 = new String[]{"R N Gandhi School " , "The Somaiya School"};
            //Toast.makeText(parent.getContext(), "Select a board" , Toast.LENGTH_SHORT).show();
            Toast.makeText(this, "Select a board", Toast.LENGTH_SHORT).show();
        }

        if (position == 1) {
            Intent intent1 = new Intent(trialsactivity.this, CBSEActivity.class);
            startActivity(intent1);
            //state1 = new String[]{"Garodia International School", "Orchids The International School", "The Universal School "};
        }
        if (position == 2) {
            Intent intent1 = new Intent(trialsactivity.this, ICSEActivity.class);
            startActivity(intent1);

            //Toast.makeText(parent.getContext(), "Selected Icse" , Toast.LENGTH_SHORT).show();
        }
        if (position == 3){
            Intent intent1 = new Intent(trialsactivity.this, SecondActivity.class);
            startActivity(intent1);
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}