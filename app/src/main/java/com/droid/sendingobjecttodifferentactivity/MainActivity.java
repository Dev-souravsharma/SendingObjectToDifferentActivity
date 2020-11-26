package com.droid.sendingobjecttodifferentactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText name, lName, age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.editName);
        lName = findViewById(R.id.edtLastName);
        age = findViewById(R.id.edtAge);
    }

    public void SendData(View view) {
        String fName = name.getText().toString().trim();
        String lastName = lName.getText().toString().trim();
        int ageData = Integer.parseInt(age.getText().toString().trim());
        Data data = new Data(fName, lastName, ageData);
        Intent intent = new Intent(MainActivity.this, GetData.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("user", data);
        intent.putExtra(getString(R.string.UserData), bundle);
        startActivity(intent);
    }
}