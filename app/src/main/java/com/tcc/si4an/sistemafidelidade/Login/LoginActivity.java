package com.tcc.si4an.sistemafidelidade.Login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.tcc.si4an.sistemafidelidade.HomeActivity;
import com.tcc.si4an.sistemafidelidade.R;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    // temporario apenas para testar o app
    public void btLogar (View view){
        startActivity(new Intent(this,HomeActivity.class));
    }

}
