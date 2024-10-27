package com.example.proyectopokemon;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.proyectopokemon.databinding.PokemonViewBinding;

public class PokemonAdapter extends RecyclerView.Adapter<PokemonViewHolder> {
    @NonNull
    @Override
    public PokemonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new PokemonViewHolder(PokemonViewBinding.inflate(LayoutInflater.from(parent.getContext()), parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull PokemonViewHolder holder, int position) {

        Pokemon pokemon=

    }


    @Override
    public int getItemCount() {
        return 0;
    }
}
