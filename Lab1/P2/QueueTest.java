public class QueueTest{

  public static void main(String[] args) {


    //Queue q = new Queue(10);
    Queue2 q = new Queue2(20);

    q.enqueue(1);
    q.enqueue(2);
    q.enqueue(3);
    q.enqueue(4);
    q.enqueue(5);
    q.enqueue(6);

    //q.dequeue();
    //q.dequeue();
    //q.dequeue();

    q.printElements();
  }
}
