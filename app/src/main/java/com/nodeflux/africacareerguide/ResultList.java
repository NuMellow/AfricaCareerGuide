package com.nodeflux.africacareerguide;

import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ListAdapter;

import static com.nodeflux.africacareerguide.R.array.cluster_name;

/**
 * Created by cmmuk_000 on 11/29/2016.
 */

public class ResultList extends MainActivity {

    private RecyclerView resultsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        resultsList = (RecyclerView) findViewById(R.id.resultsList);
        resultsList.setHasFixedSize(true);
        resultsList.setLayoutManager(new LinearLayoutManager(this));

        //Sets an adapter for the recycler view
        /*clusterAdapter = new CustomAdapter(this, getResources().getStringArray(cluster_name));
        resultsList.setAdapter(clusterAdapter);*/
    }

    @Override
    protected void onStart() {
        super.onStart();


    }
}
