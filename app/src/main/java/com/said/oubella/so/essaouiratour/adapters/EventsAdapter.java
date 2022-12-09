package com.said.oubella.so.essaouiratour.adapters;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.said.oubella.so.essaouiratour.databinding.EventItemBinding;
import com.said.oubella.so.essaouiratour.helpers.Helper;
import com.said.oubella.so.essaouiratour.models.Event;

import java.util.List;

public final class EventsAdapter extends RecyclerView.Adapter<EventsAdapter.ViewHolder> {

    private final List<Event> eventsList;

    public EventsAdapter(List<Event> eventsList) {
        this.eventsList = eventsList;
    }

    @NonNull
    @Override
    public EventsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new EventsAdapter.ViewHolder(
                EventItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false)
        );
    }

    @Override
    public void onBindViewHolder(@NonNull EventsAdapter.ViewHolder holder, int position) {
        holder.bind(eventsList.get(position));
    }

    @Override
    public int getItemCount() {
        return eventsList.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        private final EventItemBinding binding;

        private ViewHolder(@NonNull EventItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        private void bind(Event event) {
            binding.title.setText(event.getTitle());
            binding.description.setText(event.getDescription());
            Helper.initViewPager(binding.imagesLayout, event.getImagesRes());
        }
    }
}
