import java.util.*;

public class FindLCA{

  public static void main(String[] args) {
    //Node<String> root = createTree();
    Test1();
    Test2();
    Test3();
  }



  public static <T> T find(Node<T> x, Node<T> y){
    Node<T> currentNode = x;
    List<Node<T>> currentChildren;
    while(currentNode != null)
    {
      currentChildren = currentNode.getChildren();
      for(Node<T> child : currentChildren)
      {
        if(y.getData() == child.getData()) //comparator neccesary?
        {
          return currentNode.getData();
        }
      }
      currentNode = currentNode.getParent();
      //if(currentNode.getData() != null)
      //{
        if(y.getData() == currentNode.getData()) return currentNode.getData();
      //}
    }
    return x.getRoot().getData();
  }

  private static void Test1() {
    Node<String> root = new Node<>("root");

    Node<String> node1 = root.addChild(new Node<String>("node 1"));

    Node<String> node11 = node1.addChild(new Node<String>("node 11"));
    Node<String> node111 = node11.addChild(new Node<String>("node 111"));
    Node<String> node112 = node11.addChild(new Node<String>("node 112"));

    Node<String> node12 = node1.addChild(new Node<String>("node 12"));

    Node<String> node2 = root.addChild(new Node<String>("node 2"));

    Node<String> node21 = node2.addChild(new Node<String>("node 21"));
    Node<String> node211 = node2.addChild(new Node<String>("node 22"));
    System.out.println(find(node111, node2));
  }

  private static void Test2() {
    Node<String> root = new Node<>("root");

    Node<String> node1 = root.addChild(new Node<String>("node 1"));

    Node<String> node11 = node1.addChild(new Node<String>("node 11"));
    Node<String> node111 = node11.addChild(new Node<String>("node 111"));
    Node<String> node112 = node11.addChild(new Node<String>("node 112"));

    Node<String> node12 = node1.addChild(new Node<String>("node 12"));

    Node<String> node2 = root.addChild(new Node<String>("node 2"));

    Node<String> node21 = node2.addChild(new Node<String>("node 21"));
    Node<String> node211 = node2.addChild(new Node<String>("node 22"));

    Node<String> node3 = root.addChild(new Node<String>("node 3"));

    Node<String> node31 = node3.addChild(new Node<String>("node 31"));

    Node<String> node311 = node31.addChild(new Node<String>("node 311"));


    System.out.println(find(node311, node2));
  }

  private static void Test3() {
    Node<String> root = new Node<>("root");

    Node<String> node1 = root.addChild(new Node<String>("node 1"));

    Node<String> node11 = node1.addChild(new Node<String>("node 11"));
    Node<String> node111 = node11.addChild(new Node<String>("node 111"));
    Node<String> node112 = node11.addChild(new Node<String>("node 112"));

    Node<String> node12 = node1.addChild(new Node<String>("node 12"));

    Node<String> node2 = root.addChild(new Node<String>("node 2"));

    Node<String> node21 = node2.addChild(new Node<String>("node 21"));
    Node<String> node211 = node21.addChild(new Node<String>("node 211"));

    Node<String> node3 = root.addChild(new Node<String>("node 3"));

    Node<String> node31 = node3.addChild(new Node<String>("node 31"));

    Node<String> node311 = node31.addChild(new Node<String>("node 311"));


    System.out.println(find(node2, node311));
  }
}



//we start at node x, go up to its parent and call getChildren on this parent, if y is in this list then the 1st parent
//is the LCA, otherwise we go to the next parent and check again

/*
node 1
  node 11
      node 111
      node 112
  node 12
node 2
  node 21
  node 22
*/





/*
Suppose you work for a company, iPuritan.com, that has strict rules for when two employees, x and y, may date one another,
requiring approval from their lowest level common supervisor. The employees at iPuritan.com are organized in a tree, T,
such that each node in T corresponds to an employee and each employee, z, is considered a supervisor for all of the employees
in the subtree of T rooted at z (including z itself). The lowest-level common supervisor for x and y is the employee lowest
in the organizational chart, T, that is a supervisor for both x and y.

Thus, to find a lowest-level common supervisor for the two employees, x and y, you need to find the lowest common ancestor
(LCA) between the two nodes for x and y, which is the lowest node in T that has both x and y as descendants
(where we allow a node to be a descendant of itself).

Given the nodes corresponding to the two employees x and y, write an efficient algorithm for finding the supervisor who
may approve whether x and y may date each other, that is, the LCA of x and y in T.
Write 3 test cases for this algorithm showing different trees and configurations. What is the running time of your method?
*/
