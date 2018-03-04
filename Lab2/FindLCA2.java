public class FindLCA2{

  public static void main(String[] args) {
    Test1();
    Test2();
    Test3();
  }

  public static <T> T findLCA(Node<T> root, Node<T> x, Node<T> y){

    if(x.getParent() == y.getParent() && x.getParent() != null) return x.getParent().getData(); //base case 1: the current x and y share the same parent, this is their LCA
    if(x == root || y == root) return root.getData();                  //base case 2: if the current x or y is the root, their LCA is the root because the root has no parent

    for(Node<T> child : root.getChildren())
    {
      if(child.getData() == x.getData())
      {
        if(x.getParent() == y) return y.getData();
        else
        {
          while(root.getParent() != null)
          {
            root = root.getParent();
          }
          return findLCA(root, x.getParent(), y);
        }
      }
      if(child.getData() == y.getData())
      {
        if(y.getParent() == x) return x.getData();
        else
        {
          findLCA(root, x, y.getParent());
          while(root.getParent() != null)
          {
            root = root.getParent();
          }
          return findLCA(root, x.getParent(), y);
        }
      }
    }
    for(Node<T> child : root.getChildren())
    {
      /*if(child.getChildren() != null)*/ return findLCA(child, x, y);
    }
    System.out.println("check");
    //Node<T> temp = root;
    //root = null;
    //return findLCA(temp.getParent(), x, y);
    return root.getData();
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
    System.out.println(findLCA(root, node111, node12));
  }

  private static void Test2() {
    Node<String> root = new Node<>("root");

    Node<String> node1 = root.addChild(new Node<String>("node 1"));

    Node<String> node11 = node1.addChild(new Node<String>("node 11"));

    Node<String> node111 = node11.addChild(new Node<String>("node 111"));
    Node<String> node112 = node11.addChild(new Node<String>("node 112"));

    Node<String> node1111 = node111.addChild(new Node<String>("node 1111"));

    Node<String> node12 = node1.addChild(new Node<String>("node 12"));

    Node<String> node2 = root.addChild(new Node<String>("node 2"));

    Node<String> node21 = node2.addChild(new Node<String>("node 21"));
    Node<String> node22 = node2.addChild(new Node<String>("node 22"));

    Node<String> node3 = root.addChild(new Node<String>("node 3"));

    Node<String> node31 = node3.addChild(new Node<String>("node 31"));
    Node<String> node32 = node3.addChild(new Node<String>("node 32"));

    Node<String> node311 = node31.addChild(new Node<String>("node 311"));


    System.out.println(findLCA(root, node311, node32));
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


    System.out.println(findLCA(root, node2, node311));
  }
}

/*
for(Node<T> child : currentChildren)
{
  if(child.getData() == x.getData())
  {
    if(x.getParent() == y) return y;
    else findLCA(root, x.getParent(), y);
  }
  else if(child.getData() == y.getData())
  {
    if(y.getParent() == x) return x;
    else findLCA(root, x, y.getParent());
  }
  findLCA(child, x, y);
}
*/
