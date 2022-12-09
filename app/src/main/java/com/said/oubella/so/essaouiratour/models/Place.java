package com.said.oubella.so.essaouiratour.models;

import java.util.Collections;
import java.util.List;

public final class Place {

    private final List<Integer> imagesRes;
    private final String title;
    private final String description;
    private final String openingTime;
    private final String price;
    private final Location location;

    private Place(List<Integer> imagesRes, String title, String description, String openingTime, String price, Location location) {
        this.imagesRes = imagesRes;
        this.title = title;
        this.description = description;
        this.openingTime = openingTime;
        this.price = price;
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

    public String getOpeningTime() {
        return openingTime;
    }

    public String getPrice() {
        return price;
    }

    public Location getLocation() {
        return location;
    }

    public static final class Builder {

        private List<Integer> imagesRes = Collections.emptyList();
        private String title = "";
        private String description = "";
        private String openingTime = "";
        private String price = "";
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

        public Builder setOpeningTime(String openingTime) {
            this.openingTime = openingTime;
            return this;
        }

        public Builder setPrice(String price) {
            this.price = price;
            return this;
        }

        public Builder setLocation(Location location) {
            this.location = location;
            return this;
        }

        public Place build() {
            return new Place(imagesRes, title, description, openingTime, price, location);
        }
    }
}
