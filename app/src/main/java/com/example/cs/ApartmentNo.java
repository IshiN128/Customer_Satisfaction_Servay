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
          String[] bankNames={"BOI","SBI","HDFC","PNB","OBC"};
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