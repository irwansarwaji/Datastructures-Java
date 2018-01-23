/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistexample;

import java.util.ArrayList;

/**
 *
 * @author Irwan Sarwaji
 */
public class ArrayListExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        String[] platform1 = {"PS4"};
        String[] platform2 = {"3DS", "Wii U"};
        
        //Create an object and use the class constructor
        VideoGame game1 = new VideoGame("Battlefield 1", 2001, "M", platform1);
        VideoGame game2 = new VideoGame("Pokemon sun", 2016, "E", platform2);
        VideoGame game3 = new VideoGame("The Legend of Zelda", 2017, "E", platform2);
        
        //create an arraylist of games
        //create an arraylist with the datatype VideoGame which is equal to a new arraylist
        ArrayList<VideoGame> games = new ArrayList<>();// use <> because with java 7 and above we dont need to repeat the datatype
        
        //start adding items to the arraylist
        games.add(game1);
        games.add(game2);
        System.out.println(games);
             
    }
    
}
