//Ryan Malani

import java.util.Scanner; //makes Scanner available

public class ScoreStat
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter Student Name: ");
    String student_name = input.nextLine();

    int scores [] = new int [10]; //creating array
    int total = 0; //initializing variable for total score
    int count_passing = 0; //initializing variable for passing score count
    int count_failing = 0; //initializing variable for failing score count

    for(int index = 0; index < scores.length; index++)
    {
      System.out.print("Enter score " + (index + 1) + ": ");
      int score = input.nextInt();
      if(score <= 100 && score >= 50 && score >= 0)
      {
        scores[index] = score;
        total += score;
        count_passing++;
      }
      else if(score <= 100 && score <= 49 && score >= 0)
      {
        total += score;
        count_failing++;
      }
      else
      {
        System.out.println("Error");
        break;
      }
    }

    double average_score = total / 10.0; //calculating average score

    System.out.printf("Score Summary of %s", student_name);
    System.out.printf("\nAverage Score: %.1f", average_score);
    System.out.printf("\nNumber of Passing Scores: %d", count_passing);
    System.out.printf("\nNumber of Failing Scores: %d", count_failing);
  }
}
