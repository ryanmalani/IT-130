//Ryan Malani

import java.util.Scanner; //makes Scanner available

public class CountFamilies
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in); //makes Scanner usable

    System.out.print("How many family members do you have? ");
    int family_members = input.nextInt();

    double family [] = new double[family_members];

    for(int index = 0; index < family.length; index++) //inputs for array
    {
      System.out.print("Please enter income of family member " + (index + 1) +": ");
      family[index] = input.nextDouble();
    }

    double highest_income = 0.0; //initializing variable for finding max income

    for(int index = 0; index < family.length; index++) //finding max income
    {
      if(family[index] > highest_income)
      {
        highest_income = family[index];
      }
    }

    double percent_income = highest_income * .1; //10 percent of maximum income
    int count_below = 0; //initializing variable for counting incomes below 10 percent of max
    for(int index = 0; index < family.length; index++)
    {
      if(family[index] < percent_income)
      {
        count_below++;
      }
    }

    for(int index = 0; index < family.length; index++) //outputs
    {
      System.out.printf("\nIncome of family member %d is $%.2f", (index + 1), family[index]);
    }
    System.out.printf("\nMaximum income: $%.2f", highest_income);
    System.out.printf("\n10 percent of maximum income: $%.2f", percent_income);
    System.out.printf("\nNumber of family members whose income is below 10 percent: %d", count_below);
  }
}
