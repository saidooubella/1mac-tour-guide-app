package com.said.oubella.so.essaouiratour.helpers;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import com.bumptech.glide.Glide;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.said.oubella.so.essaouiratour.databinding.ImagesPagerBinding;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class Helper {

    private static final AppBarLayout.Behavior APPBAR_LAYOUT_BEHAVIOR = new AppBarLayout.Behavior();

    private Helper() {
        throw new AssertionError();
    }

    public static void initAndSetAdapter(@NonNull RecyclerView recyclerView, RecyclerView.Adapter<?> adapter) {
        recyclerView.addItemDecoration(new ItemDecorator(16));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter);
    }

    public static void initViewPager(@NonNull final ImagesPagerBinding binding, final List<Integer> images) {

        final int imagesSize = images.size();

        binding.rightArrowIndicator.setVisibility(imagesSize > 1 ? View.VISIBLE : View.GONE);
        binding.leftArrowIndicator.setVisibility(View.GONE);

        binding.imagesPager.setOffscreenPageLimit(1);
        binding.imagesPager.setAdapter(new ImagesAdapter(images));

        final ViewPager2.OnPageChangeCallback changeCallback = new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                binding.leftArrowIndicator.setVisibility(position != 0 ? View.VISIBLE : View.GONE);
                binding.rightArrowIndicator.setVisibility(position != imagesSize - 1 ? View.VISIBLE : View.GONE);
            }
        };

        binding.imagesPager.registerOnPageChangeCallback(changeCallback);
    }

    @NonNull
    @SafeVarargs
    public static <T> List<T> listOf(T... elements) {
        return Collections.unmodifiableList(Arrays.asList(elements));
    }

    public static void startActivity(Activity activity, Uri data, String notAvailableMessage) {
        final Intent intent = new Intent(Intent.ACTION_VIEW, data);
        if (intent.resolveActivity(activity.getPackageManager()) == null) {
            Toast.makeText(activity, notAvailableMessage, Toast.LENGTH_SHORT).show();
        } else activity.startActivity(intent);
    }

    private static final class ImagesAdapter extends RecyclerView.Adapter<ImagesAdapter.ViewHolder> {

        private final List<Integer> images;

        private ImagesAdapter(List<Integer> images) {
            this.images = images;
        }

        @NonNull
        @Override
        public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            AppCompatImageView imageView = new AppCompatImageView(parent.getContext());
            imageView.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.MATCH_PARENT));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            return new ViewHolder(imageView);
        }

        @Override
        public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
            holder.bind(images.get(position));
        }

        @Override
        public int getItemCount() {
            return images.size();
        }

        private static final class ViewHolder extends RecyclerView.ViewHolder {

            private final AppCompatImageView imageView;

            private ViewHolder(@NonNull AppCompatImageView imageView) {
                super(imageView);
                this.imageView = imageView;
            }

            private void bind(Integer imageResource) {
                Glide.with(imageView.getContext()).load(imageResource).into(imageView);
            }
        }
    }
}
