public class problem {
  public static void main(String[] args) {
    int num1 = 2;
    int num2 = 3;
    int count = 0;
    while (true) {
      if (num1 <= 0 || num2 <= 0) {
        break;
      }
      if (num1 >= num2) {
        num1 = num1 - num2;
        count++;

      } else {
        num2 = num2 - num1;
        count++;

      }
    }
    System.out.println(count);
  }
}
