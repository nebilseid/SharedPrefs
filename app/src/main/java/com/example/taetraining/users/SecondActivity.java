package com.example.taetraining.users;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private static final String TAG = "SecondActivity";
    private TextView tvFirstName,tvMiddleName,tvLastName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.activity_second);
        tvFirstName = findViewById(R.id.etFirstName);
        tvMiddleName = findViewById(R.id.etMiddleName);
        tvLastName = findViewById(R.id.etLastName);


        SharedPreferences sharedPreferences = getSharedPreferences("sp", Context.MODE_PRIVATE);
        String personFirstName = sharedPreferences.getString("firstName", "");
        String personMiddleName = sharedPreferences.getString("middleName", "");
        String personLastName = sharedPreferences.getString("lastName", "");

        tvFirstName.setText(personFirstName);
        tvMiddleName.setText(personMiddleName);
        tvLastName.setText(personLastName);



        Log.d(TAG, "onCreate: ");

    }

    @Override
    protected void onResume() {
        super.onResume();
switch (getIntent().getAction()){
    case "SHARED_PREFS":


    }
}}
