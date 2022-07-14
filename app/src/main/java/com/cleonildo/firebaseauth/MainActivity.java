package com.cleonildo.firebaseauth;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.ktx.Firebase;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button buttonLogin, buttonCadastrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.buttonLogin.findViewById(R.id.button_login);
        this.buttonCadastrar.findViewById(R.id.button_cadastrar);

        this.buttonLogin.setOnClickListener(this);
        this.buttonCadastrar.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button_login:
                break;
            case R.id.button_cadastrar:
                startActivity(new Intent(this, CadastrarActivity.class));
                break;
        }
    }
}