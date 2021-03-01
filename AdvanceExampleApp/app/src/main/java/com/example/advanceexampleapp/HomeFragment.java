package com.example.advanceexampleapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.VideoView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.leanback.widget.HorizontalGridView;

import java.util.ArrayList;
import java.util.List;


public class HomeFragment extends Fragment {

    HorizontalGridView gridViewHome;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.fragment_home, container, false);

        gridViewHome = view.findViewById(R.id.gridViewHome);

        // create a list of mediamodel
        List<MediaModel> aList = new ArrayList<>();
        // Tao 1 vung nho (Con tro)
        MediaModel aMedia = new MediaModel();
        aMedia.setMediaTitle("Movie1");
        aMedia.setMediaInfo("Animal1");
        aMedia.setMediaThumbnail("https://i.pinimg.com/236x/15/12/1c/15121ce933da7c32ba5069ada66a8bce.jpg");
        aList.add(aMedia);

        // Tao 1 vung nho (Con tro)
        aMedia = new MediaModel();
        aMedia.setMediaTitle("Movie2");
        aMedia.setMediaInfo("Animal2");
        aMedia.setMediaThumbnail("https://ubc.sgp1.cdn.digitaloceanspaces.com/npnlab_files/HDONLINE/movie1_icon.jpg");
        aMedia.setMediaVideo("https://ubc.sgp1.cdn.digitaloceanspaces.com/npnlab_files/HDONLINE/movie1.mp4");
        aList.add(aMedia);

        // Tao 1 vung nho (Con tro)
        aMedia = new MediaModel();
        aMedia.setMediaTitle("Movie3");
        aMedia.setMediaInfo("Animal3");
        aMedia.setMediaThumbnail("https://i.pinimg.com/236x/52/1c/9e/521c9ec883a335c6c03c730d51609944.jpg");
        aList.add(aMedia);

        // Tao 1 vung nho (Con tro)
        aMedia = new MediaModel();
        aMedia.setMediaTitle("Movie4");
        aMedia.setMediaInfo("Animal4");
        aMedia.setMediaThumbnail("https://i.pinimg.com/236x/c8/6a/35/c86a35cf4994d622668f0d4bc84e2e79.jpg");
        aList.add(aMedia);

        // Tao 1 vung nho (Con tro)
        aMedia = new MediaModel();
        aMedia.setMediaTitle("Movie5");
        aMedia.setMediaInfo("Animal5");
        aMedia.setMediaThumbnail("https://i.pinimg.com/236x/c7/76/bb/c776bb4a398bd53c09bf14338179872c.jpg");
        aList.add(aMedia);

        // Tao 1 vung nho (Con tro)
        aMedia = new MediaModel();
        aMedia.setMediaTitle("Movie6");
        aMedia.setMediaInfo("Animal6");
        aMedia.setMediaThumbnail("https://i.pinimg.com/236x/5c/19/1e/5c191e402f36059bb0a6dc01d1c5f2ce.jpg");
        aList.add(aMedia);

        // Tao 1 vung nho (Con tro)
        aMedia = new MediaModel();
        aMedia.setMediaTitle("Movie7");
        aMedia.setMediaInfo("Animal7");
        aMedia.setMediaThumbnail("https://i.pinimg.com/236x/6e/5b/4a/6e5b4ac26a57f830416e3d96a37d8c96.jpg");
        aList.add(aMedia);

        // Tao 1 vung nho (Con tro)
        aMedia = new MediaModel();
        aMedia.setMediaTitle("Movie8");
        aMedia.setMediaInfo("Animal8");
        aMedia.setMediaThumbnail("https://i.pinimg.com/236x/f0/3a/34/f03a349219e07c262f961a9afefb9a66.jpg");
        aList.add(aMedia);

        // Tao 1 vung nho (Con tro)
        aMedia = new MediaModel();
        aMedia.setMediaTitle("Movie9");
        aMedia.setMediaInfo("Animal9");
        aMedia.setMediaThumbnail("https://i.pinimg.com/236x/be/40/0a/be400a71c32fcb6b2575bd2b7227c8bc.jpg");
        aList.add(aMedia);

        // Tao 1 vung nho (Con tro)
        aMedia = new MediaModel();
        aMedia.setMediaTitle("Movie10");
        aMedia.setMediaInfo("Animal10");
        aMedia.setMediaThumbnail("https://i.pinimg.com/236x/e5/72/73/e572735def473dcdf21c1fcaee5f8be9.jpg");
        aList.add(aMedia);


        // create an adapter
        ListAdapter adapter = new ListAdapter(getActivity(), aList);

        gridViewHome.setAdapter(adapter);
        adapter.notifyDataSetChanged();

        return view;
    }
}


