/*
 * Main template class with the menu with all the options
 * 
 */


 

import java.util.Scanner;

public class GameController {

   

    static void menu(){

        System.out.println("Enter an option");
        System.out.println(" 1: Display Room");
        System.out.println ("2: Display Entity Information ");
        System.out.println ("3: Reset the room");
        System.out.println ("0: Exit");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
    Room world = new Room();  
    
    System.out.println(world.toString());
    System.out.println("Initialise the room here");
     world.resetRoom();
     
    Scanner kb = new Scanner(System.in);
    int option;
  

    do  {
	menu();
    option = kb.nextInt();
    kb.nextLine();
    switch (option) {
       case 1: System.out.println("Option to display room");
                 System.out.println(world.toString());
               
                break;
    
      case 2: System.out.println(" ENter the position of the entity that you want to display ");

                break;
       case 3: System.out.println("Option to reset the room:");
                
                world.resetRoom();

                break;

                
       case 0: System.out.println(" Game Over");
                break;

       default: System.out.println("Sorry wrong option");
     }
    } while (option != 0); 
      
    }
 }
