package com.example.cs;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity
{

    FirebaseFirestore db = FirebaseFirestore.getInstance();
    Button excellent;
    Button gd;
    Button avg;
    Button poor;
    Button vp;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Toast.makeText(MainActivity.this, "Firebase Connection Success!!", Toast.LENGTH_LONG);


        gd= findViewById(R.id.btn_good);
        avg= findViewById(R.id.btn_average);
        poor= findViewById(R.id.btn_poor);
        vp= findViewById(R.id.btn_vpoor);


        Map<String, Object> test = new HashMap<>();


        excellent= findViewById(R.id.btn_excellent);
        excellent.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent =new Intent(MainActivity.this,feedback.class);
                startActivity(intent);
            }
        });


        gd.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v)
            {
                // TODO Auto-generated method stub

                Intent intent = new Intent(MainActivity.this, feedback2.class);
                startActivity(intent);

            }
        });

        avg.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v)
            {
                // TODO Auto-generated method stub

                Intent intent = new Intent(MainActivity.this, feedback3.class);
                startActivity(intent);


            }
        });

        poor.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v)
            {
                // TODO Auto-generated method stub

                Intent intent = new Intent(MainActivity.this, feedback.class);
                startActivity(intent);

            }
        });

        vp.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v)
            {
                // TODO Auto-generated method stub

                Intent intent = new Intent(MainActivity.this, feedback.class);
                startActivity(intent);

            }
        });


    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.

        return true;
    }

}