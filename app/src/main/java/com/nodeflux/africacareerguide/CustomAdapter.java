package com.nodeflux.africacareerguide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by cmmuk_000 on 11/30/2016.
 */

public class CustomAdapter extends ArrayAdapter<String> {

    CustomAdapter(Context context, String[] clusters)
    {
        super(context, R.layout.result, clusters);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater clusterInflater = LayoutInflater.from(getContext());
        View customView = clusterInflater.inflate(R.layout.result, parent, false);

        String singleClusterItem = getItem(position);
        TextView customText = (TextView) customView.findViewById(R.id.textViewClusterName);

        customText.setText(singleClusterItem);

        return customView;
    }
}
