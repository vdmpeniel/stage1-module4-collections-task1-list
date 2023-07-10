package com.epam.mjc.collections.list;

import java.util.*;


public class ListSorter {
    public static void main(String[]args){
        ListSorter listSorter = new ListSorter();
        listSorter.sort(
            new ArrayList<>(List.of("7", "10", "6", "-7", "-2", "0", "-2", "-23"))
        );
    }

    public void sort(List<String> sourceList) {
        Collections.sort(sourceList, new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int computedOrder = computeValue(Integer.valueOf(a))
                .compareTo(computeValue(Integer.valueOf(b)));
        return (computedOrder == 0)? Integer.valueOf(a).compareTo(Integer.valueOf(b)) : computedOrder;
    }

    private Integer computeValue(int value){
        return (int) (5 * Math.pow(value, 2) + 3);
    }
}
