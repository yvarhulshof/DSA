import java.util.*;

public class LongestSubArray{


  //running time: n^2

  public static void main(String[] args) {

    int[] array1 = {1,2,3,4,5,4,3,2,1,0,-1};
    int[] array2 = {1,2,3,2,1};

    System.out.println(findLongest(array1));
  }

  public static ArrayList<Integer> findLongest(int[] array){
    ArrayList<Integer> ascendingList = findAscending(array);
    ArrayList<Integer> descendingList = findDescending(array);

    if(ascendingList.size() > descendingList.size()) return ascendingList;
    else return descendingList;
  }

  public static ArrayList<Integer> findAscending(int[] array){

    ArrayList currentList = new ArrayList<Integer>();
    ArrayList longestAscending = new ArrayList<Integer>();

    for(int i = 0; i < array.length; i++){
      currentList.add(array[i]);
      for(int j = i+1; j < array.length; j++){
        if(array[j] >= array[j-1]) currentList.add(array[j]);
        else break;
      }
      if(currentList.size() > longestAscending.size()) longestAscending = new ArrayList<>(currentList);
      currentList.clear();
    }
    return longestAscending;
  }

  public static ArrayList<Integer> findDescending(int[] array){

    ArrayList currentList = new ArrayList<Integer>();
    ArrayList longestDescending = new ArrayList<Integer>();

    for(int i = 0; i < array.length; i++){
      currentList.add(array[i]);
      for(int j = i+1; j < array.length; j++){
        if(array[j] <= array[j-1]) currentList.add(array[j]);
        else break;
      }
      if(currentList.size() > longestDescending.size()) longestDescending = new ArrayList<>(currentList);
      currentList.clear();
    }
    return longestDescending;
  }
}

//int[] longestSub = new int[longestAscending.size()];
//longestSub = longestAscending.toArray(longestSub);

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
