import java.util.Random;
import java.util.Scanner;

public class Card
{
	@SuppressWarnings("resource")
	public static void main ( String[] args )
	{
		Random r = new Random();
		String answer = "Y";
		int choice = 1;
		double bet = 0;
		Scanner sc = new Scanner (System.in);
			
		while (answer.equalsIgnoreCase("Y"))
		{		
		System.out.println("How much do you want to bet?\n");
		bet = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Which one is the ace?\n##	##	##\n##	##	##\n1	2	3\n");
		choice = sc.nextInt();
		sc.nextLine();
	
		int location = 1 + r.nextInt(3);
		
			if (choice == 1)
			{
				if ( choice == location )
				System.out.println( "You nailed it! Fast Eddie reluctantly hands over your winnings, scowling.\nAA	##	##\nAA	##	##\n1	2	3\n");
				else 
				System.out.println( "\r##	##	##\n##	##	##\n1	2	3\n Ha! Fast Eddie wins again! The ace was card number " +location );
			}
			
			else if (choice == 2)
			{
				if ( choice == location )
				System.out.println( "You nailed it! Fast Eddie reluctantly hands over your winnings, scowling.\n##	AA	##\n##	AA	##\n1	2	3\n");
				else 
				System.out.println( "\n##	##	##\n##	##	##\n1	2	3\n Ha! Fast Eddie wins again! The ace was card number " +location );
			}
			
			else if (choice == 3)
			{
				if ( choice == location )
				System.out.println( "You nailed it! Fast Eddie reluctantly hands over your winnings, scowling.\n##	##	AA\n##	##	AA\n1	2	3\n");
				else 
				System.out.println( "\n##	##	##\n##	##	##\n1	2	3\n Ha! Fast Eddie wins again! The ace was card number " +location );
			}
				System.out.println("Do you want to continue: (Y/N)?  ");
				answer = sc.nextLine();
		}
	}
	
			
}
