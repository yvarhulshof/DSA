public class FindLCA2{

  public static void main(String[] args) {
    Test1();
    Test2();
    Test3();
  }

  //we start searching through the tree starting from the true root, and check all 3 base cases
  //if these cases aren't fullfilled, we check for each child of the current root if they are either x or y
  //if this is the case, we now try to find the LCA of that ones parent and the other variable
  //if this is not the case, we instead try to find the LCA of a subtree, letting the root be an unvisited child of the current root
  //if this child no longer has any children, we mark it as visited

  //running time: O(n), we visit every node atmost as often as it has direct children + 1 time, so we have a sum of linear terms which is linear.

  public static <T> T findLCA(Node<T> root, Node<T> x, Node<T> y){

    if(x.getParent() == y.getParent() && x.getParent() != null) return x.getParent().getData(); //base case 1: if x and y share the same parent, this is their LCA
    if(x.getParent() == y) return y.getData();                                                  //base case 2: if y is x's parent, y is their LCA
    if(y.getParent() == x) return x.getData();                                                  //base case 3: if x is y's parent, x is their LCA

    for(Node<T> child : root.getChildren())
    {
      if(child.getData() == x.getData())
      {
          return findLCA(root, x.getParent(), y);
      }
      if(child.getData() == y.getData())
      {
          return findLCA(root, x, y.getParent());
      }
    }

    for(int i = 0; i < root.getChildren().size(); i++) //why doesn't this work with an enhanced for loop?
    {
      Node<T> child = root.getChildren().get(i);
      if(child.getVisited() == false) return findLCA(child, x, y);
    }

    root.setVisited();
    return findLCA(root.getParent(), x, y);
  }

  private static void Test1() {
    Node<String> root = new Node<>("root");

    Node<String> node1 = root.addChild(new Node<String>("node 1"));

    Node<String> node11 = node1.addChild(new Node<String>("node 11"));

    Node<String> node111 = node11.addChild(new Node<String>("node 111"));
    Node<String> node112 = node11.addChild(new Node<String>("node 112"));

    Node<String> node1111 = node111.addChild(new Node<String>("node 1111"));
    Node<String> node1112 = node111.addChild(new Node<String>("node 1112"));
    Node<String> node1113 = node111.addChild(new Node<String>("node 1113"));

    Node<String> node12 = node1.addChild(new Node<String>("node 12"));

    Node<String> node2 = root.addChild(new Node<String>("node 2"));

    Node<String> node21 = node2.addChild(new Node<String>("node 21"));
    Node<String> node22 = node2.addChild(new Node<String>("node 22"));

    Node<String> node3 = root.addChild(new Node<String>("node 3"));

    //Node<String> node31 = node3.addChild(new Node<String>("node 31"));
    //Node<String> node32 = node3.addChild(new Node<String>("node 32"));

    //Node<String> node311 = node31.addChild(new Node<String>("node 311"));
    System.out.println("LCA: " + findLCA(root, node111, node12));
  }

  private static void Test2() {
    Node<String> root = new Node<>("root");

    Node<String> node1 = root.addChild(new Node<String>("node 1"));

    Node<String> node11 = node1.addChild(new Node<String>("node 11"));

    Node<String> node111 = node11.addChild(new Node<String>("node 111"));
    Node<String> node112 = node11.addChild(new Node<String>("node 112"));

    Node<String> node1111 = node111.addChild(new Node<String>("node 1111"));
    Node<String> node1112 = node111.addChild(new Node<String>("node 1112"));
    Node<String> node1113 = node111.addChild(new Node<String>("node 1113"));

    Node<String> node12 = node1.addChild(new Node<String>("node 12"));

    //Node<String> node2 = root.addChild(new Node<String>("node 2"));

    //Node<String> node21 = node2.addChild(new Node<String>("node 21"));
    //Node<String> node22 = node2.addChild(new Node<String>("node 22"));

    Node<String> node3 = root.addChild(new Node<String>("node 3"));

    Node<String> node31 = node3.addChild(new Node<String>("node 31"));
    Node<String> node32 = node3.addChild(new Node<String>("node 32"));

    Node<String> node311 = node31.addChild(new Node<String>("node 311"));


    System.out.println("LCA: " + findLCA(root, node111, node1113));
  }

  private static void Test3() {
    Node<String> root = new Node<>("root");

    Node<String> node1 = root.addChild(new Node<String>("node 1"));

    Node<String> node11 = node1.addChild(new Node<String>("node 11"));

    Node<String> node111 = node11.addChild(new Node<String>("node 111"));
    Node<String> node112 = node11.addChild(new Node<String>("node 112"));

    Node<String> node1111 = node111.addChild(new Node<String>("node 1111"));
    Node<String> node1112 = node111.addChild(new Node<String>("node 1112"));
    Node<String> node1113 = node111.addChild(new Node<String>("node 1113"));

    Node<String> node12 = node1.addChild(new Node<String>("node 12"));

    Node<String> node2 = root.addChild(new Node<String>("node 2"));

    Node<String> node21 = node2.addChild(new Node<String>("node 21"));
    Node<String> node22 = node2.addChild(new Node<String>("node 22"));

    Node<String> node3 = root.addChild(new Node<String>("node 3"));

    Node<String> node31 = node3.addChild(new Node<String>("node 31"));
    Node<String> node32 = node3.addChild(new Node<String>("node 32"));

    Node<String> node311 = node31.addChild(new Node<String>("node 311"));

    System.out.println("LCA: " + findLCA(root, node2, node311));
  }

  private static void Test4() {
    Node<String> root = new Node<>("root");

    Node<String> node1 = root.addChild(new Node<String>("node 1"));

    Node<String> node11 = node1.addChild(new Node<String>("node 11"));

    Node<String> node111 = node11.addChild(new Node<String>("node 111"));
    Node<String> node112 = node11.addChild(new Node<String>("node 112"));

    Node<String> node1111 = node111.addChild(new Node<String>("node 1111"));
    Node<String> node1112 = node111.addChild(new Node<String>("node 1112"));
    Node<String> node1113 = node111.addChild(new Node<String>("node 1113"));

    Node<String> node12 = node1.addChild(new Node<String>("node 12"));

    Node<String> node2 = root.addChild(new Node<String>("node 2"));

    Node<String> node21 = node2.addChild(new Node<String>("node 21"));
    Node<String> node22 = node2.addChild(new Node<String>("node 22"));

    Node<String> node3 = root.addChild(new Node<String>("node 3"));

    Node<String> node31 = node3.addChild(new Node<String>("node 31"));
    Node<String> node32 = node3.addChild(new Node<String>("node 32"));

    Node<String> node311 = node31.addChild(new Node<String>("node 311"));

    System.out.println("LCA: " + findLCA(root, root, node1113));
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

/*
public static <T> T findLCA(Node<T> root, Node<T> x, Node<T> y){

  //System.out.println();
  //System.out.println(root.getData() + " has " + root.getChildren().size() + " children");
  //System.out.println();

  if(x.getParent() == y.getParent() && x.getParent() != null) return x.getParent().getData(); //base case 1: the current x and y share the same parent, this is their LCA
  if(x.getParent() == y) return y.getData();
  if(y.getParent() == x) return x.getData(); //if(x == root || y == root) return root.getData();                  //base case 2: if the current x or y is the root, their LCA is the root because the root has no parent

  for(Node<T> child : root.getChildren())
  {
    if(child.getData() == x.getData())
    {
      //if(x.getParent() == y){
      //  System.out.println("check1");
      //  return y.getData();
    //  }
    //  else
      //{
        //System.out.println("check2");
        //while(root.getParent() != null)
        //{
        //  root = root.getParent();
        //}
        child.setVisited();
        return findLCA(root, x.getParent(), y);
      //}
    }
    if(child.getData() == y.getData())
    {
      if(y.getParent() == x){
        System.out.println("check3");
        return x.getData();
      }
      else
      {
        //System.out.println("check4");
        //while(root.getParent() != null)
        //{
        //  root = root.getParent();
        //}
        child.setVisited();
        return findLCA(root, x, y.getParent());
      }
    }
  }
  for(int i = 0; i < root.getChildren().size(); i++)
  {
    //System.out.println("check5b");
    if(root.getChildren().get(i).getVisited() == false && root.getChildren().get(i) != null) return findLCA(root.getChildren().get(i), x, y);
  }

  /* ------------------------------------------------
  for(Node<T> child : root.getChildren())
  {
    System.out.println("check5");
    if(child.getChildren() != null)
    if(child.getVisited() == false && child != null) findLCA(child, x, y);
  } --------------------------------------------------
  */

  //System.out.println("check6");
  //root.setVisited();
  /*if(root.getParent() != null)*/ //return findLCA(root.getParent(), x, y);
  //else return findLCA(root,x,y);

  //return root.getData();
//}
