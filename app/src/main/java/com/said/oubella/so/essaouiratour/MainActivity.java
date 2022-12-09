package com.said.oubella.so.essaouiratour;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.WindowCompat;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

import com.said.oubella.so.essaouiratour.databinding.ActivityMainBinding;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        WindowCompat.setDecorFitsSystemWindows(getWindow(), true);

        final NavController navController = ((NavHostFragment) Objects.requireNonNull(getSupportFragmentManager()
                .findFragmentById(R.id.main_host_fragment)))
                .getNavController();

        setSupportActionBar(binding.toolbar);

        NavigationUI.setupWithNavController(binding.collapsingToolbar, binding.toolbar, navController, binding.drawerLaoyut);
        NavigationUI.setupWithNavController(binding.drawerNavView, navController);

        navController.addOnDestinationChangedListener((controller, destination, arguments) ->
                binding.appBar.setExpanded(destination.getId() == R.id.homeFragment, true));
    }

    @Override
    public void onBackPressed() {
        if (binding.drawerLaoyut.isOpen()) {
            binding.drawerLaoyut.close();
        } else {
            super.onBackPressed();
        }
    }
}
