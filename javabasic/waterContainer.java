public class waterContainer {
  public static void main(String[] args) {
    // int height[] = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
    int height[] = { 1, 1 };
    int i = 0;
    int j = height.length - 1;
    int ans = Integer.MIN_VALUE;
    while (i <= j) {
      int small = Math.min(height[i], height[j]);
      ans = Math.max(ans, small * (j - i));
      if (height[i] < height[j]) {
        i++;
      } else {
        j--;
      }
    }
    System.out.println(ans);

    // int max = Integer.MIN_VALUE;
    // for (int i = 0; i < height.length; i++) {
    // for (int j = 0; j < height.length; j++) {
    // int small = Math.min(height[i], height[j]);

    // max = Math.max(max, small * (j - i));
    // }
    // }
    // System.out.println(max);
  }
}
