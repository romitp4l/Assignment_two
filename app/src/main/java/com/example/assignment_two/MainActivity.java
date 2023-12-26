package com.example.assignment_two;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editTextPhone;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextPhone = findViewById(R.id.editTextPhone);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phoneNo = editTextPhone.getText().toString().trim();
                CheckDataFromDatabase(phoneNo);
            }
        });
    }

    void CheckDataFromDatabase(String phoneNo) {
        Intent intentForData = new Intent(MainActivity.this, FetchedActivity.class);
        intentForData.putExtra("mobileNo", phoneNo);
        startActivity(intentForData);
    }
}
