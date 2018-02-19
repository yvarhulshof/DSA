// Singly Linked List class
public class LinkedList<T>
{
    Node<T> head;  // head of list

    /* Inserts a new Node at front of the list. */
    public void push(T data)
    {
      Node<T> newNode = new Node<T>(data); //is "new Node(data)" correct?
      newNode.next = head;
      head = newNode;
      //newNode.setNext(head);
    }

	/* Delete all nodes with given data */
    public void delete(T data)
    {
      //iterate through all nodes by using Node<T>.next
      //check if its data = input data, if so set its data to null
      Node<T> currentNode = head;
      Node<T> tempNode;

      //check if first and possible next node have to be deleted, if so set head to first node that isn't to be deleted
      while(head != null && head.data.equals(data))
      {
        System.out.println("checkX");
        head = head.next;
      }

      currentNode = head;

      System.out.println("check1");

      //while(currentNode.next != null)
      while(currentNode != null && currentNode.next != null) //also have to check if currentNode != null, because when checking currentNode.next if currentNode is null, there is a nullpointerexception
      {
        System.out.println("check2");
        if(currentNode.next.next != null)
        {
          System.out.println("check3");
          if(currentNode.next.data.equals(data))
          {
            System.out.println("check5");
            tempNode = currentNode;
            while(tempNode.next != null && tempNode.next.data.equals(data))
            {
              System.out.println("check6");
              System.out.println("data: " + tempNode.data);
              tempNode = tempNode.next;
            }
            if(tempNode.next == null) currentNode.next = null;
            else currentNode.next = tempNode.next; //important: set the reference of the -next node- not the node itself, as that would not delete any nodes. Nodes can only be removed by changing the "next" field
          }
        }
        else
        {
          if(currentNode.next.data.equals(data))
          {
            System.out.println("check4");
            currentNode.next = null;
          }
        }
        //currentNode = currentNode.next;

      currentNode = currentNode.next;
      //does it go to final node?
    }
  }


	/* Get data at index i */
	public T get(int i) {
    Node<T> currentNode = head;
		for(int j = 0; j < i && currentNode != null; j++)
    {
      currentNode = currentNode.next;
      /*
      if(currentNode == null){
        System.out.println("index out of bounds");
        return null;
      }
      */
    }
    return currentNode.data;
	}

    /* Returns count of nodes in linked list */
    public int getCount()
    {
      Node<T> currentNode = head;

      if(currentNode == null) return 0;

      int counter = 1;
      while(currentNode.next != null)
      {
        counter++;
        currentNode = currentNode.next;
      }
      return counter;
    }
}
/*
while(currentNode.next.data.equals(data))
{
  //System.out.println("deleted value = " + currentNode.next.data);
  if(!(currentNode.next.data.equals(data)){
  currentNode.next = currentNode.next.next; //set reference of node before the to be deleted node to reference of node after the to be deleted node
}
*/
