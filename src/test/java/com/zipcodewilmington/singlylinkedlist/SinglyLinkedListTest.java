package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Test;


public class SinglyLinkedListTest {

    @Test
    public void addTest() {
        SinglyLinkedList list = new SinglyLinkedList();
        Integer expectedLength = 5;
        Integer expectedVal1 = 1;
        Integer expectedVal2 = 2;
        Integer expectedVal3 = 3;
        Integer expectedVal4 = 4;
        Integer expectedVal5 = 5;

        list.add(expectedVal1);
        list.add(expectedVal2);
        list.add(expectedVal3);
        list.add(expectedVal4);
        list.add(expectedVal5);

        Assert.assertEquals(expectedLength, list.size());
    }

    @Test
    public void remove() {
        SinglyLinkedList list = new SinglyLinkedList();
        Integer expectedVal1 = 1;
        Integer expectedVal2 = 2;
        Integer expectedVal3 = 3;
        Integer expectedVal4 = 4;
        Integer expectedVal5 = 5;

        list.add(expectedVal1);
        list.add(expectedVal2);
        list.add(expectedVal3);
        list.add(expectedVal4);
        list.add(expectedVal5);

        list.remove(3);

        Assert.assertFalse(list.contains(expectedVal4));
    }

    @Test
    public void size() {
        SinglyLinkedList list = new SinglyLinkedList();
        Integer expectedVal1 = 1;
        Integer expectedVal2 = 2;
        Integer expectedVal3 = 3;
        Integer expectedVal4 = 4;
        Integer expectedVal5 = 5;

        list.add(expectedVal1);
        list.add(expectedVal2);
        list.add(expectedVal3);
        list.add(expectedVal4);
        list.add(expectedVal5);

        Assert.assertEquals(list.size(), expectedVal5);

    }

    @Test
    public void contains() {
        SinglyLinkedList list = new SinglyLinkedList();
        Integer expectedVal1 = 1;
        Integer expectedVal2 = 2;
        Integer expectedVal3 = 3;
        Integer expectedVal4 = 4;
        Integer expectedVal5 = 5;

        list.add(expectedVal1);
        list.add(expectedVal2);
        list.add(expectedVal3);
        list.add(expectedVal4);
        list.add(expectedVal5);

        Assert.assertEquals(expectedVal3,list.get(2));
    }

    @Test
    public void find() {
        SinglyLinkedList list = new SinglyLinkedList();
        Integer expectedVal1 = 1;
        Integer expectedVal2 = 2;
        Integer expectedVal3 = 3;
        Integer expectedVal4 = 4;
        Integer expectedVal5 = 5;

        list.add(expectedVal1);
        list.add(expectedVal2);
        list.add(expectedVal3);
        list.add(expectedVal4);
        list.add(expectedVal5);

        Integer expectedIndex = 2;

        Assert.assertEquals(list.find(3),expectedIndex );

    }

    @Test
    public void get() {
        SinglyLinkedList list = new SinglyLinkedList();
        Integer expectedVal1 = 1;
        Integer expectedVal2 = 2;
        Integer expectedVal3 = 3;
        Integer expectedVal4 = 4;
        Integer expectedVal5 = 5;

        list.add(expectedVal1);
        list.add(expectedVal2);
        list.add(expectedVal3);
        list.add(expectedVal4);
        list.add(expectedVal5);

        Assert.assertEquals(list.get(4),expectedVal5);
    }

    @Test
    public void copy() {
        SinglyLinkedList list = new SinglyLinkedList();
        Integer expectedVal1 = 1;
        Integer expectedVal2 = 2;
        Integer expectedVal3 = 3;
        Integer expectedVal4 = 4;
        Integer expectedVal5 = 5;

        list.add(expectedVal1);
        list.add(expectedVal2);
        list.add(expectedVal3);
        list.add(expectedVal4);
        list.add(expectedVal5);

     //  Assert.assertEquals(list.copy(),list.head);
    }

}