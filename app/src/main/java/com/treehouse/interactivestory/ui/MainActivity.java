package com.treehouse.interactivestory.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.treehouse.interactivestory.R;

public class MainActivity extends AppCompatActivity {
    private Button mButtonStart;
    private EditText mEditTextUserName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initialize meber variables
        mButtonStart = (Button) findViewById(R.id.buttonStart);
        mEditTextUserName = (EditText) findViewById(R.id.editTextUserName);

        //Create listener for buttonStart
        mButtonStart.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                String name = mEditTextUserName.getText().toString();
                //Toast.makeText(MainActivity.this, "Hello " + name, Toast.LENGTH_SHORT).show();
                startStory(name);
            }
        });


    }

    //Open new activity and send information with intent
    public void startStory(String name){
        Intent intent = new Intent(this, StoryActivity.class);
        intent.putExtra("name", name);
        startActivity(intent);
    }

    @Override
    protected void onResume(){
        super.onResume();
        mEditTextUserName.setText("");
    }




}
