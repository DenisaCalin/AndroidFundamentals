package com.example.week4_challenge.RecyclerViewActivity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.week4_challenge.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class MoviesAdapter extends RecyclerView.Adapter<MoviesViewHolder> {

    private List<Movie> movies;

    public MoviesAdapter(List<Movie> movies) {
        this.movies = movies;
    }

    @NonNull
    @Override
    public MoviesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View movieItem = LayoutInflater.from(parent.getContext()).inflate(R.layout.movie_item, parent, false);
        return new MoviesViewHolder(movieItem);
    }

    @Override
    public void onBindViewHolder(@NonNull MoviesViewHolder holder, int position) {
        Movie currentMovie = movies.get(position);
        holder.getTextViewName().setText(currentMovie.getName());
        holder.getTextViewProductionCompany().setText(currentMovie.getProductionCompany());

        Picasso.get()
                .load(currentMovie.getUrlImage())
                .into(holder.getImageViewMovie());

        if(holder.getAdapterPosition() % 2 == 1) {
            holder.itemView.setBackgroundResource(R.color.colorPrimary);


        }

    }

    @Override
    public int getItemCount() {
        return movies.size();
    }

}
