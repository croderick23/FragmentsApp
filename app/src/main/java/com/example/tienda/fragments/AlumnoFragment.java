package com.example.tienda.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.tienda.MainActivity;
import com.example.tienda.R;
import com.example.tienda.SesionActivity;

public class AlumnoFragment extends Fragment {
    private EditText edtIdAlm;
    private ImageButton btnBuscarAlm;
    private EditText edtNombreAlm;
    private EditText edtApellidoPAlm;
    private EditText edtApellidoMAlm;
    private EditText edtCorreoAlm;
    private EditText edtTelefonoAlm;
    private EditText edtNombreTutorAlm;
    private EditText edtGrupoAlm;
    private Button btnAgregarAlm;
    private Button btnEditarAlm;
    private Button btnEliminarAlm;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) { //Oncreate lo metió todu
        View v = inflater.inflate(R.layout.fragment_alumno, container, false);
        edtIdAlm=v.findViewById(R.id.edtIdAlm);
        btnBuscarAlm=v.findViewById(R.id.btnBuscarAlm);
        btnBuscarAlm.setOnClickListener(onClickbtnBuscarAlm);
        edtNombreAlm=v.findViewById(R.id.edtNombreAlm);
        edtApellidoPAlm=v.findViewById(R.id.edtApellidoPAlm);
        edtApellidoMAlm=v.findViewById(R.id.edtApellidoMAlm);
        edtTelefonoAlm=v.findViewById(R.id.edtTelefonoAlm);
        edtGrupoAlm=v.findViewById(R.id.edtGrupoAlm);
        edtCorreoAlm=v.findViewById(R.id.edtCorreoAlm);
        edtNombreTutorAlm=v.findViewById(R.id.edtNombreAlm);
        btnAgregarAlm=v.findViewById(R.id.btnAgregarAlm);
        btnAgregarAlm.setOnClickListener(onClickbtnAgregarAlm);
        btnEditarAlm=v.findViewById(R.id.btnEditarAlm);
        btnEditarAlm.setOnClickListener(onClickbtnEditarAlm);
        btnEliminarAlm=v.findViewById(R.id.btnEliminarAlm);
        btnEliminarAlm.setOnClickListener(onClickbtnEliminarAlm);
        return v;
    }
    View.OnClickListener onClickbtnAgregarAlm= new View.OnClickListener() {  //interfaz
        @Override
        public void onClick(View view) {
/*            if (Valida()) {   //sí true
                Intent intMain = new Intent(SesionActivity.this, MainActivity.class);
                startActivity(intMain);
            }
            else {
                Toast.makeText(getApplicationContext(), "usuario o contraseña incorrecta", Toast.LENGTH_LONG).show(); //sí no mensaje
            }   */
        }
    };
/*   private boolean Valida() {
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
    }   */

    View.OnClickListener onClickbtnBuscarAlm= new View.OnClickListener() {  //interfaz
        @Override
        public void onClick(View view) {
        }
    };
    View.OnClickListener onClickbtnEditarAlm= new View.OnClickListener() {  //interfaz
        @Override
        public void onClick(View view) {
        }
    };

    View.OnClickListener onClickbtnEliminarAlm= new View.OnClickListener() {  //interfaz
        @Override
        public void onClick(View view) {
        }
    };

}
