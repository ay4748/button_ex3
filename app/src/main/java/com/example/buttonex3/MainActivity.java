package com.example.buttonex3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    int counter=0;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void dodge(View view) {
        btn=findViewById(R.id.button);
        counter+=1;
        if(counter==7)
        {
            btn.setText("Enough to click. Go to new start!");
            counter=0;
        }
        else
        {
            btn.setText("This is a click number:"+counter);
        }

    }
}