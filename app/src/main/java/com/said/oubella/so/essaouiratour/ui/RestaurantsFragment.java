package com.said.oubella.so.essaouiratour.ui;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.said.oubella.so.essaouiratour.EssaouiraTourApp;
import com.said.oubella.so.essaouiratour.adapters.RestaurantsAdapter;
import com.said.oubella.so.essaouiratour.data.DataSource;
import com.said.oubella.so.essaouiratour.databinding.ListLayoutBinding;
import com.said.oubella.so.essaouiratour.helpers.Helper;
import com.said.oubella.so.essaouiratour.models.Location;

public final class RestaurantsFragment extends Fragment {

    private ListLayoutBinding binding;

    @NonNull
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = ListLayoutBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        final EssaouiraTourApp application = (EssaouiraTourApp) requireActivity().getApplication();
        final DataSource dataSource = application.dataSource();

        Helper.initAndSetAdapter(binding.recyclerView, new RestaurantsAdapter(dataSource.getRestaurantsList(), new RestaurantsAdapter.ItemClickListener() {

            @Override
            public void onOpenInMapsClicked(Location location) {
                final Uri uri = Uri.parse("geo:" + location.getLatitude() + "," + location.getLongitude());
                Helper.startActivity(requireActivity(), uri, "There is no available maps app !");
            }

            @Override
            public void onOpenTripadvisorClicked(String url) {
                final Uri uri = Uri.parse(url);
                Helper.startActivity(requireActivity(), uri, "There is no available browser app !");
            }
        }));
    }
}
