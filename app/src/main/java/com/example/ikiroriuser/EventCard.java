package com.example.ikiroriuser;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class EventCard extends ConstraintLayout {
    private String TAG = Event.class.getSimpleName();
    private Context mContext;
    private ImageView mImage;
    private TextView mTitle;
    private TextView mStartDate;
    private TextView mVenue;
    private TextView mCity;
    private TextView mPlace;
    private TextView more;
    private TextView mEditEvent;
    private ImageView mEventImageView;

    private Event mEvent;



    public EventCard(Context context) {
        super(context);

        mContext = context;

        LayoutInflater.from(mContext).inflate(R.layout.eventcard ,this);
        this.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        mImage = findViewById(R.id.card_image);
        mTitle = findViewById(R.id.title_id);
        mStartDate = findViewById(R.id.calendar_id);
        mVenue = findViewById(R.id.venue_view_id);
        mCity = findViewById(R.id.city_view_id);
        mPlace = findViewById(R.id.place_view_id);
        more = findViewById(R.id.more_textview_id);
        mEditEvent = findViewById(R.id.edit_event);
    }


    public void bindEvent(Event event) {
        Log.d(TAG,event.toString());
        mEvent = event;
        mImage.setImageURI(mEvent.getEventImageUri());
        mTitle.setText(mEvent.getTitle());
        mStartDate.setText(calendarToString(mEvent.getStartDate()));
        mVenue.setText(mEvent.getAddress());
        mCity.setText(mEvent.getCity());
        mPlace.setText(mEvent.getPlace());


    }


    private String calendarToString(Date date) {
        DateFormat dateFormatter = new SimpleDateFormat(
                "MMM d yyyy h:mm a");
        return dateFormatter.format(date.getTime());
    }

}
