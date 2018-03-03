Queue3<E>{

  private StackImplementation<E> stack;
  private StackImplementation<E> tempStack;

  public Queue2(int givenSize){
    stack = new StackImplementation(givenSize);
    tempStack = new StackImplementation(givenSize);
  }

  public void enqueue(E e){
    for(int i = 0; i < stack.size(); i++)
    {
      tempStack.push(stack.pop());
    }
  }

  public E dequeue(){
    if(stack.size() == 0) return null;

    for(int i = 0; i < stack.size(); i++)
    {
      tempStack.push(stack.pop());
    }

    for(int i = 0; i < tempStack.size(); i++)
    {
      stack.push(tempStack.pop());
    }
    return tempStack.pop();
  }

  public void printElements(){
    E[] elements = (E[]) stack.getElements();

    for(int i = 0; i < stack.size(); i++)
    {
      System.out.println(elements[i]);
    }
  }

}


}
