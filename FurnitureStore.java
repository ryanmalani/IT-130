//Ryan Malani

import java.util.Scanner; //makes Scanner available

public class FurnitureStore
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in); //makes scanner usable

    int decision; //used for user's first input choices

    do
    {
      String wood_type = ""; //output variables
      String size = "";
      double price = 0.0;

      System.out.println("Table Prices");
      System.out.println("Choose 1 for pine"); //begin of user input options
      System.out.println("Choose 2 for oak");
      System.out.println("Choose 3 for mahogany");
      System.out.println("Choose 4 for EXIT");
      decision = input.nextInt();

      if(decision == 1) //determining type of table
      {
        wood_type = "Pine";
        price = 100.0;
      }
      else if(decision == 2)
      {
        wood_type = "Oak";
        price = 225.0;
      }
      else if(decision == 3)
      {
        wood_type = "Mahogany";
        price = 310.0;
      }
      else if(decision == 4) //doesn't ask next question if 4 is entered
      {
        break;
      }
      else //invalid input check 1
      {
        System.out.println("Error");
        break;
      }

      System.out.println("Size: (1) large or (2) small"); //user input for table size
      int size_choice = input.nextInt();

      if(size_choice == 1) //determining size of table
      {
        size = "large";
        price += 35;
      }
      else if(size_choice == 2)
      {
        size = "small";
      }
      else //invalid input check 2
      {
        System.out.println("Error");
        break;
      }

      System.out.print("You selected the following table:");
      System.out.printf("\nWood: %s", wood_type);
      System.out.printf("\nSize: %s", size);
      System.out.printf("\nPrice: $%.2f\n", price); //end of output
    } while (decision != 4); //end of loop
    System.out.println("Thank you. Have a nice day!!!");
  }
}
