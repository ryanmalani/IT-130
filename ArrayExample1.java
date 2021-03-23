//Ryan Malani

public class ArrayExample1
{
  public static void main(String[] args)
  {
    int x = 0;
    System.out.println(x);
    x = 79;
    System.out.println(x);

    int score [] = new int [5];
    score[0] = 79;
    score[4] = 100;
    score[1] = 50;
    score[2] = 80;
    score[3] = 70;

    for(int i = 0; i <= 4; i++)
    {
      System.out.println("From loop: " + score[i]);
    }

    System.out.println(score[1]);
    System.out.println(score[2]);

    int y = score[0] + score[1];
    System.out.println("y = " + y);
    System.out.println("%d + %d = %d", score[0], score[1], y);
  }
}
