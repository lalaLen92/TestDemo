package com.example.testdemo;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private EditText ed_userid;
    private EditText ed_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ed_userid = findViewById(R.id.userid);
        ed_password = findViewById(R.id.password);
    }

    public void login(View view){
        String userid = ed_userid.getText().toString();
        String pw = ed_password.getText().toString();
        if("jack".equals(userid) && "1234".equals(pw)){
            Toast.makeText(this,"登入成功", Toast.LENGTH_LONG)
                    .show();
            finish();
        } else{
            Toast.makeText(this,"登入失敗，請再試一次", Toast.LENGTH_LONG)
                    .show();
        }
    }

    public void quit(View view){
        finish();
        onDestroy();

    }
}