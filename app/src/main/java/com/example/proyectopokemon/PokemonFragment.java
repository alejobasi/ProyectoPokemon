package com.example.proyectopokemon;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.proyectopokemon.databinding.FragmentPokemonBinding;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;


public class PokemonFragment extends Fragment {

FragmentPokemonBinding binding;
    public PokemonFragment() {
        // Required empty public constructor
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding= FragmentPokemonBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
binding.mostrarGeneraciones.setAdapter(new FragmentStateAdapter(this) {
    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new Pokemon_gen1Fragment();
            case 1:
                return new Pokemon_gen2Fragment();
            case 2:
                return new Pokemon_gen3Fragment();
            case 3:
                return new Pokemon_gen4Fragment();
            default:
                return new Pokemon_gen1Fragment();
        }
    }

    @Override
    public int getItemCount() {
        return 4;
    }
});

new TabLayoutMediator(binding.generacionesTap, binding.mostrarGeneraciones, new TabLayoutMediator.TabConfigurationStrategy() {
    @Override
    public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
        switch (position) {
            case 0:
                tab.setText("Generación 1");
                break;
            case 1:
                tab.setText("Generación 2");
                break;
            case 2:
                tab.setText("Generación 3");
                break;
            case 3:
                tab.setText("Generación 4");
                break;
        }
    }
}).attach();
        };
    }
