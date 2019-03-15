package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

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
    }

    @Test
    public void size() {
    }

    @Test
    public void contains() {
    }

    @Test
    public void find() {
    }

    @Test
    public void get() {
    }

    @Test
    public void copy() {
    }

    @Test
    public void sort() {
    }
}