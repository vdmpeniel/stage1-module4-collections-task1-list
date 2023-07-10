package com.epam.mjc.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        sourceList.stream().forEach(n -> {
            if(n % 2 != 0){
                linkedList.addFirst(n);
            } else {
                linkedList.addLast(n);
            }
        });
        return linkedList;
    }
}
