package com.example.league95.multipleactivitiesdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //This intent will get the other intent from
        //the main activity
        Intent intent = getIntent();
        //Will output "Rob"
        Toast.makeText(this, intent.getStringExtra("Friend name"), Toast.LENGTH_LONG).show();
    }

    public void switchBack(View view)
    {
        //Switch to first activity here
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);

        //switch here
        startActivity(intent);
    }

}
