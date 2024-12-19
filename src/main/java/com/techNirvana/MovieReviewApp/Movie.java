package com.techNirvana.MovieReviewApp;

import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Document(collection = "movies")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie {
    @Id
    private ObjectId id;
    private String imdbId;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private String poster;
    private List<Object> genre;
    private List<String> backdrops;
    @DocumentReference
    private List<Review> reviewIds;

    public String getTitle() {
        return title;
    }
    public ObjectId getId(){
        return id;
    }
    public String getImdbId(){
        return imdbId;
    }
    public String getReleaseDate(){
        return releaseDate;
    }
    public String getTrailerLink(){
        return trailerLink;
    }
    public String getPoster(){
        return poster;
    }
    public List<Object> getGenre(){
        return genre;
    }
    public List<Review> getReviewIds(){
        return reviewIds;
    }
    public List<String> getBackdrops(){
        return backdrops;
    }

}
