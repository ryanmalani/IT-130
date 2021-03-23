//Ryan Malani

import java.util.Scanner; //makes scanner available

public class OilChange1
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in); //makes scanner usable

    System.out.println("Oil Change Service");

    System.out.println("Enter License Plate Number: ");
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
    double vehicle_mileage = input.nextDouble(); //end of user prompts

    System.out.print("Vehicle Information:");
    System.out.printf("\nLicense Plate: %s", license_plate_number);
    System.out.printf("\nMake/Model: %s %s", vehicle_make, vehicle_model);
    System.out.printf("\nYear: %d", vehicle_year);
    System.out.printf("\nColor: %s", vehicle_color);
    System.out.printf("\nMileage: %.1f", vehicle_mileage); //end of output
  }
}
