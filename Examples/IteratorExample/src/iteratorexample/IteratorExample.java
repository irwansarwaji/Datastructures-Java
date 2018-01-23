/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iteratorexample;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/**
 *
 * @author Irwan Sarwaji
 */
public class IteratorExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Using the Collection Object
        Collection collection1 = Arrays.asList("red","orange","yellow",
                "green" , "blue" , "indigo", "violet");
        
        //I want to walk through the list
        //Use the Iterator object
        Iterator iterator = collection1.iterator(); //this new object has the methods next, hasnext etc.
        while(iterator.hasNext())//as long as there is another one in my list
        {
            //hasNext checks to see if there is another element and
            //next gets a copy of the element and moves the pointer to the next  element
            System.out.println(iterator.next());
        }
                
        
    }
    
}
