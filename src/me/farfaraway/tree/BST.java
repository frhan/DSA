package me.farfaraway.tree;


public class BST {
    private BinaryNode root = null;

    public void insert(final int key){
        insert(root,key);
    }

    private BinaryNode insert(BinaryNode node, final int key){
        if (node == null){
            node = new BinaryNode(key);
            node.left = null;
            node.right = null;
        }

        if (key < node.key ){
            node.left = insert(node.left,key);
        }

        if (key > node.key)
            node.right = insert(node.right,key);

        return node;
    }

    /*
    * Search the tree with the key
    * @params key
    */
    public BinaryNode search(final int key){
        return search(root,key);
    }

    private BinaryNode search(BinaryNode node, final int key){
        BinaryNode currentNode = node;

        while (currentNode != null){
            if (currentNode.key == key)
                return currentNode;

            if (currentNode.key > key)
                currentNode = currentNode.left;

            if (currentNode.key < key)
                currentNode = currentNode.right;
        }
        return node;
    }

    public void delete(final int key){

    }

    public void show(){
        show(this.root);
    }

    public void show(BinaryNode root){

        if (root == null)
            return;
        show(root.left);
        System.out.print(root.key+" ");
        show(root.right);
    }
}
