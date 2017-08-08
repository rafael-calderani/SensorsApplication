package br.com.calderani.sensorsapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TODO: verificar api.ai

        Button bt = (Button) findViewById(R.id.btAccelerometer);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), AcclerometerActivity.class);
                startActivity(i);
            }
        });

        Button bt2 = (Button) findViewById(R.id.btListSensors);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), SensorsListsActivity.class);
                startActivity(i);
            }
        });

        Button bt3 = (Button) findViewById(R.id.btShake);
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), ShakeActivity.class);
                startActivity(i);
            }
        });

        Button bt4 = (Button) findViewById(R.id.btSTT);
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), STTActivity.class);
                startActivity(i);
            }
        });

        Button bt5 = (Button) findViewById(R.id.btTTS);
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), TTSActivity.class);
                startActivity(i);
            }
        });
    }
}
