package com.ernazar.movies;

import java.util.PrimitiveIterator.OfDouble;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;                                                            
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;
@Document(collection= "movie-api-db")
@Data
@AllArgsConstructor
public class Movie {
    @Id
    private Object id;
    private String imdbId;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private String poster;
    private List<String> genres;
    private List<String> backdrops;
    
    @DocumentReference
    private List<Review> reviewIds;
}
