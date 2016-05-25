package com.theironyard;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

/**
 * Created by Erik on 5/25/16.
 */
public class MainTest {

    @Test
    public void saveAndLoad() throws Exception {
        Movie m1 = new Movie();
        m1.title = "Test Title";
        m1.director = "Test Director";
        m1.genre = "Test Genre";
        m1.rating = "Test Rating";
        m1.releaseYear = "Test Release Year";

        Main.saveMovie(m1);
        Movie newMovie = Main.loadMovie();

        assertTrue(m1 != null);
        assertTrue(m1.title.equals(newMovie.title));
        assertTrue(m1.director.equals(newMovie.director));
        assertTrue(m1.genre.equals(newMovie.genre));
        assertTrue(m1.rating.equals(newMovie.rating));
        assertTrue(m1.releaseYear.equals(newMovie.releaseYear));


    }


}