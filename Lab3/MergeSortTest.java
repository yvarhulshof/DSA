import java.util.*;

public class MergeSortTest{

  public static void main(String[] args) {

    runTimeTest(100000);
  }

  //n1 = 1000 -> 0.85ms
  //n2 = 10000 -> 19ms
  //n3 = 10000 -> 1170ms

  //1000log2(1000) = 9965
  //10000log2(10000) = 132877
  //100000log2(100000) = 1660964

  //n2/n1 = 9965 / 0.85 = 11 723
  //n3/n2 =

  //19 / 0.85 = 22,35
  //132877 / 9965 = 13,35

  //61,5
  //1660964 / 132877 = 12,5



  public static void runTimeTest(int listSize){

    MergeSort<Integer> m = new MergeSort<>();
    double startTime = 0;
    double endTime = 0;
    double duration = 0;
    double totalTime = 0;
    double averageRunTime = 0;

    for(int i = 0; i < 1000; i++)
    {
      ArrayList<Integer> input = createRandomList(listSize);
      startTime = System.nanoTime();
      m.mergeSort(input);
      endTime = System.nanoTime();
      duration = ((endTime - startTime) / 1000000);
      System.out.println("duration in ms: " + duration);
      totalTime += duration;
    }
    averageRunTime = totalTime / 1000;
    System.out.println("average run time in ms: " + averageRunTime);
  }

  public static ArrayList<Integer> createRandomList(int size)
  {
    ArrayList<Integer> list = new ArrayList<Integer>();
    int random = 0;
    for(int i = 0; i < size; i++)
    {
      random = (int) (Math.random() * 100);
      list.add(random);
    }
    return list;
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

MergeSort<Integer> m = new MergeSort<>();
ArrayList<Integer> input = createRandomList(1000);
double startTime = System.nanoTime();
m.mergeSort(input);
double endTime = System.nanoTime();
System.out.println("duration in ms: " + ((endTime - startTime) / 1000000) );
*/
