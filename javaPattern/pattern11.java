import java.util.*;

public class pattern11 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for (int i = 0; i < n; i++) {
      for (int j = 1; j < i + 2; j++) {
        System.out.print(j);
      }
      for (int j = 0; j < (n - i - 1) * 2; j++) {
        System.out.print(" ");
      }
      for (int j = i + 1; j > 0; j--) {
        System.out.print(j);
      }

      System.out.println();
    }
  }
}
