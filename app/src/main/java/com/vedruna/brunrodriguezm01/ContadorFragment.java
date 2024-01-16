package com.vedruna.brunrodriguezm01;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class ContadorFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_contador, container, false);

        // Obtener el nombre de usuario desde la actividad
        String username = getActivity().getIntent().getStringExtra("username");

        // Encontrar el TextView en el layout del fragment
        TextView txtUsername = view.findViewById(R.id.txtUsername);

        // Establecer el texto en el TextView
        txtUsername.setText("Bienvenido " + username);

        return view;
    }
}