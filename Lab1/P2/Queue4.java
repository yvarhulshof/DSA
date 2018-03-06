public class Queue4<E> implements QueueInterface<E>{

  //running time: enqueueing: O(1)
  //              dequeueing: O(n), however if the dequeue stack is not empty it takes O(1) time.

  private StackImplementation<E> eStack;
  private StackImplementation<E> dStack;

  public Queue4(int givenSize){
    eStack = new StackImplementation(givenSize);
    dStack = new StackImplementation(givenSize);
  }

  public void enqueue(E e){
    eStack.push(e);
  }

  public E dequeue(){
    if(dStack.top() == null)
    {
      while(eStack.top() != null)
      {
        dStack.push(eStack.pop());
      }
    }
    return dStack.pop();
  }

  public void printElements(StackImplementation<E> stack){
    E[] elements = (E[]) stack.getElements();

    for(int i = 0; i < stack.size(); i++)
    {
      System.out.println(elements[i]);
    }
    //System.out.println("---");
  }

  public StackImplementation<E> getEStack(){
    return eStack;
  }

  public StackImplementation<E> getDStack(){
    return dStack;
  }
  /*
  Implement a queue using two stacks to store its elements, you may only use operations provided by the Stack ADT.
  Write your own stack implementation.
  What is the complexity of enqueue and dequeue operations?

  Tip: use one stack for enqueues and one for dequeues.
  */

}
