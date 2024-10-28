package com.example.proyectopokemon;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.proyectopokemon.databinding.PokemonViewBinding;

import java.util.List;

public class PokemonAdapter extends RecyclerView.Adapter<PokemonViewHolder> {

    private final List<Pokemon> listaDePokemon;


    public PokemonAdapter(List<Pokemon> lista) {
        this.listaDePokemon = lista;
    }

    @NonNull
    @Override
    public PokemonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new PokemonViewHolder(PokemonViewBinding.inflate(LayoutInflater.from(parent.getContext()), parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull PokemonViewHolder holder, int position) {

        Pokemon pokemon= listaDePokemon.get(position);
        //holder.binding.imagenPokemonView.setImageResource();
        holder.binding.nombrePokemonView.setText(pokemon.getNombre());

    }


    @Override
    public int getItemCount() {
        return Pokemon.generarPrimeraGen().size();
    }
}
