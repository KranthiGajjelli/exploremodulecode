import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.print("Please enter miles: ");
      double mile = scan.nextDouble();
      double kilometer = mile * 1.6;
      System.out.println("Kilometers: " + kilometer);
      scan.close();

   }
}