package com.geogehigbie.listjsonparse.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.geogehigbie.listjsonparse.R;

public class ListFragment extends Fragment {


    private View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_list, container, false);




        return view;
    }

    public void createList(){
        ListView listView = (ListView) view.findViewById(R.id.contacts_list);



    }


}
