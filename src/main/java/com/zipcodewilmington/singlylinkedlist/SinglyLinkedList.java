package com.zipcodewilmington.singlylinkedlist;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList<T> {
    Node head;

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
    public void printList() {
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
        System.out.println("Element " +data+ " found at index: " + index);
        return index;
    }

// Remove an element from the index in LL
    public void remove(int index) {
        Node currNode = this.head, prev = null;
        int counter = 0;

        if (index == 0 && currNode != null) {
            this.head = currNode.next;

            System.out.println(index + " position element deleted!");
            printList();

        }
        while (currNode != null) {
            if (counter == index) {
                prev.next = currNode.next;

                System.out.println(index + " position element deleted!");
                printList();
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
            System.out.println(data + " Element " +data+ " not found!");
        }

        for (int i = 0; i < size; i++) {
            if (currNode.data.equals(data)) {
                result = true;
                System.out.println("Element " +data+ " found at index: " +i);
            }
            currNode = currNode.next;
        }
        System.out.println("Result of search: " + result);

        return result;
    }

// Return the element at index in the LL
    public T get(int index) {
        Node currNode = this.head, prev = null;
        int counter = 0;

        if (index == 0 && currNode != null) {

            System.out.println("Element at position " +index+ " is: " +currNode.data);
            printList();
            return (T) currNode.data;

        }
        while (currNode != null) {
            if (counter == index) {

                System.out.println("Element at position " +index+ " is: " +currNode.data);
                printList();
                return (T) currNode.data;

            } else {
                prev = currNode;
                currNode = currNode.next;
                counter++;
            }
        }

        if (currNode == null) {
            System.out.println("No element found at index " +index);
        }
        return null;
    }

//
    public void copy() {

    }

//
    public void sort() {

    }
}
