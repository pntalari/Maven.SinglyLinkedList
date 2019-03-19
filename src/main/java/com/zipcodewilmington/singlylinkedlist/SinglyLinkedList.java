package com.zipcodewilmington.singlylinkedlist;

import java.util.Comparator;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList <T> implements Comparator {
    Node head;
    Node sorted = null;


    private class Node<T> {
        private T data;
        Node next;

        Node(T element) {
            this.data = element;
            this.next = null;
        }
    }


    // Add element to the LL-Linked List
    public void add(T data) {
        Node newNode = new Node(data);
        newNode.next = null;

        if (this.head == null) {
            this.head = newNode;
        } else {
            Node last = this.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;

        }
    }

    // Print the LL
    public void printList(Node head) {
        Node currNode = this.head;

        System.out.println("Linked List: ");

        while (currNode != null) {
            System.out.println(currNode.data + " ");

            currNode = currNode.next;
        }
        System.out.println();
    }

    // Return size of the LL
    public Integer size() {
        int index = 0;
        Node currentNode = this.head;

        if (currentNode == null) {
            System.out.println("The list is empty " + index);
            return index;
        }

        while (currentNode != null) {
            index++;
            currentNode = currentNode.next;
        }
        System.out.println("Size of Linked List: " + index);

        return index;
    }

    // Find the index of element from LL
    public Integer find(T data) {
        Node currNode = this.head;
        int index = -1;

        if (currNode == null) {
            System.out.println(data + " Element not found!");
            return index;
        }
        while (currNode != null) {
            index++;
            if (currNode.data == data) {
                break;
            }
            currNode = currNode.next;
        }
        System.out.println("Element " + data + " found at index: " + index);
        return index;
    }

    // Remove an element from the index in LL
    public void remove(int index) {
        Node currNode = this.head, prev = null;
        int counter = 0;

        if (index == 0 && currNode != null) {
            this.head = currNode.next;

            System.out.println(index + " position element deleted!");
            printList(this.head);

        }
        while (currNode != null) {
            if (counter == index) {
                prev.next = currNode.next;

                System.out.println(index + " position element deleted!");
                printList(currNode);
                break;
            } else {
                prev = currNode;
                currNode = currNode.next;
                counter++;
            }
        }
        if (currNode == null) {
            System.out.println(index + " position element not found!");
        }

    }

    // Check if element is present in the LL
    public Boolean contains(int data) {
        Node currNode = this.head;
        Boolean result = false;
        int size = this.size();

        if (currNode == null) {
            System.out.println(data + " Element " + data + " not found!");
        }

        for (int i = 0; i < size; i++) {
            if (currNode.data.equals(data)) {
                result = true;
                System.out.println("Element " + data + " found at index: " + i);
            }
            currNode = currNode.next;
        }
        System.out.println("Result of search: " + result);

        return result;
    }

    // Return the element at index in the LL
    public T get(int index) {
        Node currNode = this.head;
        int counter = 0;

        if (index == 0 && currNode != null) {

            System.out.println("Element at position " + index + " is: " + currNode.data);
            printList(currNode);
            return (T) currNode.data;

        }
        while (currNode != null) {
            if (counter == index) {

                System.out.println("Element at position " + index + " is: " + currNode.data);
                printList(currNode);
                return (T) currNode.data;

            } else {
                //  prev = currNode;
                currNode = currNode.next;
                counter++;
            }
        }

        if (currNode == null) {
            System.out.println("No element found at index " + index);
        }
        return null;
    }

    // Shallow copy of the LL to a new LL
    public Object copy() {
        if (this.head == null) {
            return null;
        }

        Node newNode = new Node(this.head.data);
        newNode.next = this.head.next;
        newNode.data = this.head.data;

        System.out.println("Original: ");
        printList(this.head);

        System.out.println("Cloned: ");
        printList(newNode);

        return newNode;
    }


    //Sort the LL using Insertion Sort Algorithm
    public void sort(Node head){

        Node current = head;
        while (current!=null){
            Node next = current.next;
            sortedInsert(current);
            current = next;
        }
        this.head = sorted;
    }

    private void sortedInsert(Node newNode) {

        if(sorted == null || compare(sorted.data,newNode.data) == 1
                || compare(sorted.data, newNode.data) == 0) {
            newNode.next = sorted;
            sorted = newNode;
        }
        else {
            Node current = sorted;
            while (current.next!=null &&
                    -1 == compare(current.next.data,newNode.data))
            {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }


//    public Node sort(Node head) {
//        if (head == null || head.next == null) {
//            return null;
//        }
//        Node middleNode = getMiddle(head);
//        Node nextOfMiddle = middleNode.next;
//
//        middleNode.next = null;
//
//        Node left = sort(head);
//        Node right = sort(nextOfMiddle);
//
//        Node sortedList = mergeSort(left,right);
//
//        return sortedList;
//
//    }
//
//    private Node mergeSort(Node a, Node b){
//        Node result = null;
//
//        if(a==null)
//            return b;
//        if(b==null)
//            return a;
//
//        int compareResult = compare((T)a.data, (T)b.data);
//
//        if(compareResult==-1 || compareResult==0)
//        {
//            result = a;
//            result.next = mergeSort(a.next,b);
//        }
//        else {
//            result = b;
//            result.next = mergeSort(a, b.next);
//        }
//
//        return result;
//    }
//
//
//    private Node getMiddle(Node head) {
//        if (head == null) {
//            return head;
//        }
//        Node firstPointer = this.head.next;
//        Node secondPointer = this.head;
//
//        while (firstPointer!=null){
//            firstPointer = firstPointer.next;
//            if (firstPointer!=null){
//                secondPointer = secondPointer.next;
//                firstPointer = firstPointer.next;
//            }
//        }
//        return secondPointer;
//
//    }
//
//    @Override
//    public int compare(T o1, T o2) {
//        return o1.toString().compareTo(o2.toString());
//
//    }


}
