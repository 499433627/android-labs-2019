package edu.hzuapps.androidlabs.soft1714080902204;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Soft1714080902204Activity_Second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soft1714080902204_second);


        Button btnOpen = findViewById(R.id.button4);
        btnOpen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Soft1714080902204Activity_Second.this, Soft1714080902204Activity_Third.class));

            }
        });

        btnOpen = findViewById(R.id.button5);
        btnOpen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Soft1714080902204Activity_Second.this, Soft1714080902204Activity_Four.class));

            }
        });

    }
}
