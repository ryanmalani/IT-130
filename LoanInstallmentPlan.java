//Ryan Malani

import java.util.Scanner; //makes Scanner available

public class LoanInstallmentPlan
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);

    System.out.print("First Name: ");
    String firstname = input.next();

    System.out.print("Last Name: ");
    String lastname = input.next();

    input.nextLine(); //clears buffer of Scanner

    System.out.print("Billing Address: ");
    String billingaddress = input.nextLine();

    System.out.print("Loan Amount: ");
    double loanamount = input.nextDouble();

    System.out.print("Term of Loan (Months): ");
    int loanterm = input.nextInt();

    double interestrate = 3.9 / 100;
    double totalinterest = loanamount * interestrate;
    double totalloanamount = loanamount + totalinterest;
    double monthlypayment = totalloanamount / loanterm;

    System.out.printf("Borrower: %s", firstname + " " + lastname);
    System.out.printf("\nBilling Address: %s", billingaddress);
    System.out.printf("\nLoan Amount: $%.2f", loanamount);
    System.out.printf("\nInterest: $%.2f", totalinterest);
    System.out.printf("\nTotal Loan Amount: $%.2f", totalloanamount);
    System.out.printf("\nTerm of loan: %d months", loanterm);
    System.out.printf("\nPayment/month: $%.2f", monthlypayment);
  }
}
