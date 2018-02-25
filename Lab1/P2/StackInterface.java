public interface StackInterface<E> {
	E pop();
	void push(E e);
	boolean isEmpty();
	E top();
	int size();
}
