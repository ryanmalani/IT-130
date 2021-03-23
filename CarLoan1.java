//Ryan Malani

import java.util.Scanner; //makes scanner available

public class CarLoan1
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in); //makes scanner usable

    System.out.println("Enter Vehicle Price: "); //start of inputs
    double vehicle_price = input.nextDouble();

    System.out.println("Enter Trade-in Value: ");
    double trade_value = input.nextDouble();

    System.out.println("Enter Down Payment: ");
    double down_payment = input.nextDouble();

    System.out.println("Enter Term of Loan (Number of Months): ");
    int loan_term = input.nextInt(); //end inputs

    double total_price = vehicle_price - trade_value - down_payment; //calculating total vehicle price
    double monthly_payment = total_price / loan_term; //calculating monthly payment

    System.out.printf("Total Vehicle Price: $%.2f", total_price);
    System.out.printf("\nMonthly Payment: $%.2f", monthly_payment); //end output
  }
}
