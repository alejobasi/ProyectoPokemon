    package com.example.proyectopokemon;

    import android.view.View;

    import androidx.annotation.NonNull;
    import androidx.recyclerview.widget.RecyclerView;

    import com.example.proyectopokemon.databinding.PokemonViewBinding;

    public class PokemonViewHolder extends RecyclerView.ViewHolder {
        PokemonViewBinding binding;

        public PokemonViewHolder(@NonNull PokemonViewBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
