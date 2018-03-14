import java.util.*;

public class MergeSort<E extends Comparable<E>> implements Comparator<E>{

  public ArrayList<E> mergeSort(ArrayList<E> inputList){
    if(inputList.size() <= 1) return inputList; //base case, if we have a list of size 0 or 1 it's sorted by definition so we return it

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

    //when looking for the next smallest element we only have to compare the first elements in both lists, because since both lists are sorted a possible candidate for smallest element will be in the first position of either list
    while(list1.size()!= 0 && list2.size() != 0)
    {
      if(smallerOrEqual(list1.get(0), list2.get(0)))
      {
        output.add(list1.get(0));
        list1.remove(0);
      }
      else
      {
        output.add(list2.get(0));
        list2.remove(0);
      }
    }
    //the stopping condition is either list being empty, since we remove elements from 1 list at a time it can't be the case that both are empty so we have to add the remaining elements from the non empty list to the output
    if(list1.size() != 0) output.addAll(list1);
    else output.addAll(list2);

    return output;
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

  /*
  public ArrayList<E> mergeSort(ArrayList<E> inputList, ArrayList<E> list1, ArrayList<E> list2, Comparator<E> C){

    //ArrayList<E> list1 = new ArrayList<>();
    //ArrayList<E> list2 = new ArrayList<>();
    ArrayList<E> output = new ArrayList<>();
    int halfListSize = (int) 0.5 * inputList.size();

    if(inputList.size() <= 1) return inputList;

    if(list1.size() <= 1 && list2.size() <= 1) //base case
    {
      if(smallerOrEqual(list1.get(0), list2.get(0)))
      {
         output.add(list1.get(0));
         output.add(list2.get(0));
      }
      else
      {
        output.add(list2.get(0));
        output.add(list1.get(0));
      }
      return output;
    }
    else
    {
      list1.addAll(inputList.subList(0, halfListSize));
      list2.addAll(inputList.subList(halfListSize + 1, inputList.size()));
      return merge()
    }

    /*
    if(list1.size() <= 1) return list1;
    else if(list2.size() <= 1) return list2;
    else
    {
      list1.addAll(list.subList(0, halfListSize));

      list2.addAll(list.subList(halfListSize + 1, list.size()));
    }
    return merge(list1);
    //return MergeSort(list2);

    return inputList;
    }
    */





    //public ArrayList<E> splitList(ArrayList<E> list)
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
