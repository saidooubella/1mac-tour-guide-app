package com.said.oubella.so.essaouiratour.data;

import android.app.Application;

import androidx.annotation.NonNull;

import com.said.oubella.so.essaouiratour.R;
import com.said.oubella.so.essaouiratour.helpers.Helper;
import com.said.oubella.so.essaouiratour.models.Activity;
import com.said.oubella.so.essaouiratour.models.Event;
import com.said.oubella.so.essaouiratour.models.Hotel;
import com.said.oubella.so.essaouiratour.models.Location;
import com.said.oubella.so.essaouiratour.models.Place;
import com.said.oubella.so.essaouiratour.models.Restaurant;

import java.util.List;

public final class DataSourceImpl implements DataSource {

    private final Application context;

    private final List<Restaurant> restaurantsList;
    private final List<Activity> activitiesList;
    private final List<Hotel> hotelsList;
    private final List<Place> placesList;
    private final List<Event> eventsList;

    public DataSourceImpl(Application context) {
        this.context = context;
        this.restaurantsList = getRestaurantsListInternal();
        this.activitiesList = getActivitiesListInternal();
        this.hotelsList = getHotelsListInternal();
        this.placesList = getPlacesListInternal();
        this.eventsList = getEventsListInternal();
    }

    @NonNull
    private List<Activity> getActivitiesListInternal() {
        return Helper.listOf(

                new Activity.Builder()
                        .setTitle(context.getString(R.string.horse_riding_title))
                        .setDescription(context.getString(R.string.horse_riding_description))
                        .setImagesRes(Helper.listOf(R.drawable.activity_horse_riding_0, R.drawable.activity_horse_riding_1))
                        .build(),

                new Activity.Builder()
                        .setTitle(context.getString(R.string.camel_riding_title))
                        .setDescription(context.getString(R.string.camel_riding_description))
                        .setImagesRes(Helper.listOf(R.drawable.activity_camel_riding_0, R.drawable.activity_camel_riding_1))
                        .build(),

                new Activity.Builder()
                        .setTitle(context.getString(R.string.quad_biking_title))
                        .setDescription(context.getString(R.string.quad_biking_description))
                        .setImagesRes(Helper.listOf(R.drawable.activity_quak_biking_0, R.drawable.activity_quak_biking_1))
                        .build(),

                new Activity.Builder()
                        .setTitle(context.getString(R.string.surfing_title))
                        .setDescription(context.getString(R.string.surfing_description))
                        .setImagesRes(Helper.listOf(R.drawable.activity_surf_0, R.drawable.activity_surf_1, R.drawable.activity_surf_2))
                        .build()
        );
    }

    @NonNull
    private List<Event> getEventsListInternal() {
        return Helper.listOf(

                new Event.Builder()
                        .setTitle(context.getString(R.string.fest_gnaoua_title))
                        .setDescription(context.getString(R.string.fest_gnaoua_description))
                        .setImagesRes(Helper.listOf(R.drawable.event_gnoua_0, R.drawable.event_gnoua_1, R.drawable.event_gnoua_2))
                        .build(),

                new Event.Builder()
                        .setTitle(context.getString(R.string.moga_fest_title))
                        .setDescription(context.getString(R.string.moga_fest_description))
                        .setImagesRes(Helper.listOf(R.drawable.event_moga_0, R.drawable.event_moga_1, R.drawable.event_moga_2))
                        .build(),

                new Event.Builder()
                        .setTitle(context.getString(R.string.andalusia_fest_title))
                        .setDescription(context.getString(R.string.andalusia_fest_description))
                        .setImagesRes(Helper.listOf(R.drawable.event_andalousie_0, R.drawable.event_andalousie_1, R.drawable.event_andalousie_2))
                        .build(),

                new Event.Builder()
                        .setTitle(context.getString(R.string.photo_nights_title))
                        .setDescription(context.getString(R.string.photo_nights_description))
                        .setImagesRes(Helper.listOf(R.drawable.event_photographic_nights_0))
                        .build()
        );
    }

    @NonNull
    private List<Place> getPlacesListInternal() {
        return Helper.listOf(

                new Place.Builder()
                        .setTitle(context.getString(R.string.port_title))
                        .setDescription(context.getString(R.string.port_description))
                        .setOpeningTime(context.getString(R.string.port_opening_time))
                        .setImagesRes(Helper.listOf(R.drawable.place_port_0, R.drawable.place_port_1))
                        .setPrice(context.getString(R.string.port_price))
                        .setLocation(
                                new Location.Builder()
                                        .setAddress(context.getString(R.string.port_address))
                                        .setLatitude(31.5102767)
                                        .setLongitude(-9.7763853)
                                        .build()
                        ).build(),

                new Place.Builder()
                        .setTitle(context.getString(R.string.scala_port_title))
                        .setDescription(context.getString(R.string.scala_port_description))
                        .setOpeningTime(context.getString(R.string.scala_port_opening_time))
                        .setImagesRes(Helper.listOf(R.drawable.place_sqala_port_0, R.drawable.place_sqala_port_1))
                        .setPrice(context.getString(R.string.scala_port_price))
                        .setLocation(
                                new Location.Builder()
                                        .setAddress(context.getString(R.string.scala_port_address))
                                        .setLatitude(31.5102767)
                                        .setLongitude(-9.7763853)
                                        .build()
                        ).build(),

                new Place.Builder()
                        .setTitle(context.getString(R.string.museum_title))
                        .setDescription(context.getString(R.string.museum_description))
                        .setOpeningTime(context.getString(R.string.museum_opening_time))
                        .setImagesRes(Helper.listOf(R.drawable.place_museum_0, R.drawable.place_museum_1))
                        .setPrice(context.getString(R.string.museum_price))
                        .setLocation(
                                new Location.Builder()
                                        .setAddress(context.getString(R.string.museum_address))
                                        .setLatitude(31.5109789)
                                        .setLongitude(-9.7800518)
                                        .build()
                        ).build(),

                new Place.Builder()
                        .setTitle(context.getString(R.string.dar_souiri_title))
                        .setDescription(context.getString(R.string.dar_souiri_description))
                        .setOpeningTime(context.getString(R.string.dar_souiri_opening))
                        .setImagesRes(Helper.listOf(R.drawable.place_dar_souiri_0, R.drawable.place_dar_souiri_1))
                        .setPrice(context.getString(R.string.dar_souiri_price))
                        .setLocation(
                                new Location.Builder()
                                        .setAddress(context.getString(R.string.dar_souiri_address))
                                        .setLatitude(31.5114377)
                                        .setLongitude(-9.7720795)
                                        .build()
                        ).build()
        );
    }

    @NonNull
    private List<Restaurant> getRestaurantsListInternal() {
        return Helper.listOf(

                new Restaurant.Builder()
                        .setTitle(context.getString(R.string.coupole_title))
                        .setDescription(context.getString(R.string.coupole_description))
                        .setTripAdvisorRating(5f)
                        .setTripAdvisorLink(context.getString(R.string.coupole_tripadvisor_link))
                        .setCuisines(context.getString(R.string.coupole_cuisines))
                        .setFeatures(context.getString(R.string.coupole_features))
                        .setMeals(context.getString(R.string.coupole_meals))
                        .setPriceRange(context.getString(R.string.coupole_price_range))
                        .setImagesRes(Helper.listOf(R.drawable.restaurant_la_coupole_0, R.drawable.restaurant_la_coupole_1, R.drawable.restaurant_la_coupole_2))
                        .setLocation(
                                new Location.Builder()
                                        .setAddress(context.getString(R.string.coupole_address))
                                        .setLatitude(31.5051610)
                                        .setLongitude(-9.7635870)
                                        .build()
                        ).build(),

                new Restaurant.Builder()
                        .setTitle(context.getString(R.string.seafood_corner_title))
                        .setTripAdvisorRating(5f)
                        .setTripAdvisorLink(context.getString(R.string.seafood_corner_tripadvidor_link))
                        .setCuisines(context.getString(R.string.seafood_corner_cuisines))
                        .setFeatures(context.getString(R.string.seafood_corner_features))
                        .setMeals(context.getString(R.string.seafood_corner_meals))
                        .setPriceRange(context.getString(R.string.seafood_corner_price_range))
                        .setImagesRes(Helper.listOf(R.drawable.restaurant_seafood_corner_0, R.drawable.restaurant_seafood_corner_1, R.drawable.restaurant_seafood_corner_2))
                        .setLocation(
                                new Location.Builder()
                                        .setAddress(context.getString(R.string.seafood_corner_address))
                                        .setLatitude(31.5123390)
                                        .setLongitude(-9.7710560)
                                        .build()
                        ).build(),

                new Restaurant.Builder()
                        .setTitle(context.getString(R.string.mactoob_title))
                        .setDescription(context.getString(R.string.mactoob_description))
                        .setTripAdvisorRating(4.5f)
                        .setTripAdvisorLink(context.getString(R.string.mactoob_tripadvisor_link))
                        .setCuisines(context.getString(R.string.mactoob_cuisines))
                        .setFeatures(context.getString(R.string.mactoob_features))
                        .setMeals(context.getString(R.string.mactoob_meals))
                        .setPriceRange(context.getString(R.string.mactoob_price_range))
                        .setImagesRes(Helper.listOf(R.drawable.restaurant_mactoob_0, R.drawable.restaurant_mactoob_1, R.drawable.restaurant_mactoob_2))
                        .setLocation(
                                new Location.Builder()
                                        .setAddress(context.getString(R.string.mactoob_address))
                                        .setLatitude(31.5132480)
                                        .setLongitude(-9.7725100)
                                        .build()
                        ).build(),

                new Restaurant.Builder()
                        .setTitle(context.getString(R.string.bistro_title))
                        .setDescription(context.getString(R.string.bistro_description))
                        .setTripAdvisorRating(5f)
                        .setTripAdvisorLink(context.getString(R.string.bistro_tripadvisor_link))
                        .setCuisines(context.getString(R.string.bistro_cuisines))
                        .setFeatures(context.getString(R.string.bistro_features))
                        .setMeals(context.getString(R.string.bistro_meals))
                        .setPriceRange(context.getString(R.string.bistro_price_range))
                        .setImagesRes(Helper.listOf(R.drawable.restaurant_bistro_0, R.drawable.restaurant_bistro_1, R.drawable.restaurant_bistro_2))
                        .setLocation(
                                new Location.Builder()
                                        .setAddress(context.getString(R.string.bistro_address))
                                        .setLatitude(31.5154690)
                                        .setLongitude(-9.7682640)
                                        .build()
                        ).build()
        );
    }

    @NonNull
    private List<Hotel> getHotelsListInternal() {
        return Helper.listOf(

                new Hotel.Builder()
                        .setTitle(context.getString(R.string.dar_maya_title))
                        .setDescription(context.getString(R.string.dar_maya_description))
                        .setTripAdvisorLink(context.getString(R.string.dar_maya_tripadvisor_link))
                        .setTripAdvisorRating(5f)
                        .setPropertyAmenities(context.getString(R.string.dar_maya_prop_amenities))
                        .setRoomFeatures(context.getString(R.string.dar_maya_features))
                        .setRoomTypes(context.getString(R.string.dar_maya_room_types))
                        .setImagesRes(Helper.listOf(R.drawable.hotel_dar_maya_0, R.drawable.hotel_dar_maya_1, R.drawable.hotel_dar_maya_2))
                        .setLocation(
                                new Location.Builder()
                                        .setAddress(context.getString(R.string.dar_maya_address))
                                        .setLatitude(31.5151873)
                                        .setLongitude(-9.7717454)
                                        .build()
                        ).build(),

                new Hotel.Builder()
                        .setTitle(context.getString(R.string.riad_saltana_title))
                        .setDescription(context.getString(R.string.riad_saltana_description))
                        .setTripAdvisorLink(context.getString(R.string.riad_saltana_tripadvisor_link))
                        .setTripAdvisorRating(4.5f)
                        .setPropertyAmenities(context.getString(R.string.riad_saltana_prop_amenities))
                        .setRoomFeatures(context.getString(R.string.riad_saltana_room_features))
                        .setRoomTypes(context.getString(R.string.riad_saltana_room_types))
                        .setImagesRes(Helper.listOf(R.drawable.hotel_riad_saltana_0, R.drawable.hotel_riad_saltana_1, R.drawable.hotel_riad_saltana_2))
                        .setLocation(
                                new Location.Builder()
                                        .setAddress(context.getString(R.string.riad_saltana_address))
                                        .setLatitude(31.5148898)
                                        .setLongitude(-9.7724252)
                                        .build()
                        ).build(),

                new Hotel.Builder()
                        .setTitle(context.getString(R.string.grande_large_title))
                        .setDescription(context.getString(R.string.grande_large_description))
                        .setTripAdvisorLink(context.getString(R.string.grande_large_tripadvisor_link))
                        .setTripAdvisorRating(4.0f)
                        .setPropertyAmenities(context.getString(R.string.grande_large_prop_amenities))
                        .setRoomFeatures(context.getString(R.string.grande_large_room_features))
                        .setRoomTypes(context.getString(R.string.grande_large_room_types))
                        .setImagesRes(Helper.listOf(R.drawable.hotel_grand_large_0, R.drawable.hotel_grand_large_1, R.drawable.hotel_grand_large_2))
                        .setLocation(
                                new Location.Builder()
                                        .setAddress(context.getString(R.string.grande_large_address))
                                        .setLatitude(31.5147197)
                                        .setLongitude(-9.7715761)
                                        .build()
                        ).build(),

                new Hotel.Builder()
                        .setTitle(context.getString(R.string.chems_bleu_title))
                        .setDescription(context.getString(R.string.chems_bleu_description))
                        .setTripAdvisorLink(context.getString(R.string.chems_bleu_tripadvisor_link))
                        .setTripAdvisorRating(5.0f)
                        .setPropertyAmenities(context.getString(R.string.chems_bleu_prop_amenities))
                        .setRoomFeatures(context.getString(R.string.chems_bleu_room_features))
                        .setRoomTypes(context.getString(R.string.chems_bleu_room_types))
                        .setImagesRes(Helper.listOf(R.drawable.hotel_chems_bleu_0, R.drawable.hotel_chems_bleu_1, R.drawable.hotel_chems_bleu_2))
                        .setLocation(
                                new Location.Builder()
                                        .setAddress(context.getString(R.string.chems_bleu_address))
                                        .setLatitude(31.5121681)
                                        .setLongitude(-9.7698605)
                                        .build()
                        ).build()
        );
    }

    @Override
    public List<Restaurant> getRestaurantsList() {
        return restaurantsList;
    }

    @Override
    public List<Activity> getActivitiesList() {
        return activitiesList;
    }

    @Override
    public List<Hotel> getHotelsList() {
        return hotelsList;
    }

    @Override
    public List<Place> getPlacesList() {
        return placesList;
    }

    @Override
    public List<Event> getEventsList() {
        return eventsList;
    }
}
