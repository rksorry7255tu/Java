import java.util.Scanner;

public class Switch {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter button from 1 to 3");
    int choice = sc.nextInt();
    switch (choice) {
      case 1:
        System.out.println("Hello");
        break;
      case 2:
        System.out.println("Namaste");
        break;
      case 3:
        System.out.println("Bonjour");
        break;
      default:
        System.out.println("You Entered wrong Button!");
    }
  }
}
