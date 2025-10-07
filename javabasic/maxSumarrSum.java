public class maxSumarrSum {
  public static void main(String[] args) {
    int nums[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
    int ans = Integer.MIN_VALUE;
    for (int i = 0; i < nums.length; i++) {
      int sum = 0;
      for (int j = i; j < nums.length; j++) {
        sum = sum + nums[j];
        System.out.print(sum + " ");
        ans = Math.max(ans, sum);
      }
      System.out.println();
    }
    System.out.println(ans);
  }
}
