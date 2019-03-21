package com.zipcodewilmington.singlylinkedlist;

import java.sql.Connection;

import static com.zipcodewilmington.singlylinkedlist.SinglyLinkedList.*;

/**
 * Created by leon on 1/10/18.
 */
public class MainApplication {

    public static void main(String... args) {
        SinglyLinkedList list = new SinglyLinkedList();

        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);



        list.printList(list.head);

        // list.remove(4);

        // printList(list);

        // list.size();

        // list.contains(5);

        // list.get(8);

        // list.copy();

        list.sort(list.head);

        list.printList(list.head);

        // list.find(10);


    }

}

