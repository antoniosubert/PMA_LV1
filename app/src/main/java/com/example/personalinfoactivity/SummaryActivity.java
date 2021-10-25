package com.example.personalinfoactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SummaryActivity extends AppCompatActivity {


    private String sImePrezime;
    private TextView oImePrezime;
    private  String sKolegij;
    private TextView oKolegij;
    private Button oBtnPocetna;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);

        final Bundle oExtras = getIntent().getExtras();
        sImePrezime = oExtras.getString("imePrezime");
        oImePrezime = (TextView) findViewById(R.id.tvImePrezime);
        oImePrezime.setText(sImePrezime);
        sKolegij = oExtras.getString("kolegij");
        oKolegij = (TextView) findViewById(R.id.tvKolegij);
        oKolegij.setText(sKolegij);

        oBtnPocetna = (Button) findViewById(R.id.btnPocetna);
        oBtnPocetna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent oPocetna = new Intent(getApplicationContext(), PersonalInfoActivity.class);
                startActivity(oPocetna);
                finish();
            }
        });
    }
}





