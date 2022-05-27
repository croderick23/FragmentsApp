package com.example.tienda.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.util.Patterns;
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

import java.util.regex.Pattern;

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

    private static final Pattern NAME_PATTERN = Pattern.compile("^[\\p{L}._-]+$");
    private static final Pattern TELEPHONE_PATTERN = Pattern.compile("^[0-9]$");

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
        edtNombreTutorAlm=v.findViewById(R.id.edtNombreTutorAlm);
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
            if(ValidaNombres()){
                Log.d("Aceptado", "Id: " + edtIdAlm.getText());
                Log.d("Aceptado", "N: " + edtNombreAlm.getText());
                Log.d("Aceptado", "P: " + edtApellidoPAlm.getText());
                Log.d("Aceptado", "M: " + edtApellidoMAlm.getText());
                Log.d("Aceptado", "Tel: " + edtTelefonoAlm.getText());
                Log.d("Aceptado", "G: " + edtGrupoAlm.getText());
                Log.d("Aceptado", "C: " + edtCorreoAlm.getText());
                Log.d("Aceptado", "T: " + edtNombreTutorAlm.getText());
            };
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

    //Regresa un false sin importar la causa del error, termina al encontrar elprimer false
    private boolean ValidaNombres() {
        int Flag = 0;
        //Recorta los nombres evitando espacios
        String inputID = edtIdAlm.getText().toString().replace(" ", "");
        String inputNombre = edtNombreAlm.getText().toString().replace(" ", "");
        String inputPaterno = edtApellidoPAlm.getText().toString().replace(" ", "");
        String inputMaterno = edtApellidoMAlm.getText().toString().replace(" ", "");
        String inputTelefono = edtTelefonoAlm.getText().toString().replace(" ", "");
        String inputGrupo = edtGrupoAlm.getText().toString().replace(" ", "");
        String inputCorreo = edtCorreoAlm.getText().toString().replace(" ", "");
        String inputTutor = edtNombreTutorAlm.getText().toString().replace(" ", "");

        Log.d("ID", "Id: " + inputID);
        Log.d("Nombre", "N: " + inputNombre);
        Log.d("Paterno", "P: " + inputPaterno);
        Log.d("Materno", "M: " + inputMaterno);
        Log.d("Telefono", "Tel: " + inputTelefono);
        Log.d("Grupo", "G: " + inputGrupo);
        Log.d("Correo", "C: " + inputCorreo);
        Log.d("Tutor", "T: " + inputTutor);

        //Verifica que no esten vacios
        Flag = 0;
        if (inputID.isEmpty()) {
            Log.d("Datos", "Faltan id: " + inputID);
            edtIdAlm.setError("No puede quedar este campo vacío");
            //return false;
            Flag = 1;
        }
        if (inputNombre.isEmpty()) {
            Log.d("Datos", "Faltan nombre: " + inputNombre);
            edtNombreAlm.setError("No puede quedar este campo vacío");
            //return false;
            Flag = 1;
        }
        if (inputPaterno.isEmpty()) {
            Log.d("Datos", "Faltan paterno: " + inputPaterno);
            edtApellidoPAlm.setError("No puede quedar este campo vacío");
            //return false;
            Flag = 1;
        }
        if (inputMaterno.isEmpty()) {
            Log.d("Datos", "Faltan materno: " + inputMaterno);
            edtApellidoMAlm.setError("No puede quedar este campo vacío");
            //return false;
            Flag = 1;
        }
        if (inputTelefono.isEmpty()) {
            Log.d("Datos", "Faltan telefono: " + inputTelefono);
            edtTelefonoAlm.setError("No puede quedar este campo vacío");
            //return false;
            Flag = 1;
        }
        if (inputGrupo.isEmpty()) {
            Log.d("Datos", "Faltan grupo: " + inputGrupo);
            edtGrupoAlm.setError("No puede quedar este campo vacío");
            //return false;
            Flag = 1;
        }
        if (inputCorreo.isEmpty()) {
            Log.d("Datos", "Faltan correo: " + inputCorreo);
            edtCorreoAlm.setError("No puede quedar este campo vacío");
            //return false;
            Flag = 1;
        }
        if (inputTutor.isEmpty()) {
            Log.d("Datos", "Faltan tutor: " + inputTutor);
            edtNombreTutorAlm.setError("No puede quedar este campo vacío");
            //return false;
            Flag = 1;
        }

        //Revisando que los datos ingresados sean correctos
        //if(!TELEPHONE_PATTERN.matcher(inputTelefono).matches()) {
        //  edtTelefonoAlm.setError("Escriba un telefono válido (10 digitos)");
        //  Log.d("Telfono", "No cunple con la forma: " + inputTelefono);
        //return false;
        //  Flag=1;
        //}
        if (!Patterns.EMAIL_ADDRESS.matcher(inputCorreo).matches()) {
            edtCorreoAlm.setError("Escriba un correo válido");
            Log.d("Correo", "No cunple con la forma: " + inputCorreo);
            //return false;
            Flag = 1;


            if (!Patterns.EMAIL_ADDRESS.matcher(inputCorreo).matches()) {
                edtCorreoAlm.setError("Escriba un correo válido");
                Log.d("Correo", "No cunple con la forma: " + inputCorreo);
                //return false;
                Flag = 1;
            }
            if (!NAME_PATTERN.matcher(inputNombre).matches()) {
                edtNombreAlm.setError("Escriba un nombre válido");
                Log.d("Nombre", "No cumole: " + inputNombre);
                //return false;
                Flag = 1;
            }
            if (!NAME_PATTERN.matcher(inputPaterno).matches()) {
                Log.d("Paterno", "No cmole: " + inputPaterno);
                edtApellidoPAlm.setError("Escriba un apellido válido");
                //return false;
                Flag = 1;
            }
            if (!NAME_PATTERN.matcher(inputMaterno).matches()) {
                Log.d("Materno", "No cpleo: " + inputMaterno);
                edtApellidoMAlm.setError("Escriba un apellido válido");
                //return false;
                Flag = 1;
            }
            if (!NAME_PATTERN.matcher(inputTutor).matches()) {
                Log.d("Tutor", "No Gcumep: " + inputTutor);
                edtNombreTutorAlm.setError("Escriba un nombre válido");
                //return false;
                Flag = 1;
            }
            if (Flag == 1) {
                return false;
            } else {
                return true;
            }
        }
        return true;
    }

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

