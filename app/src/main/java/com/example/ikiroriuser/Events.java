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

public class Events extends Fragment {

    View v;
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private OnFragmentInteractionListener mListener;
    private List<Event>EventList;
    private RecyclerView mRecyclerView;
    private adapter mRecyclerAdapter;
    private String mParam1;
    private String mParam2;

    public Events() {

    }

    public static Events newInstance(String param1, String param2) {
        Events fragment = new Events();
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

        View view = inflater.inflate(R.layout.events, container, false);

        mRecyclerView =view.findViewById(R.id.draft_recyclerview);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        mRecyclerAdapter = new adapter(getContext(),EventList);
        mRecyclerView.setAdapter(mRecyclerAdapter);
        mRecyclerView.setHasFixedSize(true);
        EventList = new ArrayList<>();

        EventList.add(
                new Event(1,R.drawable.eventpicture,"concert show","it will be hot",
                        "Fri, Jun 28 2019 at 11:23","Fri, Jun 28 2019 at 19:23","Bujumbura",
                        "Avenue Bwiza, Number 36","Odéon Palace")
                );
        EventList.add(
                new Event(2,R.drawable.eventpicture,"concert show","it will be hot",
                        "Fri, Jun 28 2019 at 11:23","Fri, Jun 28 2019 at 19:23","Bujumbura",
                        "Avenue Bwiza, Number 36","Odéon Palace")
        );
        EventList.add(
                new Event(3,R.drawable.eventpicture,"concert show","it will be hot",
                        "Fri, Jun 28 2019 at 11:23","Fri, Jun 28 2019 at 19:23","Bujumbura",
                        "Avenue Bwiza, Number 36","Odéon Palace")
        );
        EventList.add(
                new Event(4,R.drawable.eventpicture,"concert show","it will be hot",
                        "Fri, Jun 28 2019 at 11:23","Fri, Jun 28 2019 at 19:23","Bujumbura",
                        "Avenue Bwiza, Number 36","Odéon Palace")
        );
        EventList.add(
                new Event(5,R.drawable.eventpicture,"concert show","it will be hot",
                        "Fri, Jun 28 2019 at 11:23","Fri, Jun 28 2019 at 19:23","Bujumbura",
                        "Avenue Bwiza, Number 36","Odéon Palace")
        );
        EventList.add(
                new Event(6,R.drawable.eventpicture,"concert show","it will be hot",
                        "Fri, Jun 28 2019 at 11:23","Fri, Jun 28 2019 at 19:23","Bujumbura",
                        "Avenue Bwiza, Number 36","Odéon Palace")
        );
        EventList.add(
                new Event(7,R.drawable.eventpicture,"concert show","it will be hot",
                        "Fri, Jun 28 2019 at 11:23","Fri, Jun 28 2019 at 19:23","Bujumbura",
                        "Avenue Bwiza, Number 36","Odéon Palace")
        );
        EventList.add(
                new Event(8,R.drawable.eventpicture,"concert show","it will be hot",
                        "Fri, Jun 28 2019 at 11:23","Fri, Jun 28 2019 at 19:23","Bujumbura",
                        "Avenue Bwiza, Number 36","Odéon Palace")
        );
        EventList.add(
                new Event(9,R.drawable.eventpicture,"concert show","it will be hot",
                        "Fri, Jun 28 2019 at 11:23","Fri, Jun 28 2019 at 19:23","Bujumbura",
                        "Avenue Bwiza, Number 36","Odéon Palace")
        );
        EventList.add(
                new Event(10,R.drawable.eventpicture,"concert show","it will be hot",
                        "Fri, Jun 28 2019 at 11:23","Fri, Jun 28 2019 at 19:23","Bujumbura",
                        "Avenue Bwiza, Number 36","Odéon Palace")
        );


     mRecyclerAdapter = new adapter(getContext(),EventList);
     mRecyclerView.setAdapter(mRecyclerAdapter);



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
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
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
