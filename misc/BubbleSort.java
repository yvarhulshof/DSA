import java.util.*;


public class BubbleSort<E extends Comparable<E>> implements Comparator<E>{

  public ArrayList<E> bubbleSort(ArrayList<E> inputList){

    E temp = null;

    for(int i = 0; i < inputList.size(); i++){
      for(int j = 1; j < inputList.size() - i; j++){
        if(smallerOrEqual(inputList.get(j),inputList.get(j-1)))
        {
          temp = inputList.get(j-1);
          inputList.set(j-1, inputList.get(j));
          inputList.set(j, temp);
        }
      }
    }
    return inputList;
  }

  @Override
  public int compare(E a, E b){
    return a.compareTo(b);
    //y.compareTo(x) = 1 because y > x     list1.1 = 3  4.compareTo(3) = 1, so return false but we want: 3.compareTo(4) =  -1 so return true: 3 IS smaller than 4
    //x.compareTo(y) = -1 because x < y    list2.2 = 4
  }

  public boolean smallerOrEqual(E a, E b){
    if (compare(a,b) <= 0) return true;
    else return false;
  }
}
