package dsa.datastructures.tree;

import dsa.datastructures.list.Node;
import dsa.datastructures.queue.Queue;
import dsa.datastructures.stack.Stack;

import java.util.LinkedList;

public class ConvertTreeIntoSortedLinkList {
    private static final Node listHead = null;

    public static void main(String[] args) throws Exception {
        BinaryTree<Integer> tree = new BinarySearchTree<>();
        tree.insert(8);
        tree.insert(4);
        tree.insert(12);
        tree.insert(2);
        tree.insert(6);
        tree.insert(10);
        tree.insert(14);
        System.out.println(tree.printStringInOrder());
        LinkedList<Integer> list = new LinkedList<>();
        treeToList(tree.getRoot(), list);
        checkList(list);
    }

    private static void checkList(LinkedList<Integer> list) {
        System.out.print("head->");
        for (Integer i : list)
            System.out.print(i + "->");
        System.out.println("nil");

    }

    private static void treeToList(dsa.datastructures.tree.Node<Integer> node, LinkedList<Integer> list)
            throws Exception {
        dsa.datastructures.tree.Node<Integer> root = node;

        // below is a working recursive solution by inorder traversal
        /*
         * try { if (root == null) return; treeToList(root.getLeftNode(), list);
         * list.add(root.getValue()); treeToList(root.getRightNode(), list); } catch (Exception e) {
         * }
         */

        // below is working solution by iteration

        Stack<dsa.datastructures.tree.Node<Integer>> s = new Stack();
        Queue<Integer> resultQ = new Queue<>();

        dsa.datastructures.tree.Node leftNode = null;

        s.push(root);

        while (root != null || !s.isEmpty()) {

            if (root.getLeftNode() != null) {
                root = root.getLeftNode();
                s.push(root);
                continue;
            }
            if (!s.isEmpty()) {
                dsa.datastructures.tree.Node leaf = s.pop();
                if (null != leaf) {
                    if (leaf.getRightNode() != null) {
                        // listHead = new Node();
                        // listHead.setValue(root.getValue());
                        root = leaf.getRightNode();
                        s.push(root);
                        continue;
                    }
                }
            }

            if (!s.isEmpty()) {
                dsa.datastructures.tree.Node<Integer> tmpNd = s.pop();
                if (null != tmpNd) {
                    resultQ.enqueue(tmpNd.getValue());
                }
            }
        }

        System.out.println(resultQ);
    }
}
