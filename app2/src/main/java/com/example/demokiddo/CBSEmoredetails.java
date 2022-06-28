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

public class CBSEmoredetails extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Spinner moredspinner;
    TextView t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t15,t16,t17,t19,t20,t21;
    Firebase detref1;
    String path1,fname1,fedd1,fpost1,fsubt1,fcon1,fachv1,fcon2,fname2,fedd2,fpost2,fsubt2,fachv2,tr1,tr2,tr3,vr1,vr2,vr3;
    Button loc;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cbsemoredetails);
        loc = findViewById(R.id.location);
        moredspinner = findViewById(R.id.facspinner1);
        t1 = findViewById(R.id.text1);
        t2 = findViewById(R.id.text2);
        t3 = findViewById(R.id.text3);
        t4 = findViewById(R.id.text4);
        t5 = findViewById(R.id.text5);
        t6 = findViewById(R.id.text6);
        t7 = findViewById(R.id.text7);
        t8 = findViewById(R.id.text8);
        t9 = findViewById(R.id.text9);
        t10 = findViewById(R.id.text10);
        t11 = findViewById(R.id.text11);
        t12 = findViewById(R.id.text12);
        t15 = findViewById(R.id.text15);
        t16 = findViewById(R.id.text16);
        t17 = findViewById(R.id.text17);
        t19 = findViewById(R.id.text19);
        t20 = findViewById(R.id.text20);
        t21 = findViewById(R.id.text21);
        Firebase.setAndroidContext(this);
        moredspinner.setOnItemSelectedListener(this);


    }

    @Override
    protected void onStart() {
        super.onStart();
        //Details of first faculty
        path1 = "Name";
        detref1 = new Firebase("https://kiddo-1bc30.firebaseio.com/School database:/CBSE/List of CBSE schools/R N Gandhi School/Information of R N Gandhi School/Faculty Details/Names of the faculty/Anil Malhotra/Details/"+path1);
        detref1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                fname1 = dataSnapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

        path1 = "Education Details";

        detref1 = new Firebase("https://kiddo-1bc30.firebaseio.com/School database:/CBSE/List of CBSE schools/R N Gandhi School/Information of R N Gandhi School/Faculty Details/Names of the faculty/Anil Malhotra/Details/" + path1);
        detref1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                fedd1 = dataSnapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

        path1 = "Post";

        detref1 = new Firebase("https://kiddo-1bc30.firebaseio.com/School database:/CBSE/List of CBSE schools/R N Gandhi School/Information of R N Gandhi School/Faculty Details/Names of the faculty/Anil Malhotra/Details/" + path1);
        detref1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                fpost1 = dataSnapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

        path1 = "Subjects teaching";

        detref1 = new Firebase("https://kiddo-1bc30.firebaseio.com/School database:/CBSE/List of CBSE schools/R N Gandhi School/Information of R N Gandhi School/Faculty Details/Names of the faculty/Anil Malhotra/Details/" + path1);
        detref1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                fsubt1 = dataSnapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

        path1 = "Contact Details";

        detref1 = new Firebase("https://kiddo-1bc30.firebaseio.com/School database:/CBSE/List of CBSE schools/R N Gandhi School/Information of R N Gandhi School/Faculty Details/Names of the faculty/Anil Malhotra/Details/" + path1);
        detref1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                fcon1 = dataSnapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

        path1 = "Achievements";

        detref1 = new Firebase("https://kiddo-1bc30.firebaseio.com/School database:/CBSE/List of CBSE schools/R N Gandhi School/Information of R N Gandhi School/Faculty Details/Names of the faculty/Anil Malhotra/Details/" + path1);
        detref1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                fachv1 = dataSnapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

        path1 = "Name";

        detref1 = new Firebase("https://kiddo-1bc30.firebaseio.com/School database:/CBSE/List of CBSE schools/R N Gandhi School/Information of R N Gandhi School/Faculty Details/Names of the faculty/Keshav Parikh/Details/" + path1);
        detref1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                fname2 = dataSnapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

        path1 = "Education Details";

        detref1= new Firebase("https://kiddo-1bc30.firebaseio.com/School database:/CBSE/List of CBSE schools/R N Gandhi School/Information of R N Gandhi School/Faculty Details/Names of the faculty/Keshav Parikh/Details/" + path1);
        detref1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                fedd2 = dataSnapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

        path1 = "Post";

        detref1 = new Firebase("https://kiddo-1bc30.firebaseio.com/School database:/CBSE/List of CBSE schools/R N Gandhi School/Information of R N Gandhi School/Faculty Details/Names of the faculty/Keshav Parikh/Details/" + path1);
        detref1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                fpost2 = dataSnapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

        path1 = "Subjects teaching";

        detref1 = new Firebase("https://kiddo-1bc30.firebaseio.com/School database:/CBSE/List of CBSE schools/R N Gandhi School/Information of R N Gandhi School/Faculty Details/Names of the faculty/Keshav Parikh/Details/" + path1);
        detref1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                fsubt2 = dataSnapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

        path1 = "Contact Details";

        detref1 = new Firebase("https://kiddo-1bc30.firebaseio.com/School database:/CBSE/List of CBSE schools/R N Gandhi School/Information of R N Gandhi School/Faculty Details/Names of the faculty/Keshav Parikh/Details/" + path1);
        detref1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                fcon2 = dataSnapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

        path1 = "Achievements";

        detref1 = new Firebase("https://kiddo-1bc30.firebaseio.com/School database:/CBSE/List of CBSE schools/R N Gandhi School/Information of R N Gandhi School/Faculty Details/Names of the faculty/Keshav Parikh/Details/" + path1);
        detref1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                fachv2 = dataSnapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

        path1 = "Chiman Rathod";

        detref1 = new Firebase("https://kiddo-1bc30.firebaseio.com/School database:/CBSE/List of CBSE schools/R N Gandhi School/Information of R N Gandhi School/Passed out student reviews/Text reviews/" + path1);
        detref1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                tr1 = dataSnapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

        path1 = "Divya Lakshmanan";

        detref1 = new Firebase("https://kiddo-1bc30.firebaseio.com/School database:/CBSE/List of CBSE schools/R N Gandhi School/Information of R N Gandhi School/Passed out student reviews/Text reviews/" + path1);
        detref1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                tr2 = dataSnapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

        path1 = "Manas Raut";

        detref1 = new Firebase("https://kiddo-1bc30.firebaseio.com/School database:/CBSE/List of CBSE schools/R N Gandhi School/Information of R N Gandhi School/Passed out student reviews/Text reviews/" + path1);
        detref1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                tr3 = dataSnapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

        path1 = "Chiman Rathod";

        detref1 = new Firebase("https://kiddo-1bc30.firebaseio.com/School database:/CBSE/List of CBSE schools/R N Gandhi School/Information of R N Gandhi School/Passed out student reviews/Video reviews/" + path1);
        detref1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                vr1 = dataSnapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

        path1 = "Divya Lakshmanan";

        detref1 = new Firebase("https://kiddo-1bc30.firebaseio.com/School database:/CBSE/List of CBSE schools/R N Gandhi School/Information of R N Gandhi School/Passed out student reviews/Video reviews/" + path1);
        detref1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                vr2 = dataSnapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

        path1 = "Manas Raut";

        detref1 = new Firebase("https://kiddo-1bc30.firebaseio.com/School database:/CBSE/List of CBSE schools/R N Gandhi School/Information of R N Gandhi School/Passed out student reviews/Video reviews/" + path1);
        detref1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                vr3 = dataSnapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });



    }

    @Override
    public void onItemSelected(final AdapterView<?> parent, View view, int position, long id) {

        if(position == 0){

            Toast.makeText(parent.getContext(),"Select something",Toast.LENGTH_SHORT).show();
        }

        if(position == 1){

            t1.setText(fname1);
            t2.setText(fedd1);
            t3.setText(fpost1);
            t4.setText(fsubt1);
            t5.setText(fcon1);
            t6.setText(fachv1);
            t7.setText(fname2);
            t8.setText(fedd2);
            t9.setText(fpost2);
            t10.setText(fsubt2);
            t11.setText(fcon2);
            t12.setText(fachv2);
            t15.setText(tr1);
            t16.setText(tr2);
            t17.setText(tr3);
            t19.setText(vr1);
            t20.setText(vr2);
            t21.setText(vr3);

            loc.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent location1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/dir//R.N+Gandhi+High+School,+2,+RN+Gandhi+Rd,+ONGC+Colony,+Rajawadi+Colony,+Vidyavihar,+Mumbai,+Maharashtra+400077/@19.2127603,72.7509059,11z/data=!4m8!4m7!1m0!1m5!1m1!1s0x3be7c62825e71bcf:0xb8e3e7eaa04da9f3!2m2!1d72.8992066!2d19.077706"));
                    startActivity(location1);
                }
            });

            t19.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent location2 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=RKHwI4EOcwI"));
                    startActivity(location2);
                }
            });
            t20.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(parent.getContext(), "Video not uploaded", Toast.LENGTH_SHORT).show();

                }
            });
            t21.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(parent.getContext(), "Video not uploaded", Toast.LENGTH_SHORT).show();

                }
            });
            Toast.makeText(parent.getContext(),"Slected 1st",Toast.LENGTH_SHORT).show();
        }
        if(position == 2){

            loc.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent location1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/dir//The+Somaiya+School,+Vidyanagar,+Vidya+Vihar+East,+Vidyavihar,+Mumbai,+Maharashtra/@19.074798,72.8653362,13z/data=!4m8!4m7!1m0!1m5!1m1!1s0x3be7c627c4bf86b3:0xdca407f5f725cfec!2m2!1d72.9003559!2d19.0748013"));
                    startActivity(location1);
                }
            });

            Toast.makeText(parent.getContext(),"Selected 2nd",Toast.LENGTH_SHORT).show();
        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}