package intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		//ArrayList<String> stringsList = new ArrayList<String>(5);
		//2. Add five Strings to your list
		String[] stringsList = {"Mochi","Blink","Once","Dumpling","Solo"};
		
		//3. Print all the Strings using a standard for-loop
		for (int i=0;i<stringsList.length;i++) {
		     System.out.println(stringsList[i]);
		}
		System.out.println("\n");
		
		//4. Print all the Strings using a for-each loop
		for (String g : stringsList) {
		     System.out.println(g);
		}
		System.out.println("\n");
		
		//5. Print only the even numbered elements in the list.
		for (int i=0;i<stringsList.length;i++) {
			if(i%2==0) {
		     System.out.println(stringsList[i]);
			}
		}
		System.out.println("\n");
		
		//6. Print all the Strings in reverse order.
		for (int i=stringsList.length - 1; i >= 0;i--) {
		     System.out.println(stringsList[i]);
		}
		System.out.println("\n");
		//7. Print only the Strings that have the letter 'e' in them.
		for (int i=0;i<stringsList.length;i++) {
			if(stringsList[i].contains("e"))
		     System.out.println(stringsList[i]);
		}
		System.out.println("\n");
		
		
		
	}
}
