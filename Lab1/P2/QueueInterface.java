public interface QueueInterface<E>{
  void enqueue(E e);
  E dequeue();
}
