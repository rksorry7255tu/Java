public class armstrom {
  public static void main(String[] args) {
    int n = 153;
    int m = n;
    int ans = 0;
    while (m != 0) {
      int temp = m % 10;
      m = m / 10;
      ans = ans + (temp * temp * temp);
    }
    System.out.println(ans);
  }
}
