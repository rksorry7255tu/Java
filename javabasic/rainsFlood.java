import java.util.ArrayList;

public class rainsFlood {
  public static void main(String[] args) {
    int rains[] = { 1, 2, 0, 1, 2 };
    ArrayList<Integer> list = new ArrayList<>();
    int index = 0;
    for (int i = 0; i < rains.length; i++) {
      if (!list.contains(rains[i]) && rains[i] != 0) {
        list.add(rains[i]);
      }
      if (rains[i] != 0) {
        rains[i] = -1;
      }
      if (rains[i] == 0 && index <= list.size() - 1) {
        rains[i] = list.get(index);

        index++;
      }

    }
    for (int i = 0; i < index; i++) {
      list.remove(index);
    }
    if(!list.isEmpty()){
      System.out.println();
    }
    System.out.println(index);

    System.out.println(list);

  }
}
