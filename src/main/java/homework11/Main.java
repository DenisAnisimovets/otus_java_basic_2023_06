package homework11;

import java.util.List;

import static homework11.Tree.rangeFilling;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = rangeFilling(1, 6);
        SearchTree searchTree = new Tree(list);
        System.out.println(searchTree);
        System.out.println(searchTree.find(3));
        System.out.println(searchTree.find(18));
    }
}
