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
        T[] newArray = (T[]) new Object[newLength];
        for (int i = 0; i < values.length; i++) {
            newArray[i] = values[i];
        }

        values = newArray;
    }

    public boolean contains(T value) {
        for (int i = 0; i < index; i++) {
            if (values[i].equals(value)) {
                return true;
            }
        }
        return false;
    }
}
