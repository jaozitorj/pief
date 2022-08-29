package com.example.pief;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import android.os.Bundle;
import android.view.MenuItem;
import com.example.pief.databinding.ActivityTelainicialBinding;
import com.google.android.material.navigation.NavigationBarView;

public class telainicial extends AppCompatActivity {
    ActivityTelainicialBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityTelainicialBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.bottombar.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.Home:
                        replaceFragment(new HomeFragment());
                        break;
                    case R.id.Procurar:
                        replaceFragment(new ProcurarFragment());
                        break;
                    case R.id.Agenda:
                        replaceFragment(new AgendaFragment());
                        break;
                }
                return true;
            }
        });
    }
    private void replaceFragment(Fragment fragment){
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.framelayout, fragment);
        transaction.commit();
    }
}