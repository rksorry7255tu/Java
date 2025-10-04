public class removeDuplicate {
  public static void main(String[] args) {
    int nums[] = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
    int i = 0;
    int j = 1;
    int count = 0;
    while (i < nums.length && j < nums.length) {
      if (nums[i] != nums[j]) {
        i++;
        nums[i] = nums[j];
      } else {
        count++;
      }
      j++;
    }
    for (int k = i + 1; k < nums.length; k++) {
      nums[k] = 0;
    }
    for (int x : nums) {
      System.out.println(x);
    }
    System.out.println(count);
  }
}
