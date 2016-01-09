package ie.gmit.sw.paint;

import java.util.Scanner;

public class Menu {
	private static Scanner scan = new Scanner(System.in);  // for input with menu
	
	public static  int  showMenu() throws Exception
	{	
		int choice =0;
		System.out.println("---------------------------------------------------------------------------- ");
		System.out.println("\t\t\t1. Test Textfile");
		System.out.println("\t\t\t2. Test URL");
		
		System.out.println("---------------------------------------------------------------------------- ");
		System.out.println("\nEnter choice: ");
		
		while(choice != 3)
		
		{
			 choice  = scan.nextInt();
			 
			switch (choice)
			{
				case 1:
					showMenu();
					break;			
				case 2:				
					showMenu();
					break;
				case 3:				
					showMenu();
					break;
				
				
				
				default:
					System.out.println("Invalid choice (1 - 5 ) ");
				
			}//end switch	
		}//end while
		return choice;
		
		
	}

}
