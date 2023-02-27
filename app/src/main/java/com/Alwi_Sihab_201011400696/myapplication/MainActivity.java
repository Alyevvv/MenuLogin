package com.Alwi_Sihab_201011400696.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText etusername, etpassword;
    private Button btnLogin, btnSignUp;

    private String username = "Alwi";
    private String password = "123456";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etusername = findViewById(R.id.etusername);
        etpassword = findViewById(R.id.etpassword);
        btnLogin = findViewById(R.id.btnLogin);
        btnSignUp = findViewById(R.id.btnSignUp);

        btnLogin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (etusername.getText().toString().equalsIgnoreCase(username) && etpassword.getText().toString().equalsIgnoreCase(password)){
                    Intent login = new Intent(MainActivity.this, DashBoard.class);
                    startActivity(login);

                    Toast.makeText(MainActivity.this, "Login Berhasil", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(MainActivity.this, "Login Gagal", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}