
import java.util.*;

public class main1 {
  public static void main(String[] args) {
    int A[] = { 1, 3, 6, 4, 1, 2 };
    int ans = 1;
    HashSet<Integer> set = new HashSet<>();
    for (int i = 0; i < A.length; i++) {
      set.add(A[i]);
    }
    for (int i = 0; i < A.length; i++) {
      if (!set.contains(i + 1)) {
        ans = i + 1;
        break;
      } else {
        ans = A.length + 1;
      }
    }
    System.out.println(ans);
  }
}
