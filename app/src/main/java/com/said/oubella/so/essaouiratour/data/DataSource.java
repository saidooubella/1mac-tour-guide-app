package com.said.oubella.so.essaouiratour.data;

import com.said.oubella.so.essaouiratour.models.Activity;
import com.said.oubella.so.essaouiratour.models.Event;
import com.said.oubella.so.essaouiratour.models.Hotel;
import com.said.oubella.so.essaouiratour.models.Place;
import com.said.oubella.so.essaouiratour.models.Restaurant;

import java.util.List;

public interface DataSource {

    List<Restaurant> getRestaurantsList();

    List<Activity> getActivitiesList();

    List<Hotel> getHotelsList();

    List<Place> getPlacesList();

    List<Event> getEventsList();
}
