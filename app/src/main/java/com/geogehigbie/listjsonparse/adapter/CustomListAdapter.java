package com.geogehigbie.listjsonparse.adapter;

import android.content.Context;
import android.widget.ArrayAdapter;

import java.util.List;

/**
 * Created by georgehigbie on 3/10/17.
 */

public class CustomListAdapter extends ArrayAdapter {

    public CustomListAdapter(Context context, int resource, List objects) {  //set this to list so that array list can be used
        super(context, resource, objects);
    }
}
