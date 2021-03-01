package com.example.advanceexampleapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.leanback.widget.HorizontalGridView;

import java.util.ArrayList;
import java.util.List;
//EPIC MOVIES
public class HistoryFragment extends Fragment {
    HorizontalGridView gridViewHistory;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.fragment_history, container, false);

        gridViewHistory = view.findViewById(R.id.gridViewHistory);

        // create a list of mediamodel
        List<MediaModel> aList = new ArrayList<>();
        // Tao 1 vung nho (Con tro)
        MediaModel aMedia = new MediaModel();
        aMedia.setMediaTitle("Movie1");
        aMedia.setMediaInfo("No.1");
        aMedia.setMediaThumbnail("https://i.pinimg.com/236x/21/23/28/212328e8ec084028d3a074975537687b.jpg");
        aList.add(aMedia);

        // Tao 1 vung nho (Con tro)
        aMedia = new MediaModel();
        aMedia.setMediaTitle("Movie2");
        aMedia.setMediaInfo("No.2");
        aMedia.setMediaThumbnail("https://i.pinimg.com/236x/f7/2e/9d/f72e9d183e1b996cf54926a191ec776b.jpg");
        aMedia.setMediaVideo("https://ubc.sgp1.cdn.digitaloceanspaces.com/npnlab_files/HDONLINE/movie1.mp4");
        aList.add(aMedia);

        // Tao 1 vung nho (Con tro)
        aMedia = new MediaModel();
        aMedia.setMediaTitle("Movie3");
        aMedia.setMediaInfo("No.3");
        aMedia.setMediaThumbnail("https://i.pinimg.com/236x/ae/bb/a7/aebba7c5933b2c03b8e044bd1f4ee5dd.jpg");
        aList.add(aMedia);

        // Tao 1 vung nho (Con tro)
        aMedia = new MediaModel();
        aMedia.setMediaTitle("Movie4");
        aMedia.setMediaInfo("No.4");
        aMedia.setMediaThumbnail("https://i.pinimg.com/236x/79/48/a6/7948a6b79c38b9d853b8c8908af88872.jpg");
        aList.add(aMedia);

        // Tao 1 vung nho (Con tro)
        aMedia = new MediaModel();
        aMedia.setMediaTitle("Movie5");
        aMedia.setMediaInfo("No.5");
        aMedia.setMediaThumbnail("https://i.pinimg.com/236x/8b/35/4f/8b354fe876d2f7d9134e6035fff78d9c.jpg");
        aList.add(aMedia);


        // create an adapter
        ListAdapter adapter = new ListAdapter(getActivity(), aList);
        adapter.notifyDataSetChanged();
        gridViewHistory.setAdapter(adapter);


        return view;
    }
}