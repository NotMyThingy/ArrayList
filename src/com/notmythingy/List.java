package com.notmythingy;

import java.util.Arrays;

public class List<T> {

    private T[] values;
    private int index;

    public List() {
        values = (T[]) new Object[10];
        index = 0;
    }

    public void add(T value) {
        // check if array is running out of space
        if (values.length == index) {
            resize();
        }

        values[index] = value;
        index++;
    }

    private void resize() {
        int newLength = values.length + values.length / 2;
        T[] newArray = Arrays.copyOf(values, newLength);

        values = newArray;
    }
}
