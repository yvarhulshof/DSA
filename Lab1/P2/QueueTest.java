public class QueueTest{

  public static void main(String[] args) {

    Queue4 q = new Queue4(20);

    StackImplementation<Integer> eStack = q.getEStack();
    StackImplementation<Integer> dStack = q.getDStack();

    q.enqueue(1);
    System.out.println("enqueue stack: ");
    q.printElements(eStack);
    System.out.println("dequeue stack: ");
    q.printElements(dStack);

    q.enqueue(2);
    System.out.println("enqueue stack: ");
    q.printElements(eStack);
    System.out.println("dequeue stack: ");
    q.printElements(dStack);

    q.enqueue(3);
    System.out.println("enqueue stack: ");
    q.printElements(eStack);
    System.out.println("dequeue stack: ");
    q.printElements(dStack);

    q.dequeue();
    System.out.println("enqueue stack: ");
    q.printElements(eStack);
    System.out.println("dequeue stack: ");
    q.printElements(dStack);

    q.enqueue(4);
    System.out.println("enqueue stack: ");
    q.printElements(eStack);
    System.out.println("dequeue stack: ");
    q.printElements(dStack);

    q.enqueue(5);
    System.out.println("enqueue stack: ");
    q.printElements(eStack);
    System.out.println("dequeue stack: ");
    q.printElements(dStack);

    q.enqueue(6);
    System.out.println("enqueue stack: ");
    q.printElements(eStack);
    System.out.println("dequeue stack: ");
    q.printElements(dStack);

    q.dequeue();
    System.out.println("enqueue stack: ");
    q.printElements(eStack);
    System.out.println("dequeue stack: ");
    q.printElements(dStack);

    q.dequeue();
    System.out.println("equeue stack: ");
    q.printElements(eStack);
    System.out.println("dequeue stack: ");
    q.printElements(dStack);
  }
}
