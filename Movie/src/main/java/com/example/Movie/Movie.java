package com.example.Movie;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document(collection ="movie-api-doc")
@Data
@AllArgsConstructor
public class Movie {
    @Id
    private ObjectId id;
    private String imdbId;
    private String title;
    private String releaseDate;
    private String poster;
    private List<String> genres;
    private List<String> backdrops;
    private String trailerLink;
    @DocumentReference
    private List<Review> reviews;
}
