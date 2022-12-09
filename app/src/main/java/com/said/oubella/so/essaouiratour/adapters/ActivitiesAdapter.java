package com.said.oubella.so.essaouiratour.adapters;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.said.oubella.so.essaouiratour.databinding.ActivityItemBinding;
import com.said.oubella.so.essaouiratour.helpers.Helper;
import com.said.oubella.so.essaouiratour.models.Activity;

import java.util.List;

public final class ActivitiesAdapter extends RecyclerView.Adapter<ActivitiesAdapter.ViewHolder> {

    private final List<Activity> activitiesList;

    public ActivitiesAdapter(List<Activity> activitiesList) {
        this.activitiesList = activitiesList;
    }

    @NonNull
    @Override
    public ActivitiesAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ActivitiesAdapter.ViewHolder(
                ActivityItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false)
        );
    }

    @Override
    public void onBindViewHolder(@NonNull ActivitiesAdapter.ViewHolder holder, int position) {
        holder.bind(activitiesList.get(position));
    }

    @Override
    public int getItemCount() {
        return activitiesList.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        private final ActivityItemBinding binding;

        private ViewHolder(@NonNull ActivityItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        private void bind(@NonNull Activity activity) {
            binding.title.setText(activity.getTitle());
            binding.description.setText(activity.getDescription());
            Helper.initViewPager(binding.imagesLayout, activity.getImagesRes());
        }
    }
}
