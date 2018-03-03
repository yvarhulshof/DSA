public class StackImplementation<E> implements StackInterface<E>{

  private int SIZE;
  private E[] elements;

  public StackImplementation(int givenSize){
    SIZE = givenSize;
    elements = (E[]) new Object[SIZE];
  }

  public E pop(){
    for(int i = 0; i < elements.length; i++)
    {
      if(elements[i] == null)
      {
      E temp = elements[i-1];
      elements[i-1] = null;
      return temp;
      }
    }
    E temp = elements[SIZE];
    elements[SIZE] = null;
    return elements[SIZE];
  }
	public void push(E e){
    //for(E element : elements){
    for(int i = 0; i < elements.length; i++)
    {
      if(elements[i] == null)
      {
        elements[i] = e;
        //System.out.println("check");
        break;
      }
    }
  }

	public boolean isEmpty(){
    if(elements.length == 0) return true;
    else return false;
  }

	public E top(){
    if(elements.length == 0) return null;

    for(int i = 0; i < elements.length; i++)
    {
      if(elements[i] == null)
      {
        if(i == 0) return null;
        else return elements[i-1];
      }
    }
    return elements[SIZE];
  }

	public int size(){
    for(int i = 0; i < elements.length; i++)
    {
      if(elements[i] == null) return i;
    }
    return elements.length;
  }

  public E[] getElements(){
    return elements;
  }

  public void setElements(E[] elements){
    this.elements = elements;
  }

  public int getTotalSize(){
    return SIZE;
  }

}
