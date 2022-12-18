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

    public Movie(int id, String original_title, String release_date, String runtime, String tagline, String vote_average, String price) {
        this.id = id;
        this.original_title = original_title;
        this.release_date = release_date;
        this.runtime = runtime;
        this.tagline = tagline;
        this.vote_average = vote_average;
        this.price = price;
    }

    private static final int RENTDURATION = 5000;

    private long activatedAt = Long.MAX_VALUE;

    public void activate() {
        activatedAt = System.currentTimeMillis();
    }

    public boolean isActive() {

        long activeFor = System.currentTimeMillis() - activatedAt;

        return activeFor >= 0 && activeFor <= RENTDURATION;
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

        return "*---Catalog---*\n" + "ID: " + id + "\n" + "Title: " + original_title
                + "\n" + "Release Date: " + release_date + "\n" + "Runtime: "
                + runtime + " min" + "\n" + "Tagline: " + tagline + "\n" + "Vote Average: "
                + vote_average + "\n" + "Price: " + "€ " + price + "\n";
    }

    public static Movie createMovie(int idApplier, String[] metadata) {

        int id = idApplier;
        int lastData = metadata.length;
        String original_title = metadata[0];
        String release_date = metadata[1];
        String runtime = metadata[2];
        String tagline = metadata[3];
        for (int i = 4; i < lastData - 2; i++) {
            tagline = tagline + "," + metadata[i];
        }
        String vote_average = metadata[lastData - 2];
        String price = metadata[lastData - 1];
        return new Movie(id, original_title, release_date, runtime, tagline, vote_average, price);
    }

}
