import java.util.*;

public class BubbleSortTest{

  public static void main(String[] args) {

    BubbleSort b = new BubbleSort<Integer>();

    ArrayList<Integer> list = new ArrayList<>();
    list.add(2);
    list.add(3);
    list.add(1);
    list.add(5);
    list.add(4);
    System.out.println(b.bubbleSort(list));
  }
}
