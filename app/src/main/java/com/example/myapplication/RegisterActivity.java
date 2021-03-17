package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {

    TextView btn;

    private EditText inputUsername,inputPassword,inputEmail,inputConformPassword;
    Button btnRegister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        btn=findViewById(R.id.alreadyHaveAccount);
        inputUsername=findViewById(R.id.inputUsername);
        inputEmail=findViewById(R.id.inputEmail);
        inputPassword=findViewById(R.id.inputPassword);
        inputConformPassword=findViewById(R.id.inputConformPassword);

        btnRegister=findViewById(R.id.btnRegister);
        btnRegister.setOnClickListener(v -> checkCrededentials());




        btn.setOnClickListener(v -> startActivity(new Intent(RegisterActivity.this,LoginActivity.class)));
    }

    private void checkCrededentials(){
        String username=inputUsername.getText().toString();
        String email=inputEmail.getText().toString();
        String password=inputPassword.getText().toString();
        String conformPassword=inputConformPassword.getText().toString();

        if (username.isEmpty()  || username.length()<7)
        {
            showError(inputUsername,"Your username is not valid");
        }
        else if (email.isEmpty()  || !email.contains("@"))
        {
            showError(inputEmail,"Email is not valid");
        }
        else if (password.isEmpty() || password.length()<7)
        {
            showError(inputPassword,"Password must be 7 character");
        }
        else if (conformPassword.isEmpty() || !conformPassword.equals(password))
        {
            showError(inputConformPassword,"password not match!");
        }
        else
        {
            Toast.makeText(this,"Call Registration Method", Toast.LENGTH_SHORT).show();
        }
    }

    private void showError(EditText input, String S) {
        input.setError(S);
        input.requestFocus();
    }
}