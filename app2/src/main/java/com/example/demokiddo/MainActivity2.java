package com.example.demokiddo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity implements AdapterView.OnItemSelectedListener {


    //Button disp;
    //TextView  t1;
    //TextView  t2;
    //Firebase ref1;
    //Firebase ref2;
    //String info, achieve, path;
    //ProgressDialog progressDialog;
    //Button di
    //TextView  t3;
    // String state1[] = null;
    Spinner spinner1;
    //Spinner spinner2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Firebase.setAndroidContext(this);
        //t3 = findViewById(R.id.text3);
        spinner1 = findViewById(R.id.select1);
        //spinner2 = (Spinner) findViewById(R.id.select2);
        //disp1 = (Button) findViewById(R.id.disp1) ;
        spinner1.setOnItemSelectedListener(this);
        //disp1.setOnClickListener(this);
        //progressDialog = new ProgressDialog(this);
        //disp = findViewById(R.id.disp);
        //t1 = findViewById(R.id.text1);
        //t2 = findViewById(R.id.text2);
        //ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this, R.array.Select_board, R.layout.support_simple_spinner_dropdown_item);
        //adapter1.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        //spinner1.setAdapter(adapter1);

        /*disp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressDialog.setMessage("Loading");
                progressDialog.show();
                ;
                disp2();
            }
        });*/
    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        if (position == 0) {
            //state1 = new String[]{"R N Gandhi School " , "The Somaiya School"};
            Toast.makeText(parent.getContext(), "Select a board" , Toast.LENGTH_SHORT).show();

        }

        if (position == 1) {
            Intent intent1 = new Intent(MainActivity2.this, CBSEActivity.class);
            startActivity(intent1);
            //state1 = new String[]{"Garodia International School", "Orchids The International School", "The Universal School "};
        }
        if (position == 2) {
            Intent intent1 = new Intent(MainActivity2.this, ICSEActivity.class);
            startActivity(intent1);

            Toast.makeText(parent.getContext(), "Selected Icse" , Toast.LENGTH_SHORT).show();
        }
        if (position == 3){
            Intent intent1 = new Intent(MainActivity2.this, SecondActivity.class);
            startActivity(intent1);
        }
        //ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, state1);
        //spinner2.setAdapter(adapter1);
    }
    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    /*@Override
    public void onClick(View v) {
        String board=spinner1.getSelectedItem().toString();
        Toast.makeText(getParent().getApplicationContext(), "Board Selected", Toast.LENGTH_SHORT).show();
        //String schoolname=spinner2.getSelectedItem().toString();
        //t3.setText(board+" : "+schoolname);
        //Intent intent1 = new Intent(MainActivity.this, ThirdActivity.class);
        //startActivity(intent1);



    }*/


    /*private void disp2() {
        t2.setText(achieve);
        progressDialog.dismiss();
    }*/

    //public void disp1() {
    // t3.setText(info);
    //}

    /*@Override
    protected void onStart() {
        super.onStart();

        path = "Address";

        ref1 = new Firebase("https://kiddo-1bc30.firebaseio.com/School database:/CBSE/List of CBSE schools/R N Gandhi School/Information of R N Gandhi School" );
        ref1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                info = dataSnapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {
                Toast.makeText(getParent().getApplicationContext(), "Error", Toast.LENGTH_SHORT).show();
            }
        });

        path = "Achievements";

        ref1 = new Firebase("https://kiddo-1bc30.firebaseio.com/School database:/CBSE/List of CBSE schools/R N Gandhi School/Information of R N Gandhi School/" + path);
        ref1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                achieve = dataSnapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        })
    }*/



//The End :P
}
