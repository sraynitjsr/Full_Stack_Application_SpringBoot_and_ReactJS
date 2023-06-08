package com.sraynitjsr.movies;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

import org.bson.types.ObjectId;

@Document(collation = "reviews")
public class Review {
    private ObjectId id;
    private String imdbId;
    private String title;
    private List<String> moviesList;
}
