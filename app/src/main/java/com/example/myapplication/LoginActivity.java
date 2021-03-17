package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    TextView btn;
    EditText inputEmail,inputPassword;
    Button btnLogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btn=findViewById(R.id.textviewSignUp);
        inputEmail=findViewById(R.id.inputEmail);
        inputPassword=findViewById(R.id.inputPassword);
        btnLogin=findViewById(R.id.btnlogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkCrededentials();
            }
        });



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this,RegisterActivity.class));
            }
        });
    }

    private void checkCrededentials(){

        String email=inputEmail.getText().toString();
        String password=inputPassword.getText().toString();


         if (email.isEmpty()  || !email.contains("@"))
        {
            showError(inputEmail,"Email is not valid");
        }
        else if (password.isEmpty() || password.length()<7)
        {
            showError(inputPassword,"Password must be 7 character");
        }

        else
        {
            Toast.makeText(this,"Call Login Method", Toast.LENGTH_SHORT).show();
        }
    }

    private void showError(EditText input, String S) {
        input.setError(S);
        input.requestFocus();
    }
}