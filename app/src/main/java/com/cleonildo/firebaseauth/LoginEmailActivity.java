package com.cleonildo.firebaseauth;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class LoginEmailActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText editTextEmail, editTextSenha;
    private Button buttonLogin, buttonRecuperarSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_email);

        editTextEmail = findViewById(R.id.edit_text_email_login);
        editTextSenha = findViewById(R.id.edit_text_senha_login);
        buttonLogin = findViewById(R.id.button_ok_login);
        buttonRecuperarSenha = findViewById(R.id.button_recuperar);

        buttonLogin.setOnClickListener(this);
        buttonRecuperarSenha.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button_ok_login:
                break;
            case R.id.button_recuperar:
                break;
        }

    }
}
