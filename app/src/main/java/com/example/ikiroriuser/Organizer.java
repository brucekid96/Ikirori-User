package com.example.ikiroriuser;

public class Organizer {

    public static final String Organizer_EXTRA = "event_code";
    private int mId;

    private int mEventImage;
    private String mTitle;



    public Organizer(int id, int eventImage, String title) {
        mId = id;
        mEventImage = eventImage;
        mTitle = title;


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


    public int getId() {
        return mId;
    }

    public void setId(int id) {
        this.mId = id;
    }



}
