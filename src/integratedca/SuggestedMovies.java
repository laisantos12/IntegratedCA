/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package integratedca;


import java.util.List;
import java.util.Random;

/**
 *
 * @author tahro
 */
public class SuggestedMovies {
    List<Movie> suggestions = newArrayList<>();
    Random randomNum = new Random();
    int nuumberOfSuggestions = 5;
    
    public List<Movie> getSuggestions() {
        return suggestions;
    }
    
    public void suggestedMovies(List<Movie> movies, int sizeOfTheMovieList){
        for(int i=0;i<numberOfSuggestions;i++){
        suggestions.add(movies.get(randomNum.nextInt(sizeOfTheMovieList)));

    }

}
