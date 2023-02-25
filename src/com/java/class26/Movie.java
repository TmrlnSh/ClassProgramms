package com.java.class26;

public class Movie {
    String name;
    String genre;
    int rate;


     Movie(String nameFromUser, String genreFromUser, int rateFromUser){
        name = nameFromUser;
        genre = genreFromUser;
        rate = rateFromUser;
         System.out.println(genre+" - "+name);
         System.out.println("Your rate - "+rate);
    }


     Movie(){
         genre = "Comedy";
         name = "Untouchable";
         rate = 10;
        System.out.println(genre+" - "+name);
        System.out.println("Your rate - "+rate);
    }
}
