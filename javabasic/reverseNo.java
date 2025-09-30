public class reverseNo {
  public static void main(String[] args) {
    int n = 12;
    int no = n;
    int reverse = 0;
    while (no != 0) {
      int digit = no % 10;
      no = no / 10;
      reverse = (reverse * 10) + digit;
    }
    System.out.println(reverse);
  }
}
