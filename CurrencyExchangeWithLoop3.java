//Ryan Malani

import java.util.Scanner; //makes Scanner available

public class CurrencyExchangeWithLoop3
{
  public static void main(String [] args)
  {
    Scanner input = new Scanner(System.in); //makes Scanner usable

    do{ //loop begins here
      System.out.print("How much USD do you want to convert? ");
      double usd = input.nextDouble();

      System.out.print("\nEnter 1 for USD to CAD : Enter 2 for USD to INR : Enter 3 for USD to AED ");
      int decision = input.nextInt();

      if(decision == 1)
      {
        double cadrate = 0;

        if(usd > 0 && usd <= 100)
        {
          cadrate = 1.27;
        }
        else if(usd > 100 && usd <= 500)
        {
          cadrate = 1.50;
        }
        else if(usd > 500)
        {
          cadrate = 1.75;
        }
        else
        {
          System.out.println("Error");
        }

        double cad = usd * cadrate;
        System.out.printf("%.2f USD = %.2f CAD\n", usd, cad);
      }
      else if(decision == 2)
      {
        double inrrate = 0;

        if(usd > 0 && usd <= 100)
        {
          inrrate = 72.8;
        }
        else if(usd > 100 && usd <= 500)
        {
          inrrate = 75.0;
        }
        else if(usd > 500)
        {
          inrrate = 77.5;
        }
        else
        {
          System.out.println("Error");
        }

        double inr = usd * inrrate;
        System.out.printf("%.2f USD = %.2f INR\n", usd, inr);
      }
      else if(decision == 3)
      {
        double aedrate = 0;

        if(usd > 0 && usd <= 100)
        {
          aedrate = 3.67;
        }
        else if(usd > 100 && usd <= 500)
        {
          aedrate = 4.5;
        }
        else if(usd > 500)
        {
          aedrate = 5;
        }
        else
        {
          System.out.println("Error");
        }

        double aed = usd * aedrate;
        System.out.printf("%.2f USD = %.2f AED\n", usd, aed);
      }
      else
      {
        System.out.println("Error");
      }

      System.out.println("Enter 1 to Continue : 0 to Stop ");
      int answer = input.nextInt();

      if(answer == 1)
      {
        continue;
      }
      else if(answer == 0)
      {
        break;
      }
      else
      {
        System.out.println("Error");
      }
    }
    while(true);
  }
}
