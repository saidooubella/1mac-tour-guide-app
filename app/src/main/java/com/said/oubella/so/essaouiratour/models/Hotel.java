package com.said.oubella.so.essaouiratour.models;

import java.util.Collections;
import java.util.List;

public final class Hotel {

    private final List<Integer> imagesRes;
    private final String title;
    private final String description;
    private final String tripAdvisorLink;
    private final float tripAdvisorRating;
    private final String propertyAmenities;
    private final String roomFeatures;
    private final String roomTypes;
    private final Location location;

    private Hotel(List<Integer> imagesRes, String title, String description, String tripAdvisorLink, float tripAdvisorRating, String propertyAmenities, String roomFeatures, String roomTypes, Location location) {
        this.imagesRes = imagesRes;
        this.title = title;
        this.description = description;
        this.tripAdvisorLink = tripAdvisorLink;
        this.tripAdvisorRating = tripAdvisorRating;
        this.propertyAmenities = propertyAmenities;
        this.roomFeatures = roomFeatures;
        this.roomTypes = roomTypes;
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

    public String getPropertyAmenities() {
        return propertyAmenities;
    }

    public String getRoomFeatures() {
        return roomFeatures;
    }

    public String getRoomTypes() {
        return roomTypes;
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
        private String propertyAmenities = "";
        private String roomFeatures = "";
        private String roomTypes = "";
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

        public Builder setPropertyAmenities(String propertyAmenities) {
            this.propertyAmenities = propertyAmenities;
            return this;
        }

        public Builder setRoomFeatures(String roomFeatures) {
            this.roomFeatures = roomFeatures;
            return this;
        }

        public Builder setRoomTypes(String roomTypes) {
            this.roomTypes = roomTypes;
            return this;
        }

        public Builder setLocation(Location location) {
            this.location = location;
            return this;
        }

        public Hotel build() {
            return new Hotel(imagesRes, title, description, tripAdvisorLink, tripAdvisorRating, propertyAmenities, roomFeatures, roomTypes, location);
        }
    }
}
