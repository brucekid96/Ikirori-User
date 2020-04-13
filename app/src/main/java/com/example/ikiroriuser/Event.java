package com.example.ikiroriuser;

import android.net.Uri;

import java.util.Date;
import java.util.UUID;

public class Event {


    public static final String EVENT_EXTRA = "event_code";
    private UUID mId;

    private Uri mEventImageUri;
    private String mTitle;
    private String mDescription;
    private Date mStartDate;
    private Date mEndDate;
    private String mPlace;
    private String mAddress;
    private String mCity;
    private String mCategory;
    private String mPrivacy;



    public Event(UUID id, Uri eventImageUri, String title, String description, Date startDate,
                 Date endDate, String city
            , String address, String place, String category,String privacy) {
        mId = id;
        mEventImageUri = eventImageUri;
        mTitle = title;
        mDescription = description;
        mStartDate = startDate;
        mEndDate = endDate;
        mCity = city;
        mPlace = place;
        mAddress = address;
        mCategory = category;
        mPrivacy = privacy;

    }


    public void setEventImageUri(Uri eventImageUri) {
        mEventImageUri = eventImageUri;
    }

    public Uri getEventImageUri() {
        return mEventImageUri;
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

    public UUID getId() {
        return mId;
    }

    public void setId(UUID id) {
        this.mId = id;
    }


    public Date getStartDate() {
        return mStartDate;
    }

    public void setStartDate(Date startDate) {
        mStartDate = startDate;
    }

    public Date getEndDate() {
        return mEndDate;
    }

    public void setEndDate(Date endDate) {
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

    public String getCategory() {
        return mCategory;
    }

    public void setCategory(String category) {
        mCategory = category;
    }



    public String getPrivacy() {
        return mPrivacy;
    }

    public void setPrivacy(String privacy) {
        mPrivacy = privacy;
    }


}
