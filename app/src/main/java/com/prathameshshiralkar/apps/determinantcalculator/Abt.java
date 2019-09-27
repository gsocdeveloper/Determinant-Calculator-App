package com.prathameshshiralkar.apps.determinantcalculator;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Abt extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abt);
    }

    public void gotoinsta(View v)
    {
        Uri uri = Uri.parse("https://www.instagram.com/pratham__99/"); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void gotofb(View v)
    {
        Uri uri = Uri.parse("https://www.facebook.com/prathamesh.shiralkar"); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
}
