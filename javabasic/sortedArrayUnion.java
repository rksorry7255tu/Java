import java.util.*;

public class sortedArrayUnion {
  public static void main(String[] args) {
    int arr[] = { -5, 8, -14, 2, 4, 12 };
    int k = -5;

    HashMap<Integer, Integer> map = new HashMap<>();
    int count = 0;
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum = sum + arr[i];
      map.put(sum, i);
      if (map.containsKey(sum - k)) {
        count = Math.max(count, i - map.get(sum - k) + 1);
      }
    }
    System.out.println(map.get(k) + 1);
  }
}
