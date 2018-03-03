public class Queue<E>{

  private StackImplementation<E> dqStack;
  private StackImplementation<E> eqStack;
  //private E[] elements = (E[]) new Object[SIZE];

  public Queue(int givenSize){
    dqStack = new StackImplementation(givenSize);
    eqStack = new StackImplementation(givenSize);
  }

  public E dequeue(){
    //StackImplementation<E> temp = dqStack;
    reverseElementsOrder(eqStack);
    eqStack.pop();
    reverseElementsOrder(eqStack);
    return dqStack.pop();
  }

  /*
  public void enqueue(E e){
    for(int i = 0; i < eqStack.size(); i++)
    {
      eqStack.getElements()[i] = eqStack.getElements()[eqStack.size() - i];
    }
    eqStack.push(e);
    for(int i = 0; i < eqStack.size(); i++)
    {
      eqStack.getElements()[i] = eqStack.getElements()[eqStack.size() - i];
    }
  }
  */

  public void enqueue(E e){
    reverseElementsOrder(eqStack);
    eqStack.push(e);
    reverseElementsOrder(eqStack);

    dqStack.push(e);
  }

  public StackImplementation reverseElementsOrder(StackImplementation stack){
    E[] elements = (E[]) stack.getElements();

    E[] temp = (E[]) new Object[elements.length];

    for(int i = 0; i < elements.length; i++)
    {
      temp[i] = (E) elements[elements.length - 1 - i];
    }

    for(int i = 0; i < elements.length; i++)
    {
      //temp[i] = (E) elements[elements.length - 1 - i];
      //elements[i] = elements[elements.length - 1 - i];
      elements[i] = temp[i];
    }
    stack.setElements(elements);
    return stack;
  }

  public void printElements(){
    System.out.println("dequeueStack");
    E[] elements = (E[]) dqStack.getElements();

    for(int i = 0; i < elements.length; i++)
    {
      System.out.println(elements[i]);
    }
    System.out.println();
    System.out.println("enqueueStack");
    System.out.println("-------------");

    elements = (E[]) reverseElementsOrder(eqStack).getElements();
    //elements =  reverseElementsOrder(eqStack);

    for(int i = 0; i < elements.length; i++)
    {
      System.out.println(elements[i]);
    }
  }

}

/*
Implement a queue using two stacks to store its elements, you may only use operations provided by the Stack ADT.
Write your own stack implementation.
What is the complexity of enqueue and dequeue operations?

Tip: use one stack for enqueues and one for dequeues.
*/

//linear complexity
