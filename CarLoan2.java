//Ryan Malani

import java.util.Scanner; //makes scanner available

public class CarLoan2
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
    int loan_term = input.nextInt();

    System.out.println("Enter Credit Score: ");
    int credit_score = input.nextInt(); //end inputs

    double interest_rate = 0; //placeholder for interest rate

    if(credit_score <= 500 && credit_score > 0) //determining interest rate
    {
      interest_rate = .1;
    }
    else if(credit_score > 500 && credit_score <= 700)
    {
      interest_rate = .05;
    }
    else if(credit_score > 700 && credit_score <= 900)
    {
      interest_rate = .03;
    }
    else
    {
      System.out.println("Error");
    }

    double total_price = vehicle_price - trade_value - down_payment; //calculating total vehicle price
    double total_interest = total_price * interest_rate; //calculating total interest
    double grand_total = total_price + total_interest; //calculating grand total
    double monthly_payment = grand_total / loan_term; //calculating monthly payment

    System.out.printf("Total Vehicle Price: $%.2f", total_price);
    System.out.printf("\nInterest: $%.2f", total_interest);
    System.out.printf("\nGrand Total: $%.2f", grand_total);
    System.out.printf("\nMonthly Payment: $%.2f", monthly_payment); //end output
  }
}
