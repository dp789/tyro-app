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

public class BookRecyclerViewAdapter extends RecyclerView.Adapter<BookRecyclerViewAdapter.MyViewHolder>{

    private Context bookContext;
    private List<BooksGetterSetter> bookData;

    public BookRecyclerViewAdapter(Context bookContext, List<BooksGetterSetter> bookData) {
        this.bookContext = bookContext;
        this.bookData = bookData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view;
        LayoutInflater bookInflator = LayoutInflater.from(bookContext);
        view = bookInflator.inflate(R.layout.book_item_list,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.booktitle.setText(bookData.get(position).getTitle());
        holder.bookthumbnail.setImageResource(bookData.get(position).getThumbnail());


    }

    @Override
    public int getItemCount() {
        return bookData.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView booktitle;
        ImageView bookthumbnail;
        public MyViewHolder(View itemView) {
            super(itemView);
            booktitle = itemView.findViewById(R.id.book_text);
            bookthumbnail = itemView.findViewById(R.id.book_image);
        }
    }
}
