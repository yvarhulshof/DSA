import java.util.*;

public class MergeSort<E extends Comparable<E>> implements Comparator<E>{

  public ArrayList<E> mergeSort(ArrayList<E> inputList){
    if(inputList.size() <= 1) return inputList; 

    ArrayList<E> list1 = new ArrayList<>();
    ArrayList<E> list2 = new ArrayList<>();

    int halfListSize = (int) (0.5 * inputList.size());

    list1.addAll(inputList.subList(0, halfListSize));
    list2.addAll(inputList.subList(halfListSize, inputList.size()));

    list1 = mergeSort(list1);
    list2 = mergeSort(list2);

    return merge(list1, list2);
  }

  public ArrayList<E> merge(ArrayList<E> list1, ArrayList<E> list2){

    ArrayList<E> output = new ArrayList<>();
    int counterList1 = 0;
    int counterList2 = 0;

    while(counterList1 < list1.size() && counterList2 < list2.size())
    {
      if(smallerOrEqual(list1.get(counterList1), list2.get(counterList2)))
      {
        output.add(list1.get(counterList1));
        counterList1++;
      }
      else
      {
        output.add(list2.get(counterList2));
        counterList2++;
      }
    }
    if(counterList1 < list1.size()) output.addAll(list1.subList(counterList1, list1.size()));
    else output.addAll(list2.subList(counterList2, list2.size()));

    return output;
  }

  @Override
  public int compare(E a, E b){
    return a.compareTo(b);
  }

  public boolean smallerOrEqual(E a, E b){
    if (compare(a,b) <= 0) return true;
    else return false;
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
