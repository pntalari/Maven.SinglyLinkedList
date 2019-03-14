package com.zipcodewilmington.singlylinkedlist;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }

    }
    public static SinglyLinkedList add(SinglyLinkedList list, int data){
        Node newNode = new Node(data);
        newNode.next = null;

        if(list.head == null){
            list.head = newNode;
        }
        else {
            Node last = list.head;
            while (last.next!=null){
                last = last.next;
            }
            last.next = newNode;
        }
        return list;

    }

    public static void printList(SinglyLinkedList list){
        Node currNode = list.head;

        System.out.println("Linked List: ");

        while (currNode!=null){
            System.out.println(currNode.data + " ");

           currNode = currNode.next;
        }
        System.out.println();
    }

    public static SinglyLinkedList remove(SinglyLinkedList list, int index){
        Node currNode = list.head, prev = null;
        int counter = 0;

        if(index==0 && currNode != null) {
            list.head = currNode.next;

            System.out.println(index + " position element deleted!");

            return list;
        }
        while (currNode!=null){
            if(counter == index){
                prev.next = currNode.next;

                System.out.println(index + " position element deleted!");
            }
            else {
                prev = currNode;
                currNode = currNode.next;
                counter++;
            }
        }
        if(currNode == null){
            System.out.println(index + " position element not found!");
        }
        return list;

    }


    public void contains(){

    }
    public void find(){

    }
    public void size(){

    }
    public void get(){

    }
    public void copy(){

    }
    public void sort(){

    }
}
