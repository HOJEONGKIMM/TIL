package 백준.트리;

import java.util.Scanner;

public class BST <Key extends Comparable<Key>, Value> {
    
    public class Node{
        private Key id;
        private Value name;
        private Node left, right;
        
        public Node(Key newId, Value newName){
            id = newId;
            name= newName;
            left = right = null;
        }
        
        public Key getKey() {
            return id;
        }
        
        public void setKey(Key id) {
            this.id = id;
        }
        
        public Value getValue() {
            return name;
        }
        
        public void setValue(Value name) {
            this.name = name;
        }
        
        public Node getLeft() {
            return left;
        }
        
        public void setLeft(Node left) {
            this.left = left;
        }
        
        public Node getRight() {
            return right;
        }
        
        public void setRight(Node right) {
            this.right = right;
        }
        
    }
    
    public Node root;
    public Node getRoot(){
        return root;
    }
    
    public BST(Key newId, Value newName){
        root = new Node(newId, newName);
    }
    
    public Value get(Key k){
        return get(root, k);
    } 

    public Value get(Node n, Key k){
        if(n == null) return null;
        int t = n.getKey().compareTo(k);

        if(t > 0) return get(n.getLeft(), k);
        else if (t < 0) return get(n.getRight(), k);
        else return n.getValue();

    }

    public void put(Key k, Value v){
        root = put(root, k, v);
    }
    
    public Node put(Node n, Key k, Value v){
        if(n == null) return new Node(k, v);
        int t = n.getKey().compareTo(k);
        if(t > 0) n.setLeft(put(n.getLeft(), k, v));
        else if(t < 0) n.setRight(put(n.getRight(), k, v));
        else n.setValue(v);
        return n;
    }


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
    }

}
