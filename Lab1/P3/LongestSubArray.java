import java.util.*;

public class LongestSubArray{

  //arraylist to track longest current sub array, clear if a new bigger one is found and reassign it.

  public static void main(String[] args) {

    int[] array = {10,9,1,2,3,4,3,2};
  //  array = {10,9,1,2,3,4,2};
    System.out.println(find(array));
  }

  public static ArrayList<Integer> find(int[] array){

    ArrayList currentList = new ArrayList<Integer>();
    ArrayList longestList = new ArrayList<Integer>();

    for(int i = 1; i < array.length; i++){
      currentList.add(i);
      for(int j = i+1; j < array.length; j++){
        if(array[j] > array[j-1]) currentList.add(array[j]);
        else break;
      }
      if(currentList.size() > longestList.size()) longestList = new ArrayList<>(currentList);
      currentList.clear();
    }
    //int[] longestSub = new int[longestList.size()];
    //longestSub = longestList.toArray(longestSub);

    return longestList;
  }

}

/*
  public int[] find(int[] array){
    int currentStart;
    int currentEnd;
    ArrayList intervals = new ArrayList<Integer[]>();

    for(int i = 0; i < array.length; i++){
      for(int j = i; j < array.length; j++){
        currentStart = j;
        currentEnd = j;
        if(array[j] < array[j+1]) currentEnd = j + 1;
        else
        {
          intervals.add(new int[] {currentStart,currentEnd});
          break;
        }
      }
    }
    int maxIntervalSize = 0;
    int currentIntervalSize = 0;
    int[] maxInterval = new int[2];
    Integer[] henk = new Integer[2];

    for(int i = 0; i < intervals.size(); i++){
      henk = intervals.get(i);
      currentIntervalSize = intervals.get(i)[1] - intervals.get(i)[0];
      if(currentIntervalSize > maxIntervalSize)
      {
        maxIntervalSize = currentIntervalSize;
        maxInterval = intervals.get(i);
      }
    }

    return maxInterval;
  }
}
*/
/*
Given an array, A, of n integers, find the longest subarray of A such that all the numbers in that subarray are in sorted order.
Write this algorithm in Java and test it on at least three different arrays. What is the running time of your method?
(Note: given that this is a problem related to integers, you do not have to use generics for this exercise)
*/
