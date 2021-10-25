package com.example.personalinfoactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PersonalInfoActivity extends AppCompatActivity {

    private EditText textInput;
    private Button buttonUnos;
    private String sImePrez;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textInput = (EditText)findViewById(R.id.inputImePrez);

        buttonUnos = (Button) findViewById(R.id.btnUnos);
        buttonUnos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sImePrez = textInput.getText().toString();
                Intent oStudentInfoIntent = new Intent(getApplicationContext(), StudentInfoActivity.class);
                oStudentInfoIntent.putExtra("imePrezime", sImePrez);
                startActivity(oStudentInfoIntent);
                finish();
            }
        });
    }
}