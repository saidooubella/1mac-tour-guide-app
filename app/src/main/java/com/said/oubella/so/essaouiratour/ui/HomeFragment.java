package com.said.oubella.so.essaouiratour.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.said.oubella.so.essaouiratour.R;
import com.said.oubella.so.essaouiratour.databinding.FragmentHomeBinding;

public final class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;

    @NonNull
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentHomeBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        final NavController navController = Navigation.findNavController(view);

        binding.restaurantsButton.setOnClickListener(v -> navController.navigate(R.id.action_homeFragment_to_restaurantsFragment));
        binding.activitiesButton.setOnClickListener(v -> navController.navigate(R.id.action_homeFragment_to_activitiesFragment));
        binding.eventsButton.setOnClickListener(v -> navController.navigate(R.id.action_homeFragment_to_eventsFragment));
        binding.hotelsButton.setOnClickListener(v -> navController.navigate(R.id.action_homeFragment_to_hotelsFragment));
        binding.placesButton.setOnClickListener(v -> navController.navigate(R.id.action_homeFragment_to_placesFragment));
    }
}
