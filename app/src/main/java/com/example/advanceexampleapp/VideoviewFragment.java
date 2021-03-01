package com.example.advanceexampleapp;

import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class VideoviewFragment extends Fragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_videoview, container, false);
        VideoView videoView = view.findViewById(R.id.Videoplay);

        Bundle bundle = getArguments();
        videoView.setVideoPath(bundle.getString("videoPath"));

        MediaController mediaController = new MediaController(this.getActivity());
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);


        videoView.start();
        return view;
    }
}
