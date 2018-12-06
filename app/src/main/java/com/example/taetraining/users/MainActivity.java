package com.example.taetraining.users;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private static String TAG = "SecondActivity";
    private EditText etFirstName, etMiddleName, etLastName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etFirstName = findViewById(R.id.etFirstName);
        etMiddleName = findViewById(R.id.etMiddleName);
        etLastName = findViewById(R.id.etLastName);
        Log.d(TAG, "onCreate: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: ");
        
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: ");
    }

    public void doSomething(View view) {

        switch (view.getId()) {
            case R.id.btnNext:

                SharedPreferences sharedPreferences = getSharedPreferences("sp", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("firstName", etFirstName.getText().toString());
                editor.putString("middleName", etMiddleName.getText().toString());
                editor.putString("lastName", etLastName.getText().toString());
                editor.commit();
                Intent intent = new Intent(this, SecondActivity.class);

                startActivity(intent);
                break;
        }
    }
}