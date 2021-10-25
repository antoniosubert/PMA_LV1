package com.example.personalinfoactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class StudentInfoActivity extends AppCompatActivity {
    private EditText oInputKolegij;
    private Button oBtnKolegij;
    private String sKolegij;
    private String sImePrez;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_info);

        oInputKolegij = (EditText)findViewById(R.id.inputKolegij);

        final Bundle oExtras = getIntent().getExtras();
        sImePrez = oExtras.getString("imePrezime");

        oBtnKolegij = (Button) findViewById(R.id.btnKolegij);
        oBtnKolegij.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sKolegij = oInputKolegij.getText().toString();
                Intent oSummaryInfoIntent = new Intent(getApplicationContext(), SummaryActivity.class);
                oSummaryInfoIntent.putExtra("kolegij", sKolegij);
                oSummaryInfoIntent.putExtra("imePrezime", sImePrez);
                startActivity(oSummaryInfoIntent);
                finish();
            }
        });
    }
}