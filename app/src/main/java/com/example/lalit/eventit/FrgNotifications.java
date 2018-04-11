package com.example.lalit.eventit;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class FrgNotifications extends Fragment {

    RecyclerView rvNotifications;

    public FrgNotifications() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_frg_notifications, container, false);
        rvNotifications=(RecyclerView)view.findViewById(R.id.rvNotifications);

        return view;
    }

}
