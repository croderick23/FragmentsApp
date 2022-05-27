package com.example.tienda.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.Fragment;

import com.example.tienda.R;

public class GruposFragment extends Fragment {

    private ListView lstGrupos;
    private String [] productos;
    private String productSelect;
    private AppCompatTextView actvSeleccionadoGrupos;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) { //Oncreate lo metió todu
        View v = inflater.inflate(R.layout.fragment_grupos, container, false);
        lstGrupos=v.findViewById(R.id.lstGrupos);
        actvSeleccionadoGrupos = v.findViewById(R.id.actvSeleccionadoGrupos);
        registerForContextMenu(lstGrupos);
        return v;
    }

}
