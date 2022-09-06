package com.ldt.learnexplicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnOpenChild;
    EditText edtNoiDung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnOpenChild = (Button) findViewById(R.id.buttonOpenChildActivity);
        edtNoiDung = (EditText) findViewById(R.id.editTextNoidung);

        btnOpenChild.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openChildActivity();
            }
        });
    }

    void openChildActivity() {
        Intent intent = new Intent(this, ChildActivity.class);
        intent.putExtra("NoiDung", edtNoiDung.getText().toString());
        startActivity(intent);
    }
}