import java.util.*;

public class MergeSortTest{

  public static void main(String[] args) {

    runTimeTest(100);
  }

  public static void runTimeTest(int listSize){

    MergeSort<Integer> m = new MergeSort<>();
    MergeBubbleSort<Integer> m2 = new MergeBubbleSort<>();

    double startTime = 0;
    double endTime = 0;
    double duration = 0;
    double totalTime = 0;
    double averageRunTime = 0;
    final int nrOfRuns = 1;

    for(int i = 0; i < nrOfRuns; i++)
    {
      ArrayList<Integer> input = createRandomList(listSize);

      System.out.println(input); //prints the list values before sorting

      startTime = System.nanoTime();
      ArrayList<Integer> output = m2.mergeSort(input);
      endTime = System.nanoTime();
      duration = ((endTime - startTime) / 1000000);
      System.out.println("duration in ms: " + duration);

      System.out.println(output); //prints the list values after sorting

      totalTime += duration;
    }
    averageRunTime = totalTime / nrOfRuns;
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
