package com.said.oubella.so.essaouiratour.models;

import java.util.Collections;
import java.util.List;

public final class Restaurant {

    private final List<Integer> imagesRes;
    private final String title;
    private final String description;
    private final String tripAdvisorLink;
    private final float tripAdvisorRating;
    private final String priceRange;
    private final String cuisines;
    private final String meals;
    private final String features;
    private final Location location;

    private Restaurant(List<Integer> imagesRes, String title, String description, String tripAdvisorLink, float tripAdvisorRating, String priceRange, String cuisines, String meals, String features, Location location) {
        this.imagesRes = imagesRes;
        this.title = title;
        this.description = description;
        this.tripAdvisorLink = tripAdvisorLink;
        this.tripAdvisorRating = tripAdvisorRating;
        this.priceRange = priceRange;
        this.cuisines = cuisines;
        this.meals = meals;
        this.features = features;
        this.location = location;
    }

    public List<Integer> getImagesRes() {
        return imagesRes;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getTripAdvisorLink() {
        return tripAdvisorLink;
    }

    public float getTripAdvisorRating() {
        return tripAdvisorRating;
    }

    public String getPriceRange() {
        return priceRange;
    }

    public String getCuisines() {
        return cuisines;
    }

    public String getMeals() {
        return meals;
    }

    public String getFeatures() {
        return features;
    }

    public Location getLocation() {
        return location;
    }

    public static final class Builder {

        private List<Integer> imagesRes = Collections.emptyList();
        private String title = "";
        private String description = "";
        private String tripAdvisorLink = "";
        private float tripAdvisorRating = 0F;
        private String priceRange = "";
        private String cuisines = "";
        private String meals = "";
        private String features = "";
        private Location location = Location.EMPTY;

        public Builder setImagesRes(List<Integer> imagesRes) {
            this.imagesRes = imagesRes;
            return this;
        }

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setTripAdvisorLink(String tripAdvisorLink) {
            this.tripAdvisorLink = tripAdvisorLink;
            return this;
        }

        public Builder setTripAdvisorRating(float tripAdvisorRating) {
            this.tripAdvisorRating = tripAdvisorRating;
            return this;
        }

        public Builder setPriceRange(String priceRange) {
            this.priceRange = priceRange;
            return this;
        }

        public Builder setCuisines(String cuisines) {
            this.cuisines = cuisines;
            return this;
        }

        public Builder setMeals(String meals) {
            this.meals = meals;
            return this;
        }

        public Builder setFeatures(String features) {
            this.features = features;
            return this;
        }

        public Builder setLocation(Location location) {
            this.location = location;
            return this;
        }

        public Restaurant build() {
            return new Restaurant(imagesRes, title, description, tripAdvisorLink, tripAdvisorRating, priceRange, cuisines, meals, features, location);
        }
    }
}
