import java.util.*;

public class pattern14 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = 65;
    int n = sc.nextInt();
    for (int i = 0; i < n; i++) {
      int q = A;
      for (int j = 0; j < n - i; j++) {
        System.out.print((char) q++);
      }
      System.out.println();
    }
  }
}
