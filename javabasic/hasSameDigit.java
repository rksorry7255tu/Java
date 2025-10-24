public class hasSameDigit {
  public static void main(String[] args) {
    String s = "89305689704";
    StringBuilder sb = new StringBuilder("");
    while (s.length() != 2) {
      for (int i = 1; i < s.length(); i++) {
        int a = s.charAt(i - 1) - '0';
        // System.out.println(a);
        int b = s.charAt(i) - '0';
        // System.out.println(b);
        int c = (a + b) % 10;
        sb.append(String.valueOf(c));
      }
      s = "";
      for (int i = 0; i < sb.length(); i++) {
        s = s + sb.charAt(i);
      }
      sb = new StringBuilder("");
    }
    if (s.charAt(0) == s.charAt(1)) {
      System.out.println("true");
    } else {
      System.out.println("false");
    }

    // String s = "34789";
    // String res = "";
    // int i = 0;

    // while (s.length() > 2 && i < s.length() - 1) {
    // res = res + (char) ((((s.charAt(i) - '0') + (s.charAt(i + 1) - '0')) % 10) +
    // '0');
    // i++;
    // if (i == s.length() - 1) {
    // s = res;
    // i = 0;
    // res = "";
    // }
    // }
    // System.out.println(s);
  }
}
