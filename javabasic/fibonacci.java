public class fibonacci {
  public static void main(String[] args) {
    int result = fib(4);
    System.out.println(result);
  }

  public static int fib(int n) {
    int result = 0;
    if (n == 1 || n == 2) {
      result = 1;

    } else {
      result = fib(n - 1) + fib(n - 2);
    }
    return result;
  }
}
