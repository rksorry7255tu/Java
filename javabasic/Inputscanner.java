import java.util.Scanner;

public class Inputscanner {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter A value:");
    int A = sc.nextInt();
    System.out.println("Enter B value:");
    int B = sc.nextInt();
    int sum = A + B;
    System.out.println(sum);

  }
}
