package com.example.ringtones;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaActionSound;
import android.media.MediaCas;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
        public void sonido1(View view){
            MediaPlayer mp = MediaPlayer.create(this, R.raw.sonido1);
            mp.start();
        }
        public void sonido2(View view){
        MediaPlayer mp = MediaPlayer.create(this, R.raw.sonido2);
        mp.start();
    }
    public void sonido3(View view) {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.sonido3);
        mp.start();
    }
    public void sonido4(View view) {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.sonido4);
        mp.start();
    }
    public void sonido5(View view) {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.sonido5);
        mp.start();
    }
    public void sonido6(View view) {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.sonido6);
        mp.start();
    }
    public void sonido7(View view) {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.sonido7);
        mp.start();
    }
    public void sonido8(View view) {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.sonido8);
        mp.start();
    }
    public void sonido9(View view) {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.sonido9);
        mp.start();
    }
    public void sonido10(View view) {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.sonido10);
        mp.start();
    }
    //Compartir sonido
    public void share1(View view){
        Intent share=new Intent(Intent.ACTION_SEND);
        share.setType("text/text");
        share.putExtra(Intent.EXTRA_SUBJECT,"MY RINGTONE");
        share.putExtra(Intent.EXTRA_TEXT,"Descarga mi ringtone https://www.videvo.net/es/efectos-de-sonido/wav/");
        startActivity(Intent.createChooser(share,"Compartir"));
    }
    public void share2(View view){
        Intent share=new Intent(Intent.ACTION_SEND);
        share.setType("text/text");
        share.putExtra(Intent.EXTRA_SUBJECT,"MY RINGTONE");
        share.putExtra(Intent.EXTRA_TEXT,"Descarga mi ringtone https://www.videvo.net/es/efectos-de-sonido/wav/");
        startActivity(Intent.createChooser(share,"Compartir"));
    }
    public void share3(View view){
        Intent share=new Intent(Intent.ACTION_SEND);
        share.setType("text/text");
        share.putExtra(Intent.EXTRA_SUBJECT,"MY RINGTONE");
        share.putExtra(Intent.EXTRA_TEXT,"Descarga mi ringtone https://www.videvo.net/es/efectos-de-sonido/wav/");
        startActivity(Intent.createChooser(share,"Compartir"));
    }
    public void share4(View view){
        Intent share=new Intent(Intent.ACTION_SEND);
        share.setType("text/text");
        share.putExtra(Intent.EXTRA_SUBJECT,"MY RINGTONE");
        share.putExtra(Intent.EXTRA_TEXT,"Descarga mi ringtone https://www.videvo.net/es/efectos-de-sonido/wav/");
        startActivity(Intent.createChooser(share,"Compartir"));
    }
    public void share5(View view){
        Intent share=new Intent(Intent.ACTION_SEND);
        share.setType("text/text");
        share.putExtra(Intent.EXTRA_SUBJECT,"MY RINGTONE");
        share.putExtra(Intent.EXTRA_TEXT,"Descarga mi ringtone https://www.videvo.net/es/efectos-de-sonido/wav/");
        startActivity(Intent.createChooser(share,"Compartir"));
    }
    public void share6(View view){
        Intent share=new Intent(Intent.ACTION_SEND);
        share.setType("text/text");
        share.putExtra(Intent.EXTRA_SUBJECT,"MY RINGTONE");
        share.putExtra(Intent.EXTRA_TEXT,"Descarga mi ringtone https://www.videvo.net/es/efectos-de-sonido/wav/");
        startActivity(Intent.createChooser(share,"Compartir"));
    }
    public void share7(View view){
        Intent share=new Intent(Intent.ACTION_SEND);
        share.setType("text/text");
        share.putExtra(Intent.EXTRA_SUBJECT,"MY RINGTONE");
        share.putExtra(Intent.EXTRA_TEXT,"Descarga mi ringtone https://www.videvo.net/es/efectos-de-sonido/wav/");
        startActivity(Intent.createChooser(share,"Compartir"));
    }
    public void share8(View view){
        Intent share=new Intent(Intent.ACTION_SEND);
        share.setType("text/text");
        share.putExtra(Intent.EXTRA_SUBJECT,"MY RINGTONE");
        share.putExtra(Intent.EXTRA_TEXT,"Descarga mi ringtone https://www.videvo.net/es/efectos-de-sonido/wav/");
        startActivity(Intent.createChooser(share,"Compartir"));
    }
    public void share9(View view){
        Intent share=new Intent(Intent.ACTION_SEND);
        share.setType("text/text");
        share.putExtra(Intent.EXTRA_SUBJECT,"MY RINGTONE");
        share.putExtra(Intent.EXTRA_TEXT,"Descarga mi ringtone https://www.videvo.net/es/efectos-de-sonido/wav/");
        startActivity(Intent.createChooser(share,"Compartir"));
        showAssist(p)
    }
    public void share10(View view){
        Intent share=new Intent(Intent.ACTION_SEND);
        share.setType("text/text");
        share.putExtra(Intent.EXTRA_SUBJECT,"MY RINGTONE");
        share.putExtra(Intent.EXTRA_TEXT,"Descarga mi ringtone https://www.videvo.net/es/efectos-de-sonido/wav/");
        startActivity(Intent.createChooser(share,"Compartir"));
    }
    }
