package com.example.ikiroriuser;

import android.net.Uri;

import java.util.Date;
import java.util.UUID;

public class Event {


    public static final String EVENT_EXTRA = "event_code";
    private int mId;

    private int mEventImage;
    private String mTitle;
    private String mDescription;
    private String mStartDate;
    private String mEndDate;
    private String mPlace;
    private String mAddress;
    private String mCity;



    public Event(int id, int eventImage, String title, String description, String startDate,
                 String endDate, String city
            , String address, String place) {
        mId = id;
        mEventImage = eventImage;
        mTitle = title;
        mDescription = description;
        mStartDate = startDate;
        mEndDate = endDate;
        mCity = city;
        mPlace = place;
        mAddress = address;

    }


    public void setEventImageUri(int eventImage) {
        mEventImage = eventImage;
    }

    public int getEventImage() {
        return mEventImage;
    }


    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }


    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        this.mId = id;
    }


    public String getStartDate() {
        return mStartDate;
    }

    public void setStartDate(String startDate) {
        mStartDate = startDate;
    }

    public String getEndDate() {
        return mEndDate;
    }

    public void setEndDate(String endDate) {
        mEndDate = endDate;
    }

    public String getCity() {
        return mCity;
    }

    public void setCity(String city) {
        mCity = city;
    }

    public String getPlace() {
        return mPlace;
    }

    public void setPlace(String place) {
        mPlace = place;
    }


    public String getAddress() {
        return mAddress;
    }

    public void setAddress(String address) {
        mAddress = address;
    }





}
