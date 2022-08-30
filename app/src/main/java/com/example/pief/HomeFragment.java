package com.example.pief;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class HomeFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        ImageButton notificacao = view.findViewById(R.id.notificacao);
        View doutor = view.findViewById(R.id.doutor1);
        TextView vertodos = view.findViewById(R.id.vertodos);

        vertodos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), categoris.class);
                startActivity(intent);
            }
        });

        notificacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), notificacao.class);
                startActivity(intent);
            }
        });

        doutor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), servicos.class);
                startActivity(intent);
            }
        });

        return view;
    }
}