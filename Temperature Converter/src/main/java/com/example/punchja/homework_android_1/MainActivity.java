package com.example.punchja.homework_android_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.punchja.homework_android_1.Model.Temperature;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button CtoF = (Button) findViewById(R.id.button3);
        Button FtoC = (Button) findViewById(R.id.button2);
        CtoF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView T = findViewById(R.id.editTemp);
                double  number = Double.parseDouble(T.getText().toString());
                Temperature temp = new Temperature(number);
                TextView T1 = findViewById(R.id.temp);
                T1.setText(temp.toF());
            }
        });
        FtoC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView T = findViewById(R.id.editTemp);
                double  number = Double.parseDouble(T.getText().toString());
                Temperature temp = new Temperature(number);
                TextView T1 = findViewById(R.id.temp);
                T1.setText(temp.toC());
            }
        });
    }
}
