package com.example.week4_challenge.RecyclerViewActivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.example.week4_challenge.R;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MoviesActivity extends AppCompatActivity {

    private List<Movie> movies;
    private RecyclerView recyclerViewMovies;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movies);

        getMovies();
        recyclerViewMovies = this.findViewById(R.id.recyclerViewMovies);

        setLayoutManager(recyclerViewMovies);
        setAdapter(recyclerViewMovies);

    }

    private void setAdapter(RecyclerView recyclerViewMovies) {
        MoviesAdapter moviesAdapter = new MoviesAdapter(movies);
        recyclerViewMovies.setAdapter(moviesAdapter);
    }

    private void setLayoutManager(RecyclerView recyclerViewMovies) {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerViewMovies.setLayoutManager(linearLayoutManager);
    }

    private void getMovies() {
        movies = new ArrayList<>();
        Movie movie = null;
        for (int i = 0; i < 30; i++){
            movie = new Movie();
            movie.setName("The Avengers: Infinity War " + i);
            movie.setProductionCompany("Marvel " + i);
            movie.setUrlImage("https://lumiere-a.akamaihd.net/v1/images/au_homepage_avengersendgame_hero_short_m_5618553b.jpeg");
            movies.add(movie);
        }
    }
}
