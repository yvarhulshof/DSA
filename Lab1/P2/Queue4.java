public class Queue4<E>{

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
}
