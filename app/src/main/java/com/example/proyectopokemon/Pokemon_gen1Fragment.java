package com.example.proyectopokemon;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;

import com.example.proyectopokemon.databinding.FragmentPokemonGen1Binding;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * create an instance of this fragment.
 */
public class Pokemon_gen1Fragment extends Fragment {
FragmentPokemonGen1Binding binding;


    public Pokemon_gen1Fragment() {
        // Required empty public constructor
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
    binding=FragmentPokemonGen1Binding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        List<Pokemon>lista=Pokemon.generarPrimeraGen();

        binding.recyclerGen1.setAdapter(new PokemonAdapter(lista));
        GridLayoutManager gridLayoutManager=new GridLayoutManager(requireContext(),1);

        binding.recyclerGen1.setLayoutManager(gridLayoutManager);


}}