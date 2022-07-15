package com.cleonildo.firebaseauth;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class CadastrarActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText edit_text_email, edit_text_senha, edit_text_senha_repetir;
    private Button button_cadastrar, button_cancelar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadatras);

        this.edit_text_email = findViewById(R.id.edit_text_email);
        this.edit_text_senha = findViewById(R.id.edit_text_senha);
        this.edit_text_senha_repetir = findViewById(R.id.edit_text_repetir_senha);

        this.button_cadastrar = findViewById(R.id.button_cadastrar_usuario);
        this.button_cancelar = findViewById(R.id.button_cancelar);

        this.button_cadastrar.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button_cadastrar_usuario:
                cadastrar();
                break;
        }
    }

    private void cadastrar() {
        Toast.makeText(this, "Fui Clickado", Toast.LENGTH_LONG).show();
    }
}
