import java.util.Arrays;
import java.util.HashMap;

public class allDivisor {
  public static void main(String[] args) {
    int arr[] = { 1, 2, 2, 2, 4, 1 };
    int max = Integer.MIN_VALUE;
    int ans = 0;
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < arr.length; i++) {
      if (!map.containsKey(arr[i])) {
        map.put(arr[i], 1);
      } else {
        map.put(arr[i], map.get(arr[i]) + 1);
      }
      if (map.get(arr[i]) > max) {
        max = map.get(arr[i]);
        ans = arr[i];
      }
    }

    System.out.println(ans);
  }

}
