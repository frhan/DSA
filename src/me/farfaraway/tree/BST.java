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
        delete(root,key);
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

    private BinaryNode predecessor(BinaryNode node){
        BinaryNode currentNode = node;
        while (currentNode != null){
            currentNode = currentNode.right;
        }
        return currentNode;
    }

    private void delete(BinaryNode root,int key){
        BinaryNode node = search(root,key);

        if (node.left == null && node.right == null){
            node = null;
            return;
        }

        if (node.left == null){
            BinaryNode temp = node;
            node = node.right;
            temp = null;
            return;
        }

        if (node.right == null){
            BinaryNode temp = node;
            node = node.left;
            temp = null;
            return;
        }

        BinaryNode predecessor = predecessor(node);
        node.key = predecessor.key;
        delete(node.right,key);
    }
}
