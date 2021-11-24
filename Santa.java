package santaClaus;

import java.util.List;
/**
 * Name: Nishant Pokhrel 
 * Date: November 21, 2021 
 * Subject: CS 216- Data Structures & Algorithms 
 * Assignment: chapter10
 * Purpose: This program displays Santa's list for Naughty 
 * and nice person and the gifts they receive.
 * 
 * @author Npokhrel
 */
import java.util.ArrayList;

public class Santa {

	public static void main(String[] args) {
		//Santa's list of Naughty people
		ArrayList<Name> NaughtyPersons = new ArrayList<Name>(); 
		NaughtyPersons.add(new Name("Emmanuel", "Kant"));
		NaughtyPersons.add(new Name("Karl", "Marx"));
		NaughtyPersons.add(new Name("Joseph", "Stalin"));
		NaughtyPersons.add(new Name("Mao", "Ming"));
		
       //Santa's list for Nice people and the gifts they receive
		ArrayList<NicePerson> NicePersonsList = new ArrayList<NicePerson>(); 
		NicePerson nice1 = new NicePerson(new Name("Steve", "Nouri"));
		nice1.addGift("Iphone"); //Adding gifts to nice1
		nice1.addGift("Nike Air");
		nice1.addGift("Candy");
		NicePersonsList.add(nice1); //Adding nice1 to NicePersonsList

		NicePerson nice2 = new NicePerson(new Name("Nick", "Patel"));
		nice2.addGift("Airpods Pro");
		nice2.addGift("Gift Card");
		nice2.addGift("Wallet");
		NicePersonsList.add(nice2); //Adding nice2 to NicePersonsList

		NicePerson nice3 = new NicePerson(new Name("Hemanta", "Parajuli"));
		nice3.addGift("Drone");
		nice3.addGift("Credit Card");
		nice3.addGift("MacBook");
		NicePersonsList.add(nice3); //Adding nice3 to NicePersonsList

		NicePerson nice4 = new NicePerson(new Name("Sushant", "Paudel"));
		nice4.addGift("Dumbbells");
		nice4.addGift("Book");
		nice4.addGift("Sneakers");
		NicePersonsList.add(nice4); //Adding nice4 to NicePersonsList

		// Displaying the lists one by one
		System.out.println("Surprise Surprise!!!!!!");
		System.out.println(" ");
		System.out.print("The first person to receive the gift is ");
		System.out.println(nice1.getName() + ".");

		System.out.println("Santa's gift for " + nice1.getName() + " are:");
		System.out.println(nice1.getGifts());
		System.out.println(" ");
		System.out.println("**********************************************");

		System.out.print("The next person to receive the gift is ");
		System.out.println(nice2.getName() + ".");
		System.out.println("Santa's gift for " + nice2.getName() + " are:");
		System.out.println(nice2.getGifts());
		System.out.println(" ");
		System.out.println("**********************************************");

		System.out.print("The next person to receive the gift is ");
		System.out.println(nice3.getName() + ".");
		System.out.println("Santa's gift for " + nice3.getName() + " are:");
		System.out.println(nice3.getGifts());
		System.out.println(" ");
		System.out.println("**********************************************");

		System.out.print("The next person to receive the gift is ");
		System.out.println(nice4.getName());
		System.out.println("Santa's gift for " + nice4.getName() + " are:");
		System.out.println(nice4.getGifts());
		System.out.println(" ");
		System.out.println("**********************************************");

		System.out.println("The people listed below are in Santa's Naughty list:\n" + NaughtyPersons
				+ " \nThey only get COALS this Christmas.");
		System.out.println(" ");

		System.out.println("Happy Christmas to you all.");
		System.out.println(" ");
		System.out.print("###########################################");

	}
}//end
