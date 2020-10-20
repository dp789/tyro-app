package com.example.deepak.tyroapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MusicRecyclerView extends RecyclerView.Adapter<MusicRecyclerView.MyViewHolder> {

    private Context musicContext;
    private List<MusicGetterSetter> musicData;

    public MusicRecyclerView(Context musicContext, List<MusicGetterSetter> musicData) {
        this.musicContext = musicContext;
        this.musicData = musicData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater musicInflator =  LayoutInflater.from(musicContext);
        view = musicInflator.inflate(R.layout.book_item_list,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.musictitle.setText(musicData.get(position).getTitle());
        holder.musicthumbnail.setImageResource(musicData.get(position).getThumbnail());

    }

    @Override
    public int getItemCount() {
        return musicData.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView musictitle;
        ImageView musicthumbnail;

        public MyViewHolder(View itemView) {
            super(itemView);

            musictitle = itemView.findViewById(R.id.book_text);
            musicthumbnail = itemView.findViewById(R.id.book_image);
        }
    }
}
