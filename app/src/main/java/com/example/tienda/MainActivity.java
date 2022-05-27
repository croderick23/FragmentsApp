package com.example.tienda;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.tienda.fragments.ActividadFragment;
import com.example.tienda.fragments.AlumnoFragment;
import com.example.tienda.fragments.GruposFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {
    //region Objetos fragment
    private AlumnoFragment alumnoFragment;
    private GruposFragment gruposFragment;
    private ActividadFragment actividadFragment;
    //endregion

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView btmNavigationPrincipal;
        btmNavigationPrincipal = findViewById(R.id.btnNavigationPrincipal);
        btmNavigationPrincipal.setOnItemSelectedListener(navListener);
        alumnoFragment = new AlumnoFragment();
        gruposFragment = new GruposFragment();
        actividadFragment = new ActividadFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContenedor,alumnoFragment).commit();
    }

        NavigationBarView.OnItemSelectedListener navListener = new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch(item.getItemId())
                {
                    case R.id.nav_alumnos:
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContenedor,alumnoFragment).commit();
                        Toast.makeText(getApplicationContext(),"Almunos",Toast.LENGTH_SHORT).show();
                                break;
                    case R.id.nav_grupos:
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContenedor,gruposFragment).commit();
                        Toast.makeText(getApplicationContext(),"Grupos",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.nav_calificaciones:
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContenedor,actividadFragment).commit();
                        Toast.makeText(getApplicationContext(),"Actividad",Toast.LENGTH_SHORT).show();
                        break;
                }
                return true;
            }
        };
    }