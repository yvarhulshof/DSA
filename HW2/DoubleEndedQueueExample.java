public class DoubleEndedQueueExample {
	/* Test program to test above functions. Ideally
       this function should be in a separate user class.
       It is kept here to keep code compact */
    public static void main(String[] args)
    {
        /* Start with the empty list */
        DoubleEndedQueue<Integer> llist = new DoubleEndedQueue<>();
        llist.pushToTail(1);
        llist.pushToTail(2);
        llist.push(3);
        llist.push(4);
        llist.push(5);

		    llist.delete(4);

        System.out.println("Count of nodes is " +
							llist.getCount());

              //int index = 5;

		    System.out.println("The values of the nodes are: ");


              System.out.println(llist.get(0));
              System.out.println(llist.get(1));
              System.out.println(llist.get(2));
              System.out.println(llist.get(3));
              //System.out.println(llist.get(4));
              //System.out.println(llist.get(5));
              //System.out.println(llist.get(6));


    }
}
