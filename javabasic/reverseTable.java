import java.util.Scanner;

public class reverseTable {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    int table = sc.nextInt();
    int n = 10;
    while (n >= 1) {
      System.out.println(table * n--);
    }
  }
}
