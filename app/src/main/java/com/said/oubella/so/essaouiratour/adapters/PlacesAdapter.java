package com.said.oubella.so.essaouiratour.adapters;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.said.oubella.so.essaouiratour.databinding.PlaceItemBinding;
import com.said.oubella.so.essaouiratour.helpers.Helper;
import com.said.oubella.so.essaouiratour.models.Location;
import com.said.oubella.so.essaouiratour.models.Place;

import java.util.List;

public final class PlacesAdapter extends RecyclerView.Adapter<PlacesAdapter.ViewHolder> {

    private final List<Place> placesList;
    private final ItemClickListener listener;

    public PlacesAdapter(List<Place> placesList, ItemClickListener listener) {
        this.placesList = placesList;
        this.listener = listener;
    }

    @NonNull
    @Override
    public PlacesAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new PlacesAdapter.ViewHolder(
                PlaceItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false)
        );
    }

    @Override
    public void onBindViewHolder(@NonNull PlacesAdapter.ViewHolder holder, int position) {
        holder.bind(placesList.get(position), listener);
    }

    @Override
    public int getItemCount() {
        return placesList.size();
    }

    public interface ItemClickListener {
        void onOpenInMapsClicked(Location location);
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        private final PlaceItemBinding binding;

        private ViewHolder(@NonNull PlaceItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        private void bind(Place place, ItemClickListener listener) {
            binding.title.setText(place.getTitle());
            binding.description.setText(place.getDescription());
            binding.openingTime.setText(place.getOpeningTime());
            binding.price.setText(place.getPrice());
            binding.address.setText(place.getLocation().getAddress());
            binding.openInMaps.setOnClickListener(v ->
                    listener.onOpenInMapsClicked(place.getLocation()));
            Helper.initViewPager(binding.imagesLayout, place.getImagesRes());
        }
    }
}
