package com.example.tienda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SesionActivity extends AppCompatActivity {
private EditText edtNombre;
private EditText edtPassword;
private Button btnEntrar;
private String usuario="";
private String password="";
private TextView txtvRegistro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sesion);
        edtNombre=findViewById(R.id.edtNombre);
        edtPassword=findViewById(R.id.edtPassword);
        btnEntrar=findViewById(R.id.btnEntrar);
        btnEntrar.setOnClickListener(onClickEntrar);  //lamada a interfaz al hacer click
        txtvRegistro=findViewById(R.id.txtvRegistro);
        cargarReferencias();
    }

    private void cargarReferencias() {
        SharedPreferences preferences=getSharedPreferences(getResources().getString(R.string.strCredenciales),MODE_PRIVATE);
        SharedPreferences.Editor editor=preferences.edit();

        String user = preferences.getString(getResources().getString(R.string.strUser),getResources().getString(R.string.strNoUsuarios)); //Extrae dato user de archivo credenciales, si no pon default
        String password = preferences.getString(getResources().getString(R.string.strPassword),"");
        edtNombre.setText(user);
        edtPassword.setText(password);
    }

    View.OnClickListener onClickEntrar= new View.OnClickListener() {  //interfaz
        @Override
        public void onClick(View view) {
            if (Valida()) {   //sí true
                Intent intMain = new Intent(SesionActivity.this,MainActivity.class);
                startActivity(intMain);
            }
            else {
                Toast.makeText(getApplicationContext(), "usuario o contraseña incorrecta", Toast.LENGTH_LONG).show(); //sí no mensaje
            }
        }
    };

    private boolean Valida()
    {
        try {
            usuario = edtNombre.getText().toString();
            password = edtPassword.getText().toString();
        }
        catch(Exception error)
        {
        Log.d("Login","Error en los datos: "+error.toString());    //try catch nums
        }

        if(usuario.equals("armando")&&password.equals("armando"))  //como comparar cadenas
        {
            return true;
        }
        else {
            return false;
        }
    }
}