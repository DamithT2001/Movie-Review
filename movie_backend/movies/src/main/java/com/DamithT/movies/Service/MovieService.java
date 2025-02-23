package com.DamithT.movies.Service;

import com.DamithT.movies.Model.Movie;
import com.DamithT.movies.Repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:3000")
@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;
    public List<Movie>allMovies(){
        return movieRepository.findAll();
    }

    public Optional<Movie>singleMovie(String imdbId){ return movieRepository.findMovieByImdbId(imdbId);}
}
