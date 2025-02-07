import java.util.ArrayList;
import java.util.List;

public class switch1 {
  public static void main(String[] args) {
    ArrayList<Double> list = new ArrayList<>();
    list.add(2.0);
    list.add(2.0);
    double result = switchCase(2, list);
    System.out.println(result);
  }

  public static double switchCase(int choice, List<Double> arr) {
    Double result = 1.11;
    switch (choice) {
      case 1:
        if (arr.size() == 1) {
          result = 3.14 * arr.get(0) * arr.get(0);
        }
        break;

      case 2:
        if (arr.size() == 2) {
          result = arr.get(0) * arr.get(1);
        }
        break;
    }
    return result;
  }
}
