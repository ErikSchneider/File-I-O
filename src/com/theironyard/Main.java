package com.theironyard;

import jodd.json.JsonParser;
import jodd.json.JsonSerializer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {



    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {


        Movie m1 = loadMovie();
        if (m1 != null) {

            System.out.println(m1.toString());
        }
        else {
            m1 = new Movie();
        }
        System.out.println("What is you favorite movie?");
        m1.title = scanner.nextLine();

        System.out.println("Who is the director?");
        m1.director = scanner.nextLine();

        System.out.println("What is the genre?");
        m1.genre = scanner.nextLine();

        System.out.println("What is the movie rated?");
        m1.rating = scanner.nextLine();

        System.out.println("What year was it released?");
        m1.releaseYear = scanner.nextLine();

        System.out.println(m1.toString());

        saveMovie(m1);

    }

    public static void saveMovie(Movie m1) {
        JsonSerializer serializer = new JsonSerializer();
        String json = serializer.serialize(m1);

        File m = new File("favoriteMovie.json");
        try {
            FileWriter fw = new FileWriter(m);
            fw.write(json);
            fw.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static Movie loadMovie() {
        File m = new File("favoriteMovie.json");
        try {
            Scanner scanner = new Scanner(m);
            scanner.useDelimiter("\\Z");
            String contents = scanner.nextLine();
            JsonParser parser = new JsonParser();
            return parser.parse(contents, Movie.class);
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred while trying to load data.");
        }
        return null;
    }
}
