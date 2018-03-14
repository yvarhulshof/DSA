import java.util.Comparator;

public class ComparatorImp<E extends Comparable<E>> implements Comparator<E>{

  public static void main(String[] args) {

  }

  @Override
  public int compare(E a, E b){
    return b.compareTo(a);
    //y.compareTo(x) = 1 because y > x
    //x.compareTo(y) = -1 because x < y
  }

}
