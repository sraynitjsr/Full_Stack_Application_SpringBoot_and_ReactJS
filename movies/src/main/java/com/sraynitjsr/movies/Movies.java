package com.sraynitjsr.movies;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collation = "movies")
public class Movies {
    private ObjectId id;
    private String imdbId;
    private String title;
    private List<String> moviesList;
}
