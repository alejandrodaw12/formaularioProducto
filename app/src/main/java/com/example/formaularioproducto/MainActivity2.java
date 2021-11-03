package com.example.formaularioproducto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //---------------------------------------------------------------
        Intent intent = getIntent();
        if(intent != null){
            envio e1 = (envio) intent.getSerializableExtra(MainActivity.EXTRA_OBJETO_ENVIO);
            mostrarEnvio(e1);
        }
    }

    private void mostrarEnvio(envio e1) {
        Toast.makeText(this, e1.toString(), Toast.LENGTH_LONG).show();
    }
}