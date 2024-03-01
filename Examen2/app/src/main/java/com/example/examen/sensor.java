package com.example.examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Color;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.RelativeLayout;

public class sensor extends AppCompatActivity implements SensorEventListener {
    private SensorManager sensorManager;
    private Sensor proximitySensor;
    private RelativeLayout container;
    private MediaPlayer mediaPlayer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sensor);
        container = findViewById(R.id.container);
        sensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        if (sensorManager != null)
            proximitySensor = sensorManager.getDefaultSensor(Sensor.TYPE_PROXIMITY);

        mediaPlayer = MediaPlayer.create(this, R.raw.zzz);

    }
    @Override
    protected void onResume() {
        super.onResume();
        if (proximitySensor != null) {
            sensorManager.registerListener(this, proximitySensor, SensorManager.SENSOR_DELAY_NORMAL);
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        sensorManager.unregisterListener(this);
    }

    @Override
    public void onSensorChanged(SensorEvent event) {
        if (event.sensor.getType() == Sensor.TYPE_PROXIMITY) {
            if (event.values[0] < proximitySensor.getMaximumRange()) {
                container.setBackgroundResource(R.drawable.vaca);
                if (!mediaPlayer.isPlaying()) {
                    mediaPlayer.start();
                }
            } else {
                container.setBackgroundColor(Color.GREEN);
                mediaPlayer.seekTo(0);
                if (mediaPlayer.isPlaying()) {
                    mediaPlayer.pause();
                }
            }
        }
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }
}