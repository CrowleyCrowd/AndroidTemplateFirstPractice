package com.example.clasetres;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private int counter=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtCounter= findViewById(R.id.firstTextView);
        Button button= findViewById(R.id.firstButton);
        Button reset= findViewById(R.id.secondButton);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("CLICKER", "CLICK");
                counter++;
                txtCounter.setText(counter+"");
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("CLICKER", "CLICK");
                counter=0;
                txtCounter.setText(counter+"");
            }
        });
    }


}