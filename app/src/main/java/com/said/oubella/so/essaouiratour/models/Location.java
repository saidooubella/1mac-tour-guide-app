package com.said.oubella.so.essaouiratour.models;

public final class Location {

    static final Location EMPTY = new Location("", 0L, 0L);

    private final String address;
    private final double latitude;
    private final double longitude;

    private Location(String address, double latitude, double longitude) {
        this.address = address;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getAddress() {
        return address;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public static final class Builder {

        private String address = "";
        private double latitude = 0;
        private double longitude = 0;

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder setLatitude(double latitude) {
            this.latitude = latitude;
            return this;
        }

        public Builder setLongitude(double longitude) {
            this.longitude = longitude;
            return this;
        }

        public Location build() {
            return new Location(address, latitude, longitude);
        }
    }
}
