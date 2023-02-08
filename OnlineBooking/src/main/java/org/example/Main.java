package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        ApplicationContext context = SpringApplication.run(Main.class,args);
        Movie movie = context.getBean(Movie.class);
        movie.getMovie();
    }
}