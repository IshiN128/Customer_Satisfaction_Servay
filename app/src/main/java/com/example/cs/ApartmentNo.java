package com.example.cs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;


public class ApartmentNo
        extends AppCompatActivity
        implements AdapterView.OnItemSelectedListener
      {
          String[] bankNames={"Select Your Apartment No",
                  "6/1","6/2","6/3","6/4","6/5","6/6",
                  "7/1","7/2","7/3","7/4","7/5","7/6",
                  "8/1","8/2","8/3","8/4","8/5","8/6",
                  "9/1","9/2","9/3","9/4","9/5","9/6",
                  "10/1","10/2","10/3","10/4","10/5","10/6",
                  "11/1","11/2","11/3","11/4","11/5","11/6",
                  "12/1","12/2","12/3","12/4","12/5","12/6",
                  "13/1","13/2","13/3","14/4","15/5","16/6",
                  "14/1","14/2","14/3","14/4","14/5","14/6",
                  "15/1","15/2","15/3","15/4","15/5","15/6",
                  "16/1","16/2","16/3","16/4","16/5","16/6",
                  "17/1","17/2","17/3","17/4","17/5","17/6",};
          Spinner sp1;

    @Override
    protected void onCreate(Bundle savedInstanceState)
        {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apartment_no);

            //Getting the instance of Spinner and applying OnItemSelectedListener on it
            Spinner spin = (Spinner) findViewById(R.id.spinner1);
            spin.setOnItemSelectedListener(this);

            //Creating the ArrayAdapter instance having the bank name list
            ArrayAdapter aa = new ArrayAdapter(this,android.R.layout.simple_spinner_item,bankNames);
            aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            //Setting the ArrayAdapter data on the Spinner
            spin.setAdapter(aa);


        }


          @Override
          public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

              Toast.makeText(getApplicationContext(), bankNames[i], Toast.LENGTH_LONG).show();
          }

          @Override
          public void onNothingSelected(AdapterView<?> adapterView) {
              // TODO Auto-generated method stub
          }
          @Override
          public boolean onCreateOptionsMenu(Menu menu) {
              // Inflate the menu; this adds items to the action bar if it is present.
              getMenuInflater().inflate(R.menu.menu_main, menu);
              return true;
          }
          @Override
          public boolean onOptionsItemSelected(MenuItem item) {
              // Handle action bar item clicks here. The action bar will
              // automatically handle clicks on the Home/Up button, so long
              // as you specify a parent activity in AndroidManifest.xml.
              int id = item.getItemId();

              //noinspection SimplifiableIfStatement
              if (id == R.id.action_settings) {
                  return true;
              }

              return super.onOptionsItemSelected(item);
          }
      }