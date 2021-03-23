//Ryan Malani

import java.util.Scanner; //makes Scanner available

public class CashRegister
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in); //makes Scanner usable

    System.out.print("Name of Customer: ");
    String customername = input.nextLine();

    System.out.print("Date of Reservation: ");
    String reservationdate = input.next();

    input.nextLine(); //clears buffer of Scanner

    System.out.print("Number of Ticket(s): ");
    int tickets = input.nextInt();

    double totalcost = 25.50 * tickets;
    double salestax = totalcost * .07;
    double balancedue = totalcost + salestax;

    System.out.println("\nReservation Details");
    System.out.printf("Name of Customer: %s", customername);
    System.out.printf("\nDate of Reservation: %s", reservationdate);
    System.out.printf("\nNumber of Ticket(s): %d", tickets);
    System.out.printf("\nCost of Ticket(s) (25.50 x %d): $%.2f", tickets, totalcost);
    System.out.printf("\nSales Tax: $%.2f", salestax);
    System.out.printf("\nBalance Due: $%.2f", balancedue);
    
    System.out.print("\nCash Received: $");
    double cashreceived = input.nextDouble();
    double changedue = cashreceived - balancedue;

    System.out.printf("\nChange Due: $%.2f", changedue);
    System.out.print("\nThank you for your reservation.");
  }
}
