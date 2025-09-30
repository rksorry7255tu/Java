import java.util.*;

public class countDigits {
  public static void main(String[] args) {
    System.out.println("Enter no:");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int count = 0;
    if (n == 0)
      System.out.println(1);
    while (n != 0) {
      n = n / 10;
      
      count++;
    }
    // System.out.println(count);
  }
}
