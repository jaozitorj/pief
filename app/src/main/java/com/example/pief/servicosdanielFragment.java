package com.example.pief;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

public class servicosdanielFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_servicosdaniel, container, false);

        Button corte1 = view.findViewById(R.id.corte1);
        Button corte2 = view.findViewById(R.id.corte2);
        Button barba = view.findViewById(R.id.barba);
        Button sobrancelha = view.findViewById(R.id.sobrancelha);

        sobrancelha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(requireContext(), agendamedico.class);
                startActivity(intent);
            }
        });

        corte1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(requireContext(), agendamedico.class);
                startActivity(intent);
            }
        });
        corte2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(requireContext(), agendamedico.class);
                startActivity(intent);
            }
        });
        barba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(requireContext(), agendamedico.class);
                startActivity(intent);
            }
        });


        return view;
    }
}