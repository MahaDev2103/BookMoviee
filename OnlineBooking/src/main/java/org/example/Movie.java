package org.example;

import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;

@Component
public class Movie {

    public LinkedList getMovie(){
        System.out.println("Get Movies");
        LinkedList movieList = new LinkedList();
        movieList.add("Never Back Down");
        movieList.add("Tomorrow Never Dies");
        return movieList;
    }
}
