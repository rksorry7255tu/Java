public class rotateArray {
  public static void main(String[] args) {
    int nums[] = { 1, 2, 3, 4, 5, 6, 7 };
    int k = 3;
    k = k % nums.length;
    int ans[] = new int[nums.length];
    int j = 0;
    for (int i = nums.length - k; i < nums.length; i++) {
      ans[j] = nums[i];
      j++;
    }
    for (int i = 0; i < nums.length - k; i++) {
      ans[j] = nums[i];
      j++;
    }
    int i = 0;
    for (int x : ans) {
      nums[i] = x;
      System.out.println(nums[i]);
      i++;
    }

  }
}
