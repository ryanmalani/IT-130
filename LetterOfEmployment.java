import java.util.Scanner; //this makes Scanner available

public class LetterOfEmployment
{
  public static void main(String [] args)
  {
     Scanner input = new Scanner(System.in);

     System.out.print("Please enter desired prefix (Mr, Ms, Mrs): ");
     String prefix = input.next();

     System.out.print("Please enter your first name: ");
     String firstname = input.next();

     System.out.print("Please enter your last name: ");
     String lastname = input.next();

     input.nextLine(); //clears buffer of Scanner
     System.out.print("Please enter your job title: ");
     String jobtitle = input.nextLine();

     System.out.print("Please enter the year you were hired: ");
     int yearhired = input.nextInt();

     System.out.print("Please enter your annual salary: ");
     double salary = input.nextDouble();

     System.out.print("Dear Sir or Madam:");
     System.out.print("\n\nThis letter is to confirm that " + firstname + " " + lastname + " is presently employed by ABC Company, in the ");
     System.out.print("position of " + jobtitle + " on a full time basis. " + firstname + " " + lastname + " commenced employment with ");
     //System.out.print("company on 01/01/" + yearhired + " and is presently paid $" + salary + " based salary per year.");
     System.out.printf("company on 01/01/%d and is presently paid $%.2f based salary per year.", yearhired, salary);
     System.out.print("\n\nABC company is located at 1234 K Street, Washington, DC, 20000.");
     System.out.print("\n\nIf you require any addtional information about ABC company and/or " + prefix + ". " + lastname + ", please do not ");
     System.out.print("hesitate to contact us.\n\nSincerely,\n\n\n");
  }
}
