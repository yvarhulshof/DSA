public class Deque<T> {

    DoubleEndedQueue list;

    public Deque() {
      list = new DoubleEndedQueue();
    }

    public boolean isEmpty() {
        return list.head == null;
    }

    public int size() {
        return list.getCount();
    }

    public void addFirst(T data) {
  		list.push(data);
    }

    public T removeFirst() {
        T data = (T)list.head.data;
        list.head = list.head.next;
        return data;
    }

    public void addLast(T data) {
      list.pushToTail(data);
    }

    public T removeLast() {
      T data = (T)list.getLast();
      list.deleteTail();
      return data;
    }
}
