package com.example.pief;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        EditText senha = findViewById(R.id.editText2);
        Button login = findViewById(R.id.button3);

        ImageView imageViewShowHidePwd = findViewById(R.id.mostrarsenha);
        imageViewShowHidePwd.setImageResource(R.drawable.ic_hide_pwd);
        imageViewShowHidePwd.setOnClickListener(v -> {
            if (senha.getTransformationMethod().equals(HideReturnsTransformationMethod.getInstance())) {
                senha.setTransformationMethod(PasswordTransformationMethod.getInstance());
                imageViewShowHidePwd.setImageResource(R.drawable.ic_hide_pwd);

            } else {
                senha.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                imageViewShowHidePwd.setImageResource(R.drawable.ic_show_pwd);
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(login.this, telainicial.class);
                startActivity(intent);
            }
        });
    }
}