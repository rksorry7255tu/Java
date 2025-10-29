public class countLaser {
  public static void main(String[] args) {
    // String bank[] = { "011001", "000000", "010100", "001000" };
    String bank[] = { "000", "111", "000" };
    int ans = 0;
    int count = 0;
    int prev = 0;
    for (int i = 0; i < bank.length; i++) {
      count = 0;
      for (int j = 0; j < bank[i].length(); j++) {
        if (bank[i].charAt(j) == '1') {
          count++;
        }
      }
      if (count != 0) {
        ans = ans + (prev * count);
        prev = count;
      }
    }
    System.out.println(ans);
  }
}
