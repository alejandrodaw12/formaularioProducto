package com.example.formaularioproducto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_OBJETO_ENVIO = "hola";
    private EditText edt_idproductos;
    private EditText edt_nombre;
    private EditText edt_direccion;
    private EditText edt_telefono;

    //----------------------------------------------------
    private String idproducto;
    private String nombre;
    private String direccion;
    private String telefono;
    private String envio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt_idproductos = (EditText) findViewById(R.id.edt_idproductos);
        edt_nombre = (EditText) findViewById(R.id.edt_nombre);
        edt_direccion = (EditText) findViewById(R.id.edt_direccion);
        edt_telefono = (EditText) findViewById(R.id.edt_telefono);
        envio = "normal";
    }

    public void siguiente(View view) {
        idproducto = String.valueOf(edt_idproductos.getText());
        nombre = String.valueOf(edt_nombre.getText());
        direccion = String.valueOf(edt_direccion.getText());
        telefono = String.valueOf(edt_telefono.getText());
        //---------------------------------------------------------------
        envio e1 = new envio(idproducto,nombre,direccion,telefono,envio);
        //---------------------------------------------------------------
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra(EXTRA_OBJETO_ENVIO, e1);
        startActivity(intent);
    }

    public void asignarEnvio(View view) {
        RadioButton rb1 = (RadioButton) view;
        if(rb1.isChecked()){
            switch(rb1.getId()){
                case R.id.rb_envioLento:
                    envio = "lento";
                    break;
                case R.id.rb_envioNormal:
                    envio = "normal";
                    break;
                case R.id.rb_envioUrgente:
                    envio = "urgente";
                    break;
            }
            Toast.makeText(this, "El tipo de envio es ahora " + envio, Toast.LENGTH_SHORT).show();
        }
    }
}