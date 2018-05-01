package com.tcc.si4an.sistemafidelidade.Login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.tcc.si4an.sistemafidelidade.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void btEntrar (View view){
        startActivity(new Intent(this,LoginActivity.class));
    }
    public void btCadastrar (View view){
        startActivity(new Intent(this,CadastroActivity.class));
    }
}
