package com.theironyard;

/**
 * Created by Erik on 5/25/16.
 */
public class Movie {
    String title;
    String director;
    String genre;
    String rating;
    String releaseYear;

    public Movie() {
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public String getGenre() {
        return genre;
    }

    public String getRating() {
        return rating;
    }

    public String getReleaseYear() {
        return releaseYear;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", director='" + director + '\'' +
                ", genre='" + genre + '\'' +
                ", rating='" + rating + '\'' +
                ", releaseYear='" + releaseYear + '\'' +
                '}';

    }
}

