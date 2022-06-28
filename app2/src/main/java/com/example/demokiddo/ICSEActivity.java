package com.example.demokiddo;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;

public class ICSEActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Spinner spinner2;
    Firebase mref1;
    String path1,name1,addr1,con1,achv1,web1,c12,c35,c68,c910,sa1,sa2,sa3;
    TextView t1, t2, t3, t4,t5,t7,t8,t9,t10,t12,t13,t14;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_icse);

        b1= findViewById(R.id.mored);
        spinner2 = findViewById(R.id.select2);
        t1 = findViewById(R.id.text1);
        t2 = findViewById(R.id.text2);
        t3 = findViewById(R.id.text3);
        t4 = findViewById(R.id.text4);
        t5 = findViewById(R.id.text5);
        t7 = findViewById(R.id.text7);
        t8 = findViewById(R.id.text8);
        t9 = findViewById(R.id.text9);
        t10 = findViewById(R.id.text10);
        t12 = findViewById(R.id.text12);
        t13 = findViewById(R.id.text13);
        t14 = findViewById(R.id.text14);
        Firebase.setAndroidContext(this);
        spinner2.setOnItemSelectedListener(this);
        web1 ="Click here to visit website";
    }

    @Override
    protected void onStart() {
        super.onStart();
        path1 = "Name of the school";

        mref1 = new Firebase("https://kiddo-1bc30.firebaseio.com/School database:/ICSE/List of ICSE schools:/Garodia International School/Information of Garodia International School/" + path1);
        mref1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                name1 = dataSnapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });
        path1 = "Address";

        mref1 = new Firebase("https://kiddo-1bc30.firebaseio.com/School database:/ICSE/List of ICSE schools:/Garodia International School/Information of Garodia International School/" + path1);

        mref1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                addr1 = dataSnapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

        path1 = "Contact";

        mref1 = new Firebase("https://kiddo-1bc30.firebaseio.com/School database:/ICSE/List of ICSE schools:/Garodia International School/Information of Garodia International School/" + path1);

        mref1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                con1 = dataSnapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

        path1 = "Class 1 to Class 2";

        mref1 = new Firebase("https://kiddo-1bc30.firebaseio.com/School database:/ICSE/List of ICSE schools:/Garodia International School/Information of Garodia International School/Budget details/" + path1);

        mref1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                c12 = dataSnapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

        path1 = "Class 3 to Class 5";

        mref1 = new Firebase("https://kiddo-1bc30.firebaseio.com/School database:/ICSE/List of ICSE schools:/Garodia International School/Information of Garodia International School/Budget details/" + path1);

        mref1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                c35 = dataSnapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

        path1 = "Class 6 to Class 8";

        mref1 = new Firebase("https://kiddo-1bc30.firebaseio.com/School database:/CBSE/List of CBSE schools/R N Gandhi School/Information of R N Gandhi School/Budget Details/" + path1);

        mref1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                c68 = dataSnapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

        path1 = "Class 9 to Class 10";

        mref1 = new Firebase("https://kiddo-1bc30.firebaseio.com/School database:/CBSE/List of CBSE schools/R N Gandhi School/Information of R N Gandhi School/Budget Details/" + path1);

        mref1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                c910 = dataSnapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

        path1 = "Elementary Competition";

        mref1 = new Firebase("https://kiddo-1bc30.firebaseio.com/School database:/ICSE/List of ICSE schools:/Garodia International School/Information of Garodia International School/School activites/" + path1);

        mref1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                sa1 = dataSnapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

        path1 = "Indoor Competition";

        mref1 = new Firebase("https://kiddo-1bc30.firebaseio.com/School database:/ICSE/List of ICSE schools:/Garodia International School/Information of Garodia International School/School activites/" + path1);

        mref1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                sa2 = dataSnapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

        path1 = "Sports Competition";

        mref1 = new Firebase("https://kiddo-1bc30.firebaseio.com/School database:/ICSE/List of ICSE schools:/Garodia International School/Information of Garodia International School/School activites/" + path1);

        mref1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                sa3 = dataSnapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

        path1 = "Achievements";

        mref1 = new Firebase("https://kiddo-1bc30.firebaseio.com/School database:/ICSE/List of ICSE schools:/Garodia International School/Information of Garodia International School/" + path1);

        mref1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                achv1 = dataSnapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });
    }

    @Override
    public void onItemSelected(final AdapterView<?> parent, View view, int position, long id) {

        if (position == 0) {

            Toast.makeText(parent.getContext(), "Select a school", Toast.LENGTH_SHORT).show();
        }
        if (position == 1) {
            t1.setText(name1);
            t2.setText(addr1);
            t3.setText(con1);
            t4.setText(achv1);
            t5.setText(web1);
            t7.setText(c12);
            t8.setText(c35);
            t9.setText(c68);
            t10.setText(c910);
            t12.setText(sa1);
            t13.setText(sa2);
            t14.setText(sa3);

            t5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent website = new Intent(Intent.ACTION_VIEW, Uri.parse("https://giclm.edu.in"));
                    startActivity(website);
                }
            });
            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent intent123 = new Intent(ICSEActivity.this,ICSEmoredetails.class);
                    startActivity(intent123);
                    Toast.makeText(parent.getContext(),"Clicked", Toast.LENGTH_SHORT).show();

                }
            });


        }

        if (position == 2) {
            Toast.makeText(parent.getContext(), "...", Toast.LENGTH_SHORT).show();
        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
