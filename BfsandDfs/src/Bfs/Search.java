package Bfs;

public class Search {

    public static void main(String[] args) {
        try {
            Node tree = sampletree();
            Bfs.traversal(tree);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Node sampletree() {
        Node root = new Node("A",
                new Node("B", new Node("D"), null),
                new Node("C",
                        new Node("G"), new Node("E", new Node("F"), new Node("H"))));

        return root;
    }

}
