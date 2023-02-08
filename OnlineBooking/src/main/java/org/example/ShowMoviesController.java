package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movie")
public class ShowMoviesController {
    @Autowired
    Movie movie;

    @GetMapping(path = "/show")
    public void showMovie()
    {
        System.out.println("Show Movies Running in chennai");
        movie.getMovie();
    }



}
