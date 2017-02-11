package me.farfaraway.tree;


class BinaryNode {
    BinaryNode left,right;
    int key;

    BinaryNode(){

    }

    BinaryNode(int key){
        this.key = key;
        this.left = null;
        this.right = null;
    }

    int getkey() {
        return key;
    }
}
