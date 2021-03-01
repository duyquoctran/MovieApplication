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
//ACTION MOVIES
public class SearchFragment extends Fragment {
    HorizontalGridView gridViewSearch;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.fragment_search, container, false);

        gridViewSearch = view.findViewById(R.id.gridViewSearch);

        // create a list of mediamodel
        List<MediaModel> aList = new ArrayList<>();
        // Tao 1 vung nho (Con tro)
        MediaModel aMedia = new MediaModel();
        aMedia.setMediaTitle("Movie1");
        aMedia.setMediaInfo("No.1");
        aMedia.setMediaThumbnail("https://i.pinimg.com/236x/53/f9/e8/53f9e8c6dc85a2247dc82b29ca3216b2.jpg");
        aList.add(aMedia);

        // Tao 1 vung nho (Con tro)
        aMedia = new MediaModel();
        aMedia.setMediaTitle("Movie2");
        aMedia.setMediaInfo("No.2");
        aMedia.setMediaThumbnail("https://ubc.sgp1.cdn.digitaloceanspaces.com/npnlab_files/HDONLINE/movie1_icon.jpg");
        aMedia.setMediaVideo("https://ubc.sgp1.cdn.digitaloceanspaces.com/npnlab_files/HDONLINE/movie1.mp4");
        aList.add(aMedia);

        // Tao 1 vung nho (Con tro)
        aMedia = new MediaModel();
        aMedia.setMediaTitle("Movie3");
        aMedia.setMediaInfo("No.3");
        aMedia.setMediaThumbnail("https://i.pinimg.com/236x/ef/ea/cb/efeacb1dec0c6883b45a23aa42d2b65a.jpg");
        aList.add(aMedia);

        // Tao 1 vung nho (Con tro)
        aMedia = new MediaModel();
        aMedia.setMediaTitle("Movie4");
        aMedia.setMediaInfo("No.4");
        aMedia.setMediaThumbnail("https://i.pinimg.com/236x/cc/5a/30/cc5a302b74d2fc1a94a524d6a0127494.jpg");
        aList.add(aMedia);

        // Tao 1 vung nho (Con tro)
        aMedia = new MediaModel();
        aMedia.setMediaTitle("Movie5");
        aMedia.setMediaInfo("No.5");
        aMedia.setMediaThumbnail("https://i.pinimg.com/236x/58/db/a7/58dba7931329119e84e4a34930b0b587.jpg");
        aList.add(aMedia);

        // create an adapter
        ListAdapter adapter = new ListAdapter(getActivity(), aList);
        adapter.notifyDataSetChanged();
        gridViewSearch.setAdapter(adapter);


        return view;
    }
}
