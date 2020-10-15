package com.example.ikiroriuser;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Explorer extends Fragment
{
    View v;
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private Events.OnFragmentInteractionListener mListener;

    private List<Event> mEventsNear;
    private List<Event> mTrendingList;
    private List<Organizer> mOrganizers;

    private RecyclerView mRecyclerView1;
    private RecyclerView mRecyclerView2;
    private RecyclerView mRecyclerView3;

    private EventNearAdapter mEventNearAdapter;
    private TrendingAdapter mTrendingAdapter;
    private OrganizerAdapter mOrganizerAdapter;

    private String mParam1;
    private String mParam2;

    public Explorer() {

    }

    public static Explorer newInstance(String param1, String param2) {
        Explorer fragment = new Explorer();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setHasOptionsMenu(true);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.explorer, container, false);

        mRecyclerView1 =view.findViewById(R.id.event_near);
        mRecyclerView1.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false));
        mEventNearAdapter = new EventNearAdapter(getContext(), mEventsNear);
        mRecyclerView1.setAdapter(mEventNearAdapter);
        mRecyclerView1.setHasFixedSize(true);

         mEventsNear = new ArrayList<>();

        mEventsNear.add(
                new Event(1,R.drawable.eventpicture,"concert show","it will be hot",
                        "Fri, Jun 28 2019 at 11:23","Fri, Jun 28 2019 at 19:23","Bujumbura",
                        "Avenue Bwiza, Number 36","Odéon Palace")
        );
        mEventsNear.add(
                new Event(2,R.drawable.eventpicture,"concert show","it will be hot",
                        "Fri, Jun 28 2019 at 11:23","Fri, Jun 28 2019 at 19:23","Bujumbura",
                        "Avenue Bwiza, Number 36","Odéon Palace")
        );
        mEventsNear.add(
                new Event(3,R.drawable.eventpicture,"concert show","it will be hot",
                        "Fri, Jun 28 2019 at 11:23","Fri, Jun 28 2019 at 19:23","Bujumbura",
                        "Avenue Bwiza, Number 36","Odéon Palace")
        );
        mEventsNear.add(
                new Event(4,R.drawable.eventpicture,"concert show","it will be hot",
                        "Fri, Jun 28 2019 at 11:23","Fri, Jun 28 2019 at 19:23","Bujumbura",
                        "Avenue Bwiza, Number 36","Odéon Palace")
        );
        mEventsNear.add(
                new Event(5,R.drawable.eventpicture,"concert show","it will be hot",
                        "Fri, Jun 28 2019 at 11:23","Fri, Jun 28 2019 at 19:23","Bujumbura",
                        "Avenue Bwiza, Number 36","Odéon Palace")
        );
        mEventsNear.add(
                new Event(6,R.drawable.eventpicture,"concert show","it will be hot",
                        "Fri, Jun 28 2019 at 11:23","Fri, Jun 28 2019 at 19:23","Bujumbura",
                        "Avenue Bwiza, Number 36","Odéon Palace")
        );
        mEventsNear.add(
                new Event(7,R.drawable.eventpicture,"concert show","it will be hot",
                        "Fri, Jun 28 2019 at 11:23","Fri, Jun 28 2019 at 19:23","Bujumbura",
                        "Avenue Bwiza, Number 36","Odéon Palace")
        );


        mEventNearAdapter = new EventNearAdapter(getContext(), mEventsNear);
        mRecyclerView1.setAdapter(mEventNearAdapter);

        mRecyclerView2 =view.findViewById(R.id.trending);
        mRecyclerView2.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false));
        mTrendingAdapter = new TrendingAdapter(getContext() , mTrendingList);
        mRecyclerView2.setAdapter(mTrendingAdapter);
        mRecyclerView2.setHasFixedSize(true);

        mTrendingList= new ArrayList<>();

        mTrendingList.add(
                new Event(1,R.drawable.eventpicture,"concert show","it will be hot",
                        "Fri, Jun 28 2019 at 11:23","Fri, Jun 28 2019 at 19:23","Bujumbura",
                        "Avenue Bwiza, Number 36","Odéon Palace")
        );
        mTrendingList.add(
                new Event(2,R.drawable.eventpicture,"concert show","it will be hot",
                        "Fri, Jun 28 2019 at 11:23","Fri, Jun 28 2019 at 19:23","Bujumbura",
                        "Avenue Bwiza, Number 36","Odéon Palace")
        );
        mTrendingList.add(
                new Event(3,R.drawable.eventpicture,"concert show","it will be hot",
                        "Fri, Jun 28 2019 at 11:23","Fri, Jun 28 2019 at 19:23","Bujumbura",
                        "Avenue Bwiza, Number 36","Odéon Palace")
        );
        mTrendingList.add(
                new Event(4,R.drawable.eventpicture,"concert show","it will be hot",
                        "Fri, Jun 28 2019 at 11:23","Fri, Jun 28 2019 at 19:23","Bujumbura",
                        "Avenue Bwiza, Number 36","Odéon Palace")
        );
        mTrendingList.add(
                new Event(5,R.drawable.eventpicture,"concert show","it will be hot",
                        "Fri, Jun 28 2019 at 11:23","Fri, Jun 28 2019 at 19:23","Bujumbura",
                        "Avenue Bwiza, Number 36","Odéon Palace")
        );
        mTrendingList.add(
                new Event(6,R.drawable.eventpicture,"concert show","it will be hot",
                        "Fri, Jun 28 2019 at 11:23","Fri, Jun 28 2019 at 19:23","Bujumbura",
                        "Avenue Bwiza, Number 36","Odéon Palace")
        );
        mTrendingList.add(
                new Event(7,R.drawable.eventpicture,"concert show","it will be hot",
                        "Fri, Jun 28 2019 at 11:23","Fri, Jun 28 2019 at 19:23","Bujumbura",
                        "Avenue Bwiza, Number 36","Odéon Palace")
        );

        mTrendingAdapter = new TrendingAdapter(getContext(), mTrendingList);
        mRecyclerView2.setAdapter(mTrendingAdapter);

        mRecyclerView3 =view.findViewById(R.id.top_organizer);
        mRecyclerView3.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false));
        mOrganizerAdapter = new OrganizerAdapter(getContext(),mOrganizers);
        mRecyclerView3.setAdapter(mOrganizerAdapter);
        mRecyclerView3.setHasFixedSize(true);

        mOrganizers = new ArrayList<>();


        mOrganizers.add(
                new Organizer(7,R.drawable.eventpicture,"concert show")
        );

        mOrganizers.add(
                new Organizer(3,R.drawable.eventpicture,"concert show")
        );
        mOrganizers.add(
                new Organizer(8,R.drawable.eventpicture,"concert show")
        );
        mOrganizers.add(
                new Organizer(11,R.drawable.eventpicture,"concert show")
        );
        mOrganizers.add(
                new Organizer(9,R.drawable.eventpicture,"concert show")
        );

        mOrganizerAdapter = new OrganizerAdapter(getContext(),mOrganizers);
        mRecyclerView3.setAdapter(mOrganizerAdapter);

        return view;
    }

    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof Events.OnFragmentInteractionListener) {
            mListener = (Events.OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    public interface OnFragmentInteractionListener {
        void onFragmentInteraction(Uri uri);
    }

}
