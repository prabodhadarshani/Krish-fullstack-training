package Dfs;

public class Search {

    public static void main(String[] args) {
        try {
            Node tree = sampletree();
            Dfs.traversal(tree);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Node sampletree() {
        Node root = new Node("A",
                new Node("B",
                        new Node("C"), new Node("D")),
                new Node("E", new Node("F"), new Node("G",
                        new Node("H"), null)));

        return root;
    }

}
