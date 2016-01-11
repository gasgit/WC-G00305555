package ie.gmit.sw.Runner;

import java.util.Scanner;

/**
 * Class to create a menu to select which type of WordCloud to generate
 * @author glen
 *
 */



public class Menu {
	
	
	
	private static Scanner scan = new Scanner(System.in);  // for input with menu
	
	private MethodRunner rn = new MethodRunner();
	/**
	 * 
	 * Menu that allows selection to create WordCloud from file or url<br/>
	 * Take input from user<br/>
	 * Uses MethodRunner to select which methods<br/>
	 * 
	 * 
	 */
		public  int  showMenu() throws Exception
		{	
				
			int choice =0;
			System.out.println("---------------------------------------------------------------------------- ");
			System.out.println("\t\t\t1. WordCloud Text");
			System.out.println("\t\t\t2. WordCloud URL");
			
			System.out.println("---------------------------------------------------------------------------- ");
			System.out.println("\nEnter choice: ");
			
			while(choice != 3)
			
			{
				 choice  = scan.nextInt();
				 
				switch (choice)
				{
					case 1:
						
						rn.fileCloud();
						rn.buildImage();	
						showMenu();
						break;	
						
					case 2:	
						rn.htmlCloud();
						rn.buildImage();
						showMenu();
						break;
						
					case 3:	
						
						showMenu();
						break;
					
					
					
					default:
						System.out.println("Invalid choice (1 - 3 ) ");
					
				}//end switch	
			}//end while
			return choice;
	
	}
}
