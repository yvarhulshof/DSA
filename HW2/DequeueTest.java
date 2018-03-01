public class DequeueTest{

  public static void main(String[] args) {
    Deque<Integer> a = new Deque();
    a.addFirst(4);
    a.addLast(3);
    a.addFirst(2);
    a.addLast(1);
    a.removeLast();
    a.removeFirst();
    a.removeLast();
    //a.removeLast();

    //System.out.print("removed: " + a.removeLast());



    System.out.println("The values of the nodes are: ");


          System.out.println(a.list.get(0));
          //System.out.println(a.list.get(1));
          //System.out.println(a.list.get(2));
          //System.out.println(a.list.get(3));
          //System.out.println(a.list.get(4));
  }
}
