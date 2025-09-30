public class greatestCommonDivision {
  public static void main(String[] args) {
    int a = 3;
    int b = 6;
    int ans = 1;
    for (int i = 1; i <= Math.min(a, b); i++) {
      if (a % i == 0 && b % i == 0) {
        ans = i;
      }
    }
    System.out.println(ans);
  }
}
