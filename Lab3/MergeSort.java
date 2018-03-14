import java.util.*;

public class MergeSort{

  public ArrayList<Integer> MergeSort(ArrayList<Integer> list){

    ArrayList<Integer> list1 = new ArrayList<>();
    ArrayList<Integer> list2 = new ArrayList<>();
    int halfListSize = (int) 0.5 * list.size();

    if(list.size() <= 1) return list;
    else{

      list1.addAll(list.subList(0, halfListSize));

      list2.addAll(list.subList(halfListSize + 1, list.size()));
    }
    return MergeSort(list1);
    //return MergeSort(list2);

    }
}

/*
In order to test the exercises below, write a test case that runs the algorithm on new sets of random data at least 1,000 times.

Use an implementation of the Java comparator interface in order to compare generic elements with each other.

Implement a generic Mergesort for sorting a List.
What is the average runtime for a list of lengths 1,000, 10,000, 100,000, 150,000, 250,000 in milliseconds?
Run individual tests to compare these results.
Do these retults match the n log n function?
Now implement a second version of Mergesort that uses bubblesort to sort sublists of less than 20 elements.
Run the same experiments performed in part a. What do you notice, and why do you think this is the case?
*/
