import java.util.Scanner;

public class main{

  public static void main(String ... args){
    Scanner input = new Scanner(System.in);
    int inches = 0, feet = 0;
    while (true) {
      System.out.println("Write the inches: ");
      if (input.hasNextInt()) {
        inches = input.nextInt();
        input.nextLine();
        break;
      }
      else {
        input.nextLine();
        System.out.println("invalid input");
      }
    }

    if (inches < 12)
      feet = 0;
    else
      feet = inches/12;

    System.out.println(inches + " inches is " + feet + " feet");
  }
}
