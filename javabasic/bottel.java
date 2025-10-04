public class bottel {
  public static void main(String[] args) {
    int numBottles = 15;
    int numExchange = 4;
    int ans = numBottles;

    while (numBottles / numExchange != 0) {
      ans = ans + (numBottles / numExchange);
      numBottles = (numBottles / numExchange) + (numBottles % numExchange);
    }
    System.out.println(ans);
  }
}
