package com.example.proyectopokemon;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;

import com.example.proyectopokemon.databinding.ActivityMainBinding;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {
ActivityMainBinding binding;
NavController navController;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        NavHostFragment navHostFragment=(NavHostFragment) getSupportFragmentManager().findFragmentById(binding.fragmentContainerView.getId());
        navController=navHostFragment.getNavController();

       binding.bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
           @Override
           public boolean onNavigationItemSelected(@NonNull MenuItem item) {
               if (item.getItemId()==R.id.pokemon){
                   navController.navigate(R.id.pokemonFragment);
               } else if (item.getItemId()==R.id.pokedex){
                   navController.navigate(R.id.pokedexFragment);
               } else if (item.getItemId()==R.id.sobres){
                   navController.navigate(R.id.sobresFragment);
               }
               return true;
           }
       });
    }
}