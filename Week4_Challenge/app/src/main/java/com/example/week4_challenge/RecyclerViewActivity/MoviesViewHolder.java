package com.example.week4_challenge.RecyclerViewActivity;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.week4_challenge.R;


public class MoviesViewHolder extends RecyclerView.ViewHolder {

    private TextView textViewName;
    private TextView textViewProductionCompany;
    private ImageView imageViewMovie;

    public MoviesViewHolder(@NonNull View itemView) {
        super(itemView);

        this.textViewName = itemView.findViewById(R.id.textViewName);
        this.textViewProductionCompany = itemView.findViewById(R.id.textViewProductionCompany);
        this.imageViewMovie = itemView.findViewById(R.id.imageViewMovie);

    }

    public TextView getTextViewName() {
        return textViewName;
    }

    public TextView getTextViewProductionCompany() {
        return textViewProductionCompany;
    }

    public ImageView getImageViewMovie() {
        return imageViewMovie;
    }
}
