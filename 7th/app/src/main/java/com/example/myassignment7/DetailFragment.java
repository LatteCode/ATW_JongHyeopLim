package com.example.myassignment7;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class DetailFragment extends Fragment {
    public DetailFragment(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        Bundle data = getArguments();
        String detailData = null;
        if(data != null){
            detailData = data.getString("data");
        }

        View rootview = inflater.inflate(R.layout.detailfragment, container, false);

        TextView detailTextView = (TextView)rootview.findViewById(R.id.detail_textview);
        detailTextView.setText(detailData);

        return rootview;
    }
}
