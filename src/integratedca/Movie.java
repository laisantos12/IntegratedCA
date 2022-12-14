/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integratedca;

/**
 *
 * @author danie
 */
public class Movie {
    int id;
    String original_title;
    String release_date;
    String runtime;
    String tagline;
    String vote_average;
    String price;

<<<<<<< HEAD
    public Movie(int id, String original_title, String release_date, String runtime, String tagline, String vote_average, String price) {
        this.id = id;
=======
    public Movie(int id,String original_title, String release_date, String runtime, String tagline, String vote_average, String price) {
        this.id= id;
>>>>>>> 25b5c85bace4b950a3ef9b44e5316b22623b53bf
        this.original_title = original_title;
        this.release_date = release_date;
        this.runtime = runtime;
        this.tagline = tagline;
        this.vote_average = vote_average;
        this.price = price;
    }



    public String getOriginal_title() {
        return original_title;
    }

    public String getRelease_date() {
        return release_date;
    }

    public String getRuntime() {
        return runtime;
    }

    public String getTagline() {
        return tagline;
    }


    public String getVote_average() {
        return vote_average;
    }

    public String getPrice() {
        return price;
    }

    @Override
    public String toString() {
<<<<<<< HEAD
        return "*---Catalog---*\n" +  "ID: " + id + "\n"+ "Title: " + original_title + 
                "\n" + "Release Date: " + release_date +"\n" + "Runtime: " 
                + runtime + "\n"+"Tagline: " + tagline + "\n" + "Vote Average: " 
                + vote_average +"\n"+ "Price: " + price + "."+"\n";
    }
    
    public static Movie createMovie(int idApplier,String[] metadata) { 
=======
        return "Movie{" +  "id: " + id +", original_title: " + original_title +  ", release_date: " + release_date + ", runtime: " + runtime + ", tagline: " + tagline + ", vote_average: " + vote_average + ", price: " + price + ".";
    }
    
    
    
     public static Movie createMovie(int idApplier,String[] metadata) { 
>>>>>>> 25b5c85bace4b950a3ef9b44e5316b22623b53bf
    int id= idApplier;
    String original_title = metadata[0];
    String release_date = metadata[1];
    String runtime = metadata[2];
    String tagline= metadata[3];
    String vote_average=metadata[4];
    String price=metadata[5];
    return new Movie( id ,original_title,release_date,runtime,tagline,vote_average,price);
     }
    
     
}
