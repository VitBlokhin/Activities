package org.step.pps2701.blokhin.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnSecAct, btnThrdAct, btnQuit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSecAct = (Button)findViewById(R.id.btnSecondAct);
        btnThrdAct = (Button)findViewById(R.id.btnThirdAct);
        btnQuit = (Button)findViewById(R.id.btnQuit);

        // Открываем вторую активность
        btnSecAct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(view.getContext(), SecondActivity.class);
                startActivity(intent2);
            }
        });

        // Открываем третью активность
        btnThrdAct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(view.getContext(), ThirdActivity.class);
                startActivity(intent3);
            }
        });

        // Убиваем приложение
        btnQuit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                android.os.Process.killProcess(android.os.Process.myPid());
            }
        });
    }
}
