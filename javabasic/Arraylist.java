
import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    // Add
    list.add(1);
    list.add(6);
    list.add(3);
    System.out.println(list);

    // get elements
    int element = list.get(2);
    System.out.println(element);

    // add element in between
    list.add(0, 0);
    System.out.println(list);

    // set
    list.set(0, 5);
    System.out.println(list);

    // delete
    list.remove(0);
    System.out.println(list);

    // size
    System.out.println(list.size());

    // loop
    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
    }

    // sorting
    Collections.sort(list);
    System.out.println(list);

  }
}
