package com.example.paperos2app.Activity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.paperos2app.R;

public class LoginActivity extends AppCompatActivity {

    EditText usuario , contrasena;
    Button btn_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.login);
      usuario= findViewById(R.id.emailEditText);
      contrasena= findViewById(R.id.passwordEditText);
      btn_login= findViewById(R.id.btn_login);

    }
}