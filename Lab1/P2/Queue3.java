public class Queue3<E>{

  private StackImplementation<E> stack;
  private StackImplementation<E> tempStack;

  public Queue3(int givenSize){
    stack = new StackImplementation(givenSize);
    tempStack = new StackImplementation(givenSize);
  }

  public void enqueue(E e){
    while(stack.top() != null){
    //for(int i = 0; i < stack.size(); i++)
    //{
      tempStack.push(stack.pop());
    }

    tempStack.push(e);

    while(tempStack.top() != null){
    //for(int i = 0; i < tempStack.size(); i++)
    //{
      stack.push(tempStack.pop());
    }
  }

  public E dequeue(){
    if(stack.size() == 0) return null;

    return stack.pop();
  }

  public void printElements(){
    E[] elements = (E[]) stack.getElements();

    for(int i = 0; i < stack.size(); i++)
    {
      System.out.println(elements[i]);
    }
  }

  //enqueue run time: n + 1 + n = 2n+1 -> O(n)
  //dequeue run time: 1 -> O(1)
}
