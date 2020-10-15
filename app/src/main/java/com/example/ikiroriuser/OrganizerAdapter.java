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

public class OrganizerAdapter extends RecyclerView.Adapter<OrganizerAdapter.ViewHolder> {
    private static final String TAG = ExplorerAdapter.class.getSimpleName();

    Context mContext;
    private List<Organizer>OrganizersList;
    public int mPosition;



    public OrganizerAdapter(Context context,List<Organizer>organizers) {
        mContext = context;
        OrganizersList = organizers;

    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView title,calendar,place;
        public ImageView eventImage;
        public ViewHolder(View v) {
            super(v);
            title = v.findViewById(R.id.title_id);
            eventImage = v.findViewById(R.id.card_image);
        }

    }

    @Override
    public OrganizerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.organizercard,parent,false);

        OrganizerAdapter.ViewHolder vHolder = new OrganizerAdapter.ViewHolder(v);
        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull OrganizerAdapter.ViewHolder holder, int  position) {

        Organizer organizer = OrganizersList.get(position);
        holder.title.setText(organizer.getTitle());
        holder.eventImage.setImageResource(organizer.getEventImage());

    }

    @Override
    public int getItemCount() {
        if (OrganizersList != null)
            return OrganizersList.size();
        else {
            return 0;
        }
    }
}

