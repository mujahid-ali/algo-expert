//https://www.geeksforgeeks.org/write-an-efficient-c-function-to-convert-a-tree-into-its-mirror-tree/

import java.util.*;
class Node{
  int data;
  Node left;
  Node right;

  public Node(int x){
    data = x;
    left = right = null;
  }

  class Binary_Tree{
    Node root;

    void mirror(){
      root = mirrot(root);
    }

    public static Node mirror(Node root){
      if(root == null)
        return;

      Node left = mirror(root.left);
      Node right = mirror(root.right);

      root.left = right;
      root.right = left;

      return root;
    }

    public static Node mirror_iterative(Node root){

      if(root == null)
        return;
      Queue<Node> q = new LinkedList<>();
      q.add(root);

      while(q.size > 0 ){
        Node curr = q.peek();
        q.remove();

        Node temp = curr.left;
        curr.left = curr.right;
        curr.right = temp;

        if(curr.left != null)
          q.add(curr.left);
        if(curr.right != null)
          q.add(current.right);  
      }

    }
  }
}
