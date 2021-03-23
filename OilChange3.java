//Ryan Malani

import java.util.Scanner; //makes scanner available

public class OilChange3
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in); //makes scanner usable

    System.out.println("Oil Change Service");
    for(int i = 1; i <= 3; i++) //repeat task 3 times
    {
      System.out.println("\nEnter License Plate Number: ");
      String license_plate_number = input.next();

      System.out.println("Enter Vehicle Make: ");
      String vehicle_make = input.next();

      System.out.println("Enter Vehicle Model: ");
      String vehicle_model = input.next();

      input.nextLine(); //clears buffer

      System.out.println("Enter Vehicle Year: ");
      int vehicle_year = input.nextInt();

      System.out.println("Enter Vehicle Color: ");
      String vehicle_color = input.next();

      System.out.println("Enter Vehicle Mileage: ");
      double vehicle_mileage = input.nextDouble();

      input.nextLine();

      System.out.print("Select a service package:\n1. Conventional Oil\n2. High-Mileage Oil\n3. Synthetic Oil\n");
      int service_package = input.nextInt(); //end of user prompts

      double conventional = 31.99;
      double high_mileage = 49.99;
      double synthetic = 75.99;
      double sales_tax = 10 / 100.0;
      double service_fee = 0.0;

      if(service_package == 1)
      {
        service_fee = conventional * (sales_tax + 1);
      }
      else if(service_package == 2)
      {
        service_fee = high_mileage * (sales_tax + 1);
      }
      else if(service_package == 3)
      {
        service_fee = synthetic * (sales_tax + 1);
      }
      else
      {
        System.out.println("Error");
      }

      System.out.print("Vehicle Information:");
      System.out.printf("\nLicense Plate: %s", license_plate_number);
      System.out.printf("\nMake/Model: %s %s", vehicle_make, vehicle_model);
      System.out.printf("\nYear: %d", vehicle_year);
      System.out.printf("\nColor: %s", vehicle_color);
      System.out.printf("\nMileage: %.1f", vehicle_mileage);
      System.out.printf("\nYour Service Fee (Tax included): $%.2f", service_fee);
      //end of output
    }
  }
}
