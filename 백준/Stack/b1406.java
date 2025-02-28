package 백준.Stack;

import java.util.Scanner;

public class b1406 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        int time = sc.nextInt();
        for(int i = 0; i<time ; i++){

        }


        sc.close();
    }

    static class Node{
        char data;
        Node prev;
        Node next;

        public Node(char data){
            this.data = data;
        }
    }

    static class DoubleLinkedList{
        private Node head;
        private Node tail;
        private Node cursor;

        public DoubleLinkedList(){
            head = new Node('\0');
            tail = new Node('\0');
            head.next = tail;
            tail.prev = head;
            cursor = head;
        }


        public void moveLeft(){
            if(cursor != head){
                cursor = cursor.prev;
            }
        }

        public void moveRight(){
            if(cursor.next != tail){
                cursor = cursor.next;
            }
        }

        public void delete(){   // 커서 왼쪽에 있는 문자를 삭제함
            if(cursor == head) return;

            Node deleteN = cursor;

            cursor = cursor.prev;
            cursor.next = deleteN.next;

            if(deleteN.next != null){
                deleteN.next.prev = cursor;
            }
        }

        public void add(char data){
            
        }

        public void print(){
            Node curr = head.next;
            while (curr != tail) {
                System.out.print(curr.data);
                curr = curr.next;
            }
        }

    }
}