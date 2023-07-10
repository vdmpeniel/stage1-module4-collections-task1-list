package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class ArrayListCreator {
    public ArrayList<String> createArrayList(List<String> sourceList) {
        int length = sourceList.size() / 3 * 2;
        ArrayList<String> newList = new ArrayList<>();
        IntStream.iterate(0, n -> n + 1)
                .takeWhile(n -> n <= sourceList.size() - 1)
                .forEach(i -> {
                    if((i+1) % 3 == 0) {
                        newList.add(sourceList.get(i));
                        newList.add(sourceList.get(i));
                    }
                });
        return newList;
    }

    public static void main(String[] args) {
        ArrayListCreator arrayListCreator = new ArrayListCreator();
        System.out.println(arrayListCreator.createArrayList(List.of("I", "Love", "You")));
    }
}
