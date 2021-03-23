//Ryan Malani

import java.util.Scanner; //makes Scanner available

public class OfficeSpaceCommission
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in); //makes Scanner usable

    System.out.println("Office Spcae Leasing Commission");
    //Getting inputs from user
    System.out.println("Enter Realtor Name: ");
    String realtor_name = input.nextLine();

    System.out.println("Enter width of office space in feet: ");
    int width = input.nextInt();

    System.out.println("Enter length of office space in feet: ");
    int length = input.nextInt();
    //End inputs

    int office_space = width * length; //start of calculations for output
    double leasing_fee = office_space * 25;
    double leasing_agreement = leasing_fee * 12;
    double leasing_commission = leasing_agreement * .05;

    System.out.println("Leasing Commission Summary");
    //Start of output
    System.out.printf("Realtor name: %s", realtor_name);
    System.out.printf("\nOffice space: %d square feet", office_space);
    System.out.printf("\nLeasing fee per month: $%.2f", leasing_fee);
    System.out.printf("\nLeasing agreement for one year: $%.2f", leasing_agreement);
    System.out.printf("\nLeasing commission for this agreement: $%.2f", leasing_commission);
  }
}
