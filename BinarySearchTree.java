class Node {
    @Override
    public String toString() {
        return "Node [value=" + value + ", left=" + left + ", right=" + right + "]";
    }

    int value;
    Node left, right;

    public Node(int value) {
        this.value = value;
        left = right = null;
    }
}

public class BinarySearchTree {

    Node root;

    public BinarySearchTree() {
        root = null;
    }

    // Inserir na árvore
    public Node insert(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            return root;
        }

        if (value < root.value) {
            root.left = insert(root.left, value);
        } else if (value > root.value) {
            root.right = insert(root.right, value);
        }

        return root;
    }

    // Buscar um valor
    public boolean search(Node root, int value) {
        if (root == null)
            return false;

        if (root.value == value)
            return true;

        if (value < root.value)
            return search(root.left, value);
        else
            return search(root.right, value);
    }

    // Percurso em ordem (in-order)
    public void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.value + " ");
            inorder(root.right);
        }
    }

    public static void main(String[] args) {

        BinarySearchTree bst = new BinarySearchTree();

        // Inserindo valores
        bst.root = bst.insert(bst.root, 50);
        bst.root = bst.insert(bst.root, 30);
        bst.root = bst.insert(bst.root, 70);
        bst.root = bst.insert(bst.root, 20);
        bst.root = bst.insert(bst.root, 40);
        bst.root = bst.insert(bst.root, 60);
        bst.root = bst.insert(bst.root, 80);

        System.out.print("Percurso in-order: ");
        bst.inorder(bst.root);

        // Testando busca
        System.out.println("\n\nBuscando 40: " +
            (bst.search(bst.root, 40) ? "Encontrado!" : "Não encontrado."));

        System.out.println("Buscando 100: " +
            (bst.search(bst.root, 100) ? "Encontrado!" : "Não encontrado."));
    }
}
