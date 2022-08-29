package com.example.pief;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import com.example.pief.databinding.ActivityServicosBinding;
import com.google.android.material.tabs.TabLayoutMediator;

public class servicos extends AppCompatActivity {
    ActivityServicosBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityServicosBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(servicos.this, telainicial.class);
                startActivity(intent);
            }
        });
        configTablayout();
    }
    private void configTablayout(){
        ViewPagerAdapter adapter = new ViewPagerAdapter(this);
        binding.viewpager.setAdapter(adapter);

        adapter.addFragment(new menuFragment(), "Menu");
        adapter.addFragment(new servicosFragment(), "Serviço");
        binding.viewpager.setOffscreenPageLimit(adapter.getItemCount());

        TabLayoutMediator mediator = new TabLayoutMediator(binding.tabs, binding.viewpager, (tab, position) -> {
            tab.setText(adapter.getTitle(position));
        });
        mediator.attach();
    }
}