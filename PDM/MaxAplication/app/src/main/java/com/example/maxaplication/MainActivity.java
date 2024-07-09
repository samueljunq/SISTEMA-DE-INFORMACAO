package com.example.maxaplication;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private boolean isPlaying = false;
    private ImageView btnPlayPause;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvTitle = findViewById(R.id.tvTitle);
        ImageView btnRewind = findViewById(R.id.btnRewind);
        btnPlayPause = findViewById(R.id.btnPlayPause);
        ImageView btnFastForward = findViewById(R.id.btnFastForward);
        SeekBar seekBar = findViewById(R.id.seekBar);

        btnPlayPause.setOnClickListener(v -> {
            isPlaying = !isPlaying;
            btnPlayPause.setImageResource(isPlaying ? android.R.drawable.ic_media_pause : android.R.drawable.ic_media_play);
        });

        // Adicione mais funcionalidades conforme necessário
    }
}
