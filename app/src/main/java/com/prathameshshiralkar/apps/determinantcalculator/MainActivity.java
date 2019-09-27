package com.prathameshshiralkar.apps.determinantcalculator;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RelativeLayout laymain = (RelativeLayout) findViewById(R.id.layoutmain);
        final Button b1 = (Button) findViewById(R.id.button);
        final Button b2 = (Button) findViewById(R.id.button2);
        final ProgressBar probar = (ProgressBar) findViewById(R.id.pbar);
        b1.setVisibility(View.INVISIBLE);
        b2.setVisibility(View.INVISIBLE);
        new CountDownTimer(3300, 1)
        {
            public  void onTick(long millisUntilFinished){probar.setProgress(95 - (int)millisUntilFinished/38);}
            public void onFinish()
            {
                laymain.setVisibility(View.INVISIBLE);
                b1.setVisibility(View.VISIBLE);
                b2.setVisibility(View.VISIBLE);
            }
        }.start();

        AdView mAdView = (AdView) findViewById(R.id.adView);

        AdRequest adRequest = new AdRequest.Builder().build(); //.addTestDevice("B6E0E8263C1377346479B0D220194235")
        if(mAdView != null) {
            mAdView.loadAd(adRequest);
        }
        else {
            Toast.makeText(getApplicationContext(), "Null Adview! Make sure content view is set!", Toast.LENGTH_SHORT).show();
        }
    }

    public void func_ord1(View v)
    {
        Intent intent1 = new Intent(MainActivity.this, Order1.class);
        startActivity(intent1);
    }

    public void func_ord2(View v)
    {
        Intent intent2 = new Intent(MainActivity.this, Order2.class);
        startActivity(intent2);
    }

    public void gotoabout(View v)
    {
        Intent intent = new Intent(MainActivity.this, Abt.class);
        startActivity(intent);
    }

    int back=0;
    @Override
    public void onBackPressed()
    {
        if(back == 0)
        {
            Toast.makeText(getApplicationContext(), "Press again to exit", Toast.LENGTH_SHORT).show();
            back = 1;
            new android.os.Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    back = 0;
                }
            }, 3000);
        }
        else {
            finish();
        }
    }

}
