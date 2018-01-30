/*
The LinkedList class operates very similar to an ArrayList. The biggest difference 
is the access to the elements and a LinkedList is always linear although it is bi-directional.

The LinkedList class uses a doubly linked list to manage the collection of objects.
This means that each node of the list contains a pointer to the node that proceeds 
it and one to the node that follows it which in turn means the list can be traversed 
in either direction. A node contains the element and the pointers required for 
the next and previous node. 

A LinkedList is good if you know that you're going to be adding elements to 
the middle or to the end of the list because it doesn't take as much overhead as 
it does to do that with an ArrayList.
 */
package linkedlistexample;

import java.util.LinkedList;
import java.util.ListIterator;

/** 
 *
 * @author Irwan Sarwaji
 */
public class Linkedlistexample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList states = new LinkedList();
        
       //Alaska points to Arizona, Arizona points to Arkansas.... 
        states.add("Alaska");
        states.add("Arizona");
        states.add("Arkansas");
        states.add("Pennsylvania");
        states.add("colorado");
        states.add("Connecticut");
        // Connecticut points to "NULL"
        
        states.addFirst("Alabama"); // addfirst to add at the beginning of the list
        System.out.println(states);
        
        //command the last element in the list
        System.out.println("\nLast state in the list: " + states.getLast());
        
        //How to iterate backwards through the list
        //create an object and decelarate it as "no caps" iterator
        /*
        *In the brackets I want to tell it to start at the last item in my list
        *therefor you need to do states.size 
        *"this allow me to change the size of my LinkedList
        */
        
        System.out.println("\nList in backwards: ");
        ListIterator iterator = states.listIterator(states.size());
        while(iterator.hasPrevious())//as long as there is an item in front of the item that im at
        {
            System.out.println(iterator.previous());// ..I will print it out
        }
            
             
    }
    
}
