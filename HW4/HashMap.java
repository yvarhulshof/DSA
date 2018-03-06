public class HashMap {

    private final static int TABLE_SIZE = 128;

    //HashEntry<LinkedList<E>>[] table;
    LinkedList<HashEntry<E>>[] table;

    public HashMap() {
        //table = new HashEntry[TABLE_SIZE];
        table = new LinkedList<HashEntry<E>>[TABLE_SIZE];
        for (int i = 0; i < TABLE_SIZE; i++)
            table[i] = null;
    }

    public E get(int key) {
        int hash = (key % TABLE_SIZE);

        if (table[hash] == null)
            return null;
        else
        {
          Node<E> currentNode = table[hash].head;
          while(currentNode.next != null)
          {
            if(currentNode.data.getKey() == key) return currentNode.data.getValue();
            currentNode = currentNode.next;
          }
        }
            return table[hash].getValue();
    }

    public void put(int key, int value) {
        int hash = (key % TABLE_SIZE);
        table[hash] = new HashEntry(key, value);
    }
}
