package com.said.oubella.so.essaouiratour.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.said.oubella.so.essaouiratour.R;
import com.said.oubella.so.essaouiratour.databinding.RestaurantItemBinding;
import com.said.oubella.so.essaouiratour.helpers.Helper;
import com.said.oubella.so.essaouiratour.models.Location;
import com.said.oubella.so.essaouiratour.models.Restaurant;

import java.util.List;

public final class RestaurantsAdapter extends RecyclerView.Adapter<RestaurantsAdapter.ViewHolder> {

    private final List<Restaurant> restaurantsList;
    private final ItemClickListener listener;

    public RestaurantsAdapter(List<Restaurant> restaurantsList, ItemClickListener listener) {
        this.restaurantsList = restaurantsList;
        this.listener = listener;
    }

    @NonNull
    @Override
    public RestaurantsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new RestaurantsAdapter.ViewHolder(
                RestaurantItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false)
        );
    }

    @Override
    public void onBindViewHolder(@NonNull RestaurantsAdapter.ViewHolder holder, int position) {
        holder.bind(restaurantsList.get(position), listener);
    }

    @Override
    public int getItemCount() {
        return restaurantsList.size();
    }

    public interface ItemClickListener {
        void onOpenInMapsClicked(Location location);

        void onOpenTripadvisorClicked(String url);
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        private final RestaurantItemBinding binding;

        private ViewHolder(@NonNull RestaurantItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        private void bind(Restaurant restaurant, ItemClickListener listener) {
            binding.title.setText(restaurant.getTitle());
            if (!restaurant.getDescription().isEmpty()) {
                binding.description.setText(restaurant.getDescription());
                binding.description.setVisibility(View.VISIBLE);
            }
            binding.tripadvisorRating.setText(itemView.getContext().getString(R.string.tripadvisor_rating, restaurant.getTripAdvisorRating()));
            binding.address.setText(restaurant.getLocation().getAddress());
            binding.priceRange.setText(restaurant.getPriceRange());
            binding.meals.setText(restaurant.getMeals());
            binding.cuisines.setText(restaurant.getCuisines());
            binding.features.setText(restaurant.getFeatures());
            binding.openInMaps.setOnClickListener(v ->
                    listener.onOpenInMapsClicked(restaurant.getLocation()));
            binding.openTripadvisor.setOnClickListener(v ->
                    listener.onOpenTripadvisorClicked(restaurant.getTripAdvisorLink()));
            Helper.initViewPager(binding.imagesLayout, restaurant.getImagesRes());
        }
    }
}
