package com.said.oubella.so.essaouiratour.adapters;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.said.oubella.so.essaouiratour.R;
import com.said.oubella.so.essaouiratour.databinding.HotelItemBinding;
import com.said.oubella.so.essaouiratour.helpers.Helper;
import com.said.oubella.so.essaouiratour.models.Hotel;
import com.said.oubella.so.essaouiratour.models.Location;

import java.util.List;

public final class HotelsAdapter extends RecyclerView.Adapter<HotelsAdapter.ViewHolder> {

    private final List<Hotel> hotelsList;
    private final ItemClickListener listener;

    public HotelsAdapter(List<Hotel> hotelsList, ItemClickListener listener) {
        this.hotelsList = hotelsList;
        this.listener = listener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new HotelsAdapter.ViewHolder(
                HotelItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false)
        );
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bind(hotelsList.get(position), listener);
    }

    @Override
    public int getItemCount() {
        return hotelsList.size();
    }

    public interface ItemClickListener {
        void onOpenInMapsClicked(Location location);

        void onOpenTripadvisorClicked(String url);
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        private final HotelItemBinding binding;

        private ViewHolder(@NonNull HotelItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        private void bind(Hotel hotel, ItemClickListener listener) {
            binding.title.setText(hotel.getTitle());
            binding.description.setText(hotel.getDescription());
            binding.tripadvisorRating.setText(itemView.getContext().getString(R.string.tripadvisor_rating, hotel.getTripAdvisorRating()));
            binding.address.setText(hotel.getLocation().getAddress());
            binding.propertyAmenities.setText(hotel.getPropertyAmenities());
            binding.roomFeatures.setText(hotel.getRoomFeatures());
            binding.roomTypes.setText(hotel.getRoomTypes());
            binding.openInMaps.setOnClickListener(v ->
                    listener.onOpenInMapsClicked(hotel.getLocation()));
            binding.openTripadvisor.setOnClickListener(v ->
                    listener.onOpenTripadvisorClicked(hotel.getTripAdvisorLink()));
            Helper.initViewPager(binding.imagesLayout, hotel.getImagesRes());
        }
    }
}
