package com.nodeflux.africacareerguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.nodeflux.africacareerguide.m_Firebase.FirebaseHelper;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {



    private TextView countrySelect;
    private Spinner countryList;
    private DatabaseReference myDb;

    private FirebaseHelper fireHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countrySelect = (TextView) findViewById(R.id.textCountrySelect);
        countryList = (Spinner) findViewById(R.id.spinnerCountrySelect);


        //get database object i.e country
        myDb = FirebaseDatabase.getInstance().getReference();
        fireHelper = new FirebaseHelper(myDb);

        ArrayAdapter<String> adp = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, fireHelper.retrieve());
        adp.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        countryList.setAdapter(adp);

        //The listener does not seem to be working
        countryList.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                //Get selected item
                int sid = countryList.getSelectedItemPosition();
                String country = (String)adapterView.getItemAtPosition(sid);
                countrySelect.setText(country);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


    }

    @Override
    protected void onStart() {
        super.onStart();



    }



}
