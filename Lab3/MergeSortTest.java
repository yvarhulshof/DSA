import java.util.*;

public class MergeSortTest{

  public static void main(String[] args) {

    MergeSort<Integer> m = new MergeSort<>();
    ArrayList<Integer> input = new ArrayList<Integer>();
    Collections.addAll(input,2,3,1,4,5,-2,7,3,2,2,8,1,1,9);
    System.out.println(m.mergeSort(input));
  }
}
