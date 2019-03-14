package com.zipcodewilmington.singlylinkedlist;

import static com.zipcodewilmington.singlylinkedlist.SinglyLinkedList.printList;
import static com.zipcodewilmington.singlylinkedlist.SinglyLinkedList.remove;

/**
 * Created by leon on 1/10/18.
 */
public class MainApplication {

    public static void main(String ... args){
        SinglyLinkedList list = new SinglyLinkedList();

        list = SinglyLinkedList.add(list, 1);
        list = SinglyLinkedList.add(list, 2);
        list = SinglyLinkedList.add(list, 3);
        list = SinglyLinkedList.add(list, 4);
        list = SinglyLinkedList.add(list, 5);
        list = SinglyLinkedList.add(list, 6);
        list = SinglyLinkedList.add(list, 7);
        list = SinglyLinkedList.add(list, 8);
        list = SinglyLinkedList.add(list, 9);
        list = SinglyLinkedList.add(list, 10);

        printList(list);

        remove(list,0);


        printList(list);

    }

}

