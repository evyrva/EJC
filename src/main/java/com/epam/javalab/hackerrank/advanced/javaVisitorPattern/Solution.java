package com.epam.javalab.hackerrank.advanced.javaVisitorPattern;

import java.util.ArrayList;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

import java.util.ArrayList;
import java.util.Scanner;

enum Color {
    RED, GREEN
}

abstract class Tree {

    private int value;
    private Color color;
    private int depth;

    public Tree(int value, Color color, int depth) {
        this.value = value;
        this.color = color;
        this.depth = depth;
    }

    public int getValue() {
        return value;
    }

    public Color getColor() {
        return color;
    }

    public int getDepth() {
        return depth;
    }

    public abstract void accept(TreeVis visitor);
}

class TreeNode extends Tree {

    private ArrayList<Tree> children = new ArrayList<>();

    public TreeNode(int value, Color color, int depth) {
        super(value, color, depth);
    }

    public void accept(TreeVis visitor) {
        visitor.visitNode(this);

        for (Tree child : children) {
            child.accept(visitor);
        }
    }

    public void addChild(Tree child) {
        children.add(child);
    }
}

class TreeLeaf extends Tree {

    public TreeLeaf(int value, Color color, int depth) {
        super(value, color, depth);
    }

    public void accept(TreeVis visitor) {
        visitor.visitLeaf(this);
    }
}

abstract class TreeVis {
    public abstract int getResult();

    public abstract void visitNode(TreeNode node);

    public abstract void visitLeaf(TreeLeaf leaf);

}

class SumInLeavesVisitor extends TreeVis {
    public int getResult() {
        //implement this
        return 0;
    }

    public void visitNode(TreeNode node) {
        //implement this
    }

    public void visitLeaf(TreeLeaf leaf) {
        //implement this
    }
}

class ProductOfRedNodesVisitor extends TreeVis {
    public int getResult() {
        //implement this
        return 1;
    }

    public void visitNode(TreeNode node) {
        //implement this
    }

    public void visitLeaf(TreeLeaf leaf) {
        //implement this
    }
}

class FancyVisitor extends TreeVis {
    public int getResult() {
        //implement this
        return 0;
    }

    public void visitNode(TreeNode node) {
        //implement this
    }

    public void visitLeaf(TreeLeaf leaf) {
        //implement this
    }
}

public class Solution {

    public static Tree solve() {
        //read the tree from STDIN and return its root as a return value of this function
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            int n = Integer.parseInt(reader.readLine());
            String[] values = reader.readLine().trim().split(" ");
//            Arrays.stream(values).forEach(i -> System.out.print(i + " "));
            System.out.println();
            String[] colors = reader.readLine().trim().split(" ");
//            List<Tree> treeList = new ArrayList<>(n);
            Tree[] trees = new Tree[n];
            int[] parentsTree = new int[n - 1];
            int[] childsTree = new int[n - 1];
            for (int i = 0; i < n - 1; i++) {
//                treeList.add(new TreeNode(Integer.parseInt(values[i]), Integer.parseInt(colors[i])==1 ? Color.GREEN: Color.RED, 0));
                String[] chain = reader.readLine().trim().split(" ");
                parentsTree[i] = Integer.parseInt(chain[0])-1;
                childsTree[i] = Integer.parseInt(chain[1])-1;
            }
            reader.close();
            trees[0] = new TreeNode(Integer.parseInt(values[0]), Integer.parseInt(colors[0]) == 1 ? Color.GREEN : Color.RED, 0);
            for (int i = 0; i < n - 1; i++) {
//                System.out.println("i = " + i);
//                System.out.println(trees[parentsTree[i]-1].getValue());
                int depth = trees[parentsTree[i]].getDepth()+1;
                boolean isParent = false;
                for (int j : parentsTree){
                    if (j == childsTree[i]){
                        isParent = true;
                        break;
                    }
                }
                if(isParent) {
                    trees[childsTree[i]] = new TreeNode(Integer.parseInt(values[childsTree[i]]),
                            Integer.parseInt(colors[childsTree[i]-1]) == 1 ? Color.GREEN : Color.RED, depth);
                }else{
                    trees[childsTree[i]] = new TreeLeaf(Integer.parseInt(values[childsTree[i]]),
                            Integer.parseInt(colors[childsTree[i]]) == 1 ? Color.GREEN : Color.RED, depth);
                }
                System.out.println(isParent);
                ((TreeNode) trees[parentsTree[i]]).addChild(trees[childsTree[i]]);
            }
            return trees[0];
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
/*
    public static void printTree(Tree tree){
        System.out.print(tree.getValue() + " ");
        if (tree instanceof TreeNode){
            for (Tree t: ((TreeNode) tree).children) {
                printTree(t);
            }
        }else System.out.println();
    }
*/
    public static void main(String[] args) {
        Tree root = solve();
//        printTree(root);

        SumInLeavesVisitor vis1 = new SumInLeavesVisitor();
        ProductOfRedNodesVisitor vis2 = new ProductOfRedNodesVisitor();
        FancyVisitor vis3 = new FancyVisitor();

        root.accept(vis1);
        root.accept(vis2);
        root.accept(vis3);

        int res1 = vis1.getResult();
        int res2 = vis2.getResult();
        int res3 = vis3.getResult();

        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);

    }
}