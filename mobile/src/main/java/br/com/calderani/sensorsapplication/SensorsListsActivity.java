package br.com.calderani.sensorsapplication;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

public class SensorsListsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sensors_lists);


        SensorManager sensorManager = (SensorManager)
                getSystemService(Context.SENSOR_SERVICE);
        List<Sensor> sensorList = sensorManager.getSensorList(Sensor.TYPE_ALL) ;

        TextView tvSensorList = (TextView) findViewById(R.id.tvSensorList);

        for (Sensor s : sensorList) {
            String currentText = tvSensorList.getText().toString() + "\n\n\t";
            tvSensorList.setText(currentText +s.getName() + " - " + s.getVendor());
        }
    }
}
