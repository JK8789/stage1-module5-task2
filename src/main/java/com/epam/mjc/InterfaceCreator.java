package com.epam.mjc;

import java.util.*;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {
        return list -> {
            List<Integer> newList = new ArrayList<>();
            for (Integer item : list) {
                newList.add(item / divider);
            }
            return newList;
        };
    }
}
