package com.grupo6.retrofit.Interfaz;

import com.grupo6.retrofit.Modelo.Albums;
import com.grupo6.retrofit.Modelo.Comments;
import com.grupo6.retrofit.Modelo.Posts;
import com.grupo6.retrofit.Modelo.Users;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JsonPlaceHolderApi {

    @GET("posts") Call<List<Posts>> getPosts();
    @GET("comments") Call<List<Comments>> getComments();
    @GET("albums") Call<List<Albums>> getAlbums();
    @GET("users") Call<List<Users>> getUsers();
}