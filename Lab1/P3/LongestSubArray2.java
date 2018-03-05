import java.util.*;

public class LongestSubArray2{


  //running time: O(n), a single loop is used when going through the array, every element is only compared once

  public static void main(String[] args) {

    int[] array1 = {1,2,3,2,1};
    int[] array2 = {1,2,3,4,5,6,0,-1,-2,-3,-4,-5,-6,1,2,3,4,5,6,7};
    int[] array3 = {};

    System.out.println(findLongest(array1));
    System.out.println(findLongest(array2));
    System.out.println(findLongest(array3));

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

      if(array.length != 0) currentList.add(array[0]);

        for(int i = 1; i < array.length; i++)
        {
          if(array[i] >= array[i-1]) currentList.add(array[i]);
          else
          {
            if(currentList.size() > longestAscending.size()) longestAscending = new ArrayList<>(currentList);
            currentList.clear();
          } //if the next element isn't bigger than the previous one, we have found a new subarray and have to check if it's bigger than the current longest one, if so we reassign, then we clear current
        }
        //since if the last element isn't ascending we never check if this last list is the biggest subarray, we do this after the loop terminates
        if(currentList.size() > longestAscending.size()) longestAscending = new ArrayList<>(currentList);
        currentList.clear();

        return longestAscending;
      }

  public static ArrayList<Integer> findDescending(int[] array){

    ArrayList currentList = new ArrayList<Integer>();
    ArrayList longestDescending = new ArrayList<Integer>();

    if(array.length != 0) currentList.add(array[0]);

      for(int i = 1; i < array.length; i++)
      {
        if(array[i] <= array[i-1]) currentList.add(array[i]);
        else
        {
          if(currentList.size() > longestDescending.size()) longestDescending = new ArrayList<>(currentList);
          currentList.clear();
        } //if the next element isn't bigger than the previous one, we have found a new subarray and have to check if it's bigger than the current longest one, if so we reassign, then we clear current
      }
      //since if the last element isn't ascending we never check if this last list is the biggest subarray, we do this after the loop terminates
      if(currentList.size() > longestDescending.size()) longestDescending = new ArrayList<>(currentList);
      currentList.clear();

      return longestDescending;
    }
}
