
class statics {
  public static int count = 1;
  public static final int count1 = 20;
  int count2 = 30;

  static void print() {
    // System.out.println("hello from static methods:" + count2); //can not use non
    // static methods with static method
    System.out.println("hello from static method");
  }

  static final void number() {
    System.out.println("4 bags");
  }

  public static void main(String[] args) {
    count = 20;
    System.out.println(count);
    statics s = new statics();
    System.out.println(s.count1);
    print();
    // count1=10;
    number();

    int max = Math.max(10, 20);
    System.out.println(max);
    int min = Math.min(10, 20);
    System.out.println(min);
    int abs = Math.abs(20);
    System.out.println(abs);
    double flor = Math.floor(20.2);
    System.out.println(flor);
    double ceil = Math.ceil(20.2);
    System.out.println(ceil);
    int e = 144;
    System.out.println(Math.sqrt(e));
    System.out.println(Math.pow(2, 3));
    System.out.println(Math.round(202.2));
    System.out.println(Math.addExact(20, 20));
    System.out.println(Math.subtractExact(20, 10));
    System.out.println(Math.multiplyExact(2, 2));
    System.out.println(Math.divideExact(20, 2));
    System.out.println(Math.sqrt(144));
    System.out.println(Math.cbrt(8));
    System.out.println(Math.log(10));
    System.out.println(Math.log10(30));
    System.out.println(Math.sin(0));
    System.out.println(Math.random());
    System.out.println(Math.random());
    System.out.println(Math.PI);
    System.out.println(Math.E);
  }
}
