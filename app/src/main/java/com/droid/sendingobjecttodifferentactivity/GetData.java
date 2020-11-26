package com.droid.sendingobjecttodifferentactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class GetData extends AppCompatActivity {
    TextView textData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_data);
        textData = findViewById(R.id.edtData);
        Intent intent = getIntent();
        Bundle bundle = intent.getBundleExtra(getString(R.string.UserData));
        assert bundle != null;
        Data data = bundle.getParcelable( "user");
        assert data != null;
        textData.setText(data.getName() + "\n" + data.getlName() + "\n" + data.getAge());
    }
}