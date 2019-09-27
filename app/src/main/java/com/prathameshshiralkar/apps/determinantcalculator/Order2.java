package com.prathameshshiralkar.apps.determinantcalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class Order2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order2);

        Button btn2 = (Button) findViewById(R.id.button5);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
            EditText to3_a1 = (EditText) findViewById(R.id.o3_a1);
            EditText to3_a2 = (EditText) findViewById(R.id.o3_a2);
            EditText to3_a3 = (EditText) findViewById(R.id.o3_a3);
            EditText to3_b1 = (EditText) findViewById(R.id.o3_b1);
            EditText to3_b2 = (EditText) findViewById(R.id.o3_b2);
            EditText to3_b3 = (EditText) findViewById(R.id.o3_b3);
            EditText to3_c1 = (EditText) findViewById(R.id.o3_c1);
            EditText to3_c2 = (EditText) findViewById(R.id.o3_c2);
            EditText to3_c3 = (EditText) findViewById(R.id.o3_c3);
            TextView to3_result = (TextView) findViewById(R.id.o3_result);

                if (!to3_a1.getText().toString().isEmpty() && !to3_a2.getText().toString().isEmpty() && !to3_a3.getText().toString().isEmpty() && !to3_b1.getText().toString().isEmpty() && !to3_b2.getText().toString().isEmpty() && !to3_b3.getText().toString().isEmpty() &&
                    !to3_c1.getText().toString().isEmpty() && !to3_c2.getText().toString().isEmpty() && !to3_c3.getText().toString().isEmpty()) {
                    try {
                        int o3_na1 = Integer.parseInt(to3_a1.getText().toString());
                        int o3_na2 = Integer.parseInt(to3_a2.getText().toString());
                        int o3_na3 = Integer.parseInt(to3_a3.getText().toString());
                        int o3_nb1 = Integer.parseInt(to3_b1.getText().toString());
                        int o3_nb2 = Integer.parseInt(to3_b2.getText().toString());
                        int o3_nb3 = Integer.parseInt(to3_b3.getText().toString());
                        int o3_nc1 = Integer.parseInt(to3_c1.getText().toString());
                        int o3_nc2 = Integer.parseInt(to3_c2.getText().toString());
                        int o3_nc3 = Integer.parseInt(to3_c3.getText().toString());
                        int o3_result;
                        o3_result = o3_na1 * (o3_nb2 * o3_nc3 - o3_nb3 * o3_nc2) - o3_na2 * (o3_nb1 * o3_nc3 - o3_nb3 * o3_nc1) + o3_na3 * (o3_nb1 * o3_nc2 - o3_nc1 * o3_nb2);

                        to3_result.setText("Answer = " + Integer.toString(o3_result));
                    }catch (NumberFormatException nfe)
                    {
                        Toast.makeText(Order2.this, "Elements too big!", Toast.LENGTH_LONG).show();
                    }
                } else {
                    Toast toast_o3 = Toast.makeText(Order2.this, "Please enter all elements of determinant", Toast.LENGTH_LONG);
                    toast_o3.show();
                    to3_result.setText("");
                }
            }
        });

        AdView mAdView = (AdView) findViewById(R.id.adView);

        AdRequest adRequest = new AdRequest.Builder().build(); //.addTestDevice("B6E0E8263C1377346479B0D220194235")
        if(mAdView != null) {
            mAdView.loadAd(adRequest);
        }
        else {
            Toast.makeText(getApplicationContext(), "Null Adview! Make sure content view is set!", Toast.LENGTH_SHORT).show();
        }

    }

    public void gotoabout(View v)
    {
        Intent intent = new Intent(Order2.this, Abt.class);
        startActivity(intent);
    }

}
