package com.example.musicalbum;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class AudioImage extends AppCompatActivity { // 앱을 실행 하기 위해서는 onCreate 오버라이징 필수
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.audio_image);
    }
}
