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
//DOCUMENTARY MOVIES
public class ListFragment extends Fragment {
    HorizontalGridView gridViewList;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.fragment_list, container, false);

        gridViewList = view.findViewById(R.id.gridViewList);

        // create a list of mediamodel
        List<MediaModel> aList = new ArrayList<>();
        // Tao 1 vung nho (Con tro)
        MediaModel aMedia = new MediaModel();
        aMedia.setMediaTitle("Movie1");
        aMedia.setMediaInfo("No.1");
        aMedia.setMediaThumbnail("https://i.pinimg.com/236x/64/93/42/64934208a1b8e3e81f43bce8d1508d80.jpg");
        aList.add(aMedia);

        // Tao 1 vung nho (Con tro)
        aMedia = new MediaModel();
        aMedia.setMediaTitle("Movie2");
        aMedia.setMediaInfo("No.2");
        aMedia.setMediaThumbnail("https://i.pinimg.com/236x/65/1c/09/651c093f856954e6a69275e514e08e3e.jpg");
        aMedia.setMediaVideo("https://developers.google.com/training/images/tacoma_narrows.mp4");
        aList.add(aMedia);

        // Tao 1 vung nho (Con tro)
        aMedia = new MediaModel();
        aMedia.setMediaTitle("Movie3");
        aMedia.setMediaInfo("No.3");
        aMedia.setMediaThumbnail("https://i.pinimg.com/236x/db/d4/1d/dbd41d270e9144e61fe08c82ef412674.jpg");
        aList.add(aMedia);

        // Tao 1 vung nho (Con tro)
        aMedia = new MediaModel();
        aMedia.setMediaTitle("Movie4");
        aMedia.setMediaInfo("No.4");
        aMedia.setMediaThumbnail("https://i.pinimg.com/236x/7f/79/d3/7f79d308eaa2cb16d4be8353e72ebf3f.jpg");
        aList.add(aMedia);

        // Tao 1 vung nho (Con tro)
        aMedia = new MediaModel();
        aMedia.setMediaTitle("Movie5");
        aMedia.setMediaInfo("No.5");
        aMedia.setMediaThumbnail("https://i.pinimg.com/236x/99/e1/ce/99e1cec8a34b3073da49202a60652cbd.jpg");
        aList.add(aMedia);

        // create an adapter
        ListAdapter adapter = new ListAdapter(getActivity(), aList);
        adapter.notifyDataSetChanged();
        gridViewList.setAdapter(adapter);


        return view;
    }
}
