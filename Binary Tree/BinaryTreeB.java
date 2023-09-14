import java.util.*;
import java.util.LinkedList;

public class BinaryTreeB {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;

        public Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1)
                return null;
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }

        // preorder Traversals.
        public void preorder(Node root) {
            // root->left->right
            if (root == null) {
                // System.out.print(" -1 ");//if we print this then full array will be printed.
                return;
            }

            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }

        // inorder Traversals.
        public void inorder(Node root) {
            // left->root->right
            if (root == null)
                return;
            inorder(root.left);
            System.out.println(root.data);
            inorder(root.right);
        }

        // post order
        public void postorder(Node root) {
            // left->right->root
            if (root == null)
                return;
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }

        // level order
        public void leverorder(Node root) {
            // work in Breadth First Search mode by using queue.
            if (root == null)
                return;
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while (!q.isEmpty()) {
                Node currNode = q.remove();
                if (currNode == null) {
                    System.out.println();// for new line.
                    if (q.isEmpty())
                        break;
                    else
                        q.add(null);
                } else {
                    System.out.print(currNode.data + " ");
                    if (currNode.left != null)
                        q.add(currNode.left);
                    if (currNode.right != null)
                        q.add(currNode.right);
                }
            }
        }

        // height of tree consider of nodes
        public int height(Node root) {
            if (root == null)
                return 0;
            int le = 1 + height(root.left);
            int re = 1 + height(root.right);

            return (int) Math.max(le, re);

        }

        // count nodes
        public int count(Node root) {
            if (root == null)
                return 0;
            int le = count(root.left);
            int re = count(root.right);
            return le + re + 1;
        }

        // Nodes data sum
        public int totalSum(Node root) {

            if (root == null)
                return 0;

            int le = totalSum(root.left);
            int re = totalSum(root.right);
            return le + re + root.data;
        }

        // calculate diameter 1'st approach it's time complexity is O(n^2)
        public int diameter2(Node root) {
            if (root == null)
                return 0;
            int leftD = diameter2(root.left);
            int leftH = height(root.left);
            int rightD = diameter2(root.right);
            int rightH = height(root.right);
            int selfD = leftH + rightH + 1;
            return Math.max(selfD, Math.max(leftD, rightD));
        }

        // 2'nd approach it's time complexity is O(n)
        static class Info {
            int diam;
            int ht;

            Info(int diam, int ht) {
                this.diam = diam;
                this.ht = ht;
            }
        }

        public Info diameter(Node root) {
            if (root == null)
                return new Info(0, 0);
            Info leftInfo = diameter(root.left);
            Info rightInfo = diameter(root.right);
            int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht + rightInfo.ht + 1);
            int ht = Math.max(leftInfo.ht, rightInfo.ht) + 1;
            return new Info(diam, ht);
        }

    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        // System.out.println(root.data);
        // tree.postorder(root);
        tree.leverorder(root);
        System.out.println();
        System.out.println("Height of tree is " + tree.height(root));
        System.out.println("Total nodes in the tree is " + tree.count(root));
        System.out.println("Total sum of nodes data is " + tree.totalSum(root));
        System.out.println("Diameter is " + tree.diameter(root).diam);
        System.out.println("height is " + tree.diameter(root).ht);
        
    }
}
