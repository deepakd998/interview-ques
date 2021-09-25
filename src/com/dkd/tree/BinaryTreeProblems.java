package com.dkd.tree;

public class BinaryTreeProblems {
    public int sumOfNode(Node root){
        if(root ==null){
            return 0;
        }
        return root.data+sumOfNode(root.left)+sumOfNode(root.right);
    }
    public int numberOfNodes(Node root){
        if(root == null)return 0;
        return 1+numberOfNodes(root.left)+numberOfNodes(root.right);
    }

    public int numberOfLeafNodes(Node root){
        if(root == null)return 0;
        if(root.left == null && root.right==null) return 1;
        return numberOfLeafNodes(root.left)+numberOfLeafNodes(root.right);
    }
    public int height(Node root){
        if(root ==null ) return -1;
        return Math.max(height(root.left),height(root.right))+1;
    }
    private void levelOrder(Node root,int lvl){
        if(root ==null ) return ;
        if(lvl ==1){
            System.out.print(root.data+" ");
            return;
        }
        levelOrder(root.left,lvl-1);
        levelOrder(root.right,lvl-1);
    }

   public void printLevelOrder(Node root){
        if(root == null) return;
        int height=height(root);
        for(int i=0;i<=height;i++){
            levelOrder(root,i+1);
            System.out.println();
        }
   }
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        BinaryTreeProblems tree = new BinaryTreeProblems();
        Node root = new Node(2);
        root.left = new Node(5);
        root.right = new Node(7);
        root.left.left = new Node(3);
        root.left.right = new Node(4);
        root.right.left = new Node(6);
        root.right.left.right = new Node(1);
        root.left.left.left = new Node(8);
        root.left.left.left.left= new Node(9);
        tree.printLevelOrder(root);
    }
}
/*
       2
    5    7
  3  4  6
8         1
 */