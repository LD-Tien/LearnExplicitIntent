package com.ldt.learnexplicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ChildActivity extends AppCompatActivity {

    Button btnBackToMain;
    TextView tvNoiDung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child);

        btnBackToMain = (Button) findViewById(R.id.buttonBackToMainActivity);
        tvNoiDung = (TextView) findViewById(R.id.textViewNoiDung);
        Intent i = getIntent();
        tvNoiDung.setText( (String) intent.getSerializableExtra("NoiDung"));
        btnBackToMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMainActivity();
            }
        });
    }

    void openMainActivity(){
        Intent intent = new Intent(this, MainActivity.class);

        startActivity(intent);
    }
}