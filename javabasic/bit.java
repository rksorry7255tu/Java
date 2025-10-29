public class bit {
  public static void main(String[] args) {
    int num = 7;
    String ans = Integer.toBinaryString(num);
    System.out.println(ans);
    int ans2 = Integer.parseInt(ans, 2);
    System.out.println(ans2);
  }
}
