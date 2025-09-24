import java.util.*;

public class pattern15 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int A = 65;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < i + 1; j++) {
        System.out.print((char) A);
      }
      A++;
      System.out.println();
    }
  }
}
