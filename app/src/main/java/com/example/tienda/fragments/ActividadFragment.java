package com.example.tienda.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.tienda.R;

public class  ActividadFragment extends Fragment {
    private EditText edtNombreAct;
    private EditText edtPonderacionAct;
    private EditText edtgrupoAct;
    private EditText edtNombreTutorAct;
    private Button btnAgregarAct;
    private Button btnEditarAct;
    private Button btnEliminarAct;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) { //Oncreate lo metió todu
        View v = inflater.inflate(R.layout.fragment_actividad, container, false);
        edtNombreAct = v.findViewById(R.id.edtNombreAct);
        edtPonderacionAct = v.findViewById(R.id.edtPonderacionAct);
        edtgrupoAct = v.findViewById(R.id.edtGrupoAct);
        edtNombreTutorAct = v.findViewById(R.id.edtNombreTutorAct);
        btnAgregarAct = v.findViewById(R.id.btnAgregarAct);
        btnAgregarAct.setOnClickListener(onClickbtnAgregarAct);
        btnEditarAct = v.findViewById(R.id.btnEditarAct);
        btnEditarAct.setOnClickListener(onClickbtnEditarAct);
        btnEliminarAct = v.findViewById(R.id.btnEliminarAct);
        btnEliminarAct.setOnClickListener(onClickbtnEliminarAct);
        return v;
    }

    View.OnClickListener onClickbtnAgregarAct = new View.OnClickListener() {  //interfaz
        @Override
        public void onClick(View view) {
        /*    if (Valida()) {   //sí true
                //conexion con base de datos
            }
            else {
                Toast.makeText(getApplicationContext(), "Formato Incorrecto", Toast.LENGTH_LONG).show(); //sí no mensaje
            }   */
        }
    };
/*    private boolean ValidaPonderacionAct()
    {
    String passwordInput=textInput
        try {
            usuario = edtNombre.getText  n ().toString();
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

    View.OnClickListener onClickbtnEditarAct = new View.OnClickListener() {  //interfaz
        @Override
        public void onClick(View view) {
        }
    };

    View.OnClickListener onClickbtnEliminarAct = new View.OnClickListener() {  //interfaz
        @Override
        public void onClick(View view) {
        }
    };

}


