package com.example.paginationapplication.PaginationAPI;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface MovieSerivice {
    @GET("volley_array.json")
    Call<List<Movie>> getMovies();
}
