package com.example.advanceexampleapp;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder> {
    private Context context;
    private List<MediaModel> elements;

    //Constructor
    public ListAdapter (Context c, List<MediaModel> list){
        context = c;
        elements = list;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        final View view = LayoutInflater.from(this.context).inflate(R.layout.layout_list_item, parent, false);


        return new ViewHolder(view);

    }

    @Override
    public int getItemCount() {
        return elements.size();
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        holder.textName.setText(elements.get(position).getMediaTitle());
        holder.textInfo.setText(elements.get(position).getMediaInfo());

        Picasso.get().load(elements.get(position).getMediaThumbnail()).into(holder.imgThumbnail);
        holder.video_media.setVideoPath(elements.get(position).getMediaVideo());

            //Focus
            holder.itemView.setOnFocusChangeListener(new View.OnFocusChangeListener(){
                @Override
                public void onFocusChange(View v, boolean hasFocus) {
                    if(hasFocus){
                        final int position;
                        //change the background
                        holder.textName.setVisibility(View.VISIBLE);
                        holder.textInfo.setVisibility(View.VISIBLE);
                        holder.imgThumbnail.setVisibility(View.VISIBLE);
                        holder.textName.setText("Please click to enjoy the movie");
                        Picasso.get().load("https://i.pinimg.com/236x/5c/5b/f1/5c5bf1174009891f2c15ab9d3ed1a7b8.jpg").into(holder.imgThumbnail);
                        holder.video_media.setVisibility(View.GONE);
                    }else{
                        //change another background
                        holder.textName.setVisibility(View.VISIBLE);
                        holder.textInfo.setVisibility(View.VISIBLE);
                        holder.imgThumbnail.setVisibility(View.VISIBLE);
                        holder.textName.setText(elements.get(position).getMediaTitle());
                        Picasso.get().load(elements.get(position).getMediaThumbnail()).into(holder.imgThumbnail);
                        holder.video_media.setVisibility(View.GONE);
                    }
                }
            });

            //Click
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    holder.video_media.setVisibility(View.VISIBLE);
                holder.video_media.start();
                holder.textName.setVisibility(View.GONE);
                holder.textInfo.setVisibility(View.GONE);
                holder.imgThumbnail.setVisibility(View.GONE);
                }
            });

            //Touch
            holder.itemView.setOnTouchListener(new View.OnTouchListener(){
                @Override
                public boolean onTouch(View v, MotionEvent event) {
                    return false;
                }
            });


    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        TextView textName;
        TextView textInfo;
        ImageView imgThumbnail;
        VideoView video_media;


        public ViewHolder(View view) {
            super(view);

            textName = view.findViewById(R.id.txt_media_title);
            textInfo = view.findViewById(R.id.txt_media_info);
            imgThumbnail = view.findViewById(R.id.img_media_thumbnail);
            video_media = view.findViewById(R.id.video_media);
        }

    }

}
