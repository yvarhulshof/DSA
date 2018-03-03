import java.util.ArrayList;
import java.util.List;

public class Node<T> {

	private T data = null;

	private List<Node<T>> children = new ArrayList<>();

	private Node<T> parent = null;

	public Node(T data) {
		this.data = data;
	}

	public Node<T> getRoot() {
    Node<T> currentNode;
    currentNode = this;
		while(currentNode.parent != null)
    {
      currentNode = this.parent;
    }
    return currentNode;
	}

	public Node<T> addChild(Node<T> child) {
		this.children.add(child);
		child.setParent(this); //set parent when adding a child

		Node<T> temp = child.parent;

		/*
		while(temp.parent != null) //needed if "children" refers to the children of a node on all levels below it, not just the 1st level
		{
			temp.parent.addChild(child);
		}
		*/
    return child;
	}

	public void addChildren(List<Node<T>> children) {
		this.children.addAll(children);
		for(Node<T> child : children)
		{
			child.setParent(this);
		}
	}

	public List<Node<T>> getChildren() {
		return children;
	}

	public T getData() {
		//if(data == null) return (T)" ";
		return this.data;
	}

	public void setData(T data) {
		this.data = data;
	}

	private void setParent(Node<T> parent) {
		this.parent = parent;
	}

	public Node<T> getParent() {
		return this.parent;
	}

}
