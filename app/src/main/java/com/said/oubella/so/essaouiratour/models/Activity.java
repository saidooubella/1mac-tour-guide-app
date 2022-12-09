package com.said.oubella.so.essaouiratour.models;

import java.util.Collections;
import java.util.List;

public final class Activity {

    private final List<Integer> imagesRes;
    private final String title;
    private final String description;

    private Activity(List<Integer> imagesRes, String title, String description) {
        this.imagesRes = imagesRes;
        this.title = title;
        this.description = description;
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

    public static final class Builder {

        private List<Integer> imagesRes = Collections.emptyList();
        private String title = "";
        private String description = "";

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

        public Activity build() {
            return new Activity(imagesRes, title, description);
        }
    }
}
