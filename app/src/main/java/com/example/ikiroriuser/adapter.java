package com.example.ikiroriuser;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class adapter extends RecyclerView.Adapter<adapter.ViewHolder> {



    private static final String TAG = adapter.class.getSimpleName();

    Context mContext;
    private List<Event>EventList;
       public int mPosition;



    public adapter(Context context, List<Event> events) {
        mContext = context;
        EventList = events;

    }


    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView title,calendar,place,adress,city;
        public ImageView eventImage;
        public ViewHolder(View v) {
            super(v);
            title = v.findViewById(R.id.title_id);
            calendar = v.findViewById(R.id.calendar_id);
            place = v.findViewById(R.id.place_view_id);
           eventImage = v.findViewById(R.id.card_image);
        }

    }


    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.eventcard,parent,false);

        ViewHolder vHolder = new ViewHolder(v);
        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int  position) {

        Event event = EventList.get(position);
        holder.title.setText(event.getTitle());
        holder.calendar.setText(event.getStartDate());
        holder.place.setText(event.getPlace());
        holder.eventImage.setImageResource(event.getEventImage());

    }


    @Override
    public int getItemCount() {
        if (EventList != null)
            return EventList.size();
        else {
            return 0;
        }
    }
}
