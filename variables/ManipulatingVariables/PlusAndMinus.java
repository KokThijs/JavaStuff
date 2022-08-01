/*
What if we took one additional picture of our cat?
We can reflect this change using an increment operator ++. 
When we append ++ to a number-based variable, it increases the value by 1.
We also have the decrement operator, --, which decreases the value by 1.
*/

public class PlusAndMinus {
	public static void main(String[] args) {   
		int zebrasInZoo = 8;
		int giraffesInZoo = 4;
	
		int animalsInZoo = zebrasInZoo + giraffesInZoo;
	
		System.out.println(animalsInZoo);
	
		int numZebrasAfterTrade = zebrasInZoo - 2;
	
		System.out.println(numZebrasAfterTrade);
	}
}