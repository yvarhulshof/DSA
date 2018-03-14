import java.util.*;

public class ComparatorTest{

  public static void main(String[] args) {
    ComparatorImp<String> a = new ComparatorImp();

    String string1 = "x";
    String string2 = "y";

    //System.out.println(a.compare(string2,string1));


    ArrayList<Integer> list1 = new ArrayList<>();
    ArrayList<Integer> list2 = new ArrayList<>();

    ArrayList<Integer> inputList = new ArrayList<Integer>();
    Collections.addAll(inputList,2,3,1,4);
    System.out.println(inputList);

    int halfListSize = (int) (0.5 * inputList.size());

    list1.addAll(inputList.subList(0, halfListSize));
    list2.addAll(inputList.subList(halfListSize, inputList.size()));

    System.out.println("halfSize: " + halfListSize);
    System.out.println("size: " + inputList.size());
    System.out.println(list1);
    System.out.println(list2);
  }
}
