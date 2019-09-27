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

import static com.prathameshshiralkar.apps.determinantcalculator.R.id.a1;

public class Order1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order1);


    Button btn1 = (Button) findViewById(R.id.button3);
    btn1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v)



    {
        EditText ta1 = (EditText) findViewById(a1);
        EditText ta2 = (EditText) findViewById(R.id.a2);
        EditText tb1 = (EditText) findViewById(R.id.b1);
        EditText tb2 = (EditText) findViewById(R.id.b2);
        TextView tresult = (TextView) findViewById(R.id.result);

        if(!ta1.getText().toString().isEmpty() && !ta2.getText().toString().isEmpty() && !tb1.getText().toString().isEmpty() && !tb2.getText().toString().isEmpty())
        {
            try {
            int na1 = Integer.parseInt(ta1.getText().toString());
            int na2 = Integer.parseInt(ta2.getText().toString());
            int nb1 = Integer.parseInt(tb1.getText().toString());
            int nb2 = Integer.parseInt(tb2.getText().toString());
            int result;
            result = (na1 * nb2) - (na2 * nb1);
            tresult.setText("Answer = " + Integer.toString(result));
            }catch (NumberFormatException nfe)
            {
                Toast.makeText(Order1.this, "Elements too big!", Toast.LENGTH_LONG).show();
            }
        }else{
            Toast toast_o2 = Toast.makeText(Order1.this, "Please enter all elements of determinant", Toast.LENGTH_LONG);
            toast_o2.show();
            tresult.setText("");
        }


    }});

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
        Intent intent = new Intent(Order1.this, Abt.class);
        startActivity(intent);
    }

}
