/*
A String literal is any sequence of characters enclosed in double-quotes (""). Like primitive-type variables, we declare a String variable by specifying the type first:

String greeting = "Hello World";

We could also create a new String object by calling the String class when declaring a String like so:

String salutations = new String("Hello World");


escape characters: '\' work the same as in python 

*/

public class Song {
	public static void main(String[] args) {   
        
    String openingLyrics = "Yesterday, all my troubles seemed so far away";
    
    String salutations = new String("Hello World");

    System.out.println(salutations.length());
  
    System.out.println(openingLyrics);
	}
}