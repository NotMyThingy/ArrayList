package com.notmythingy;

import java.util.Arrays;

public class List<T> {

    private T[] values;
    private int indexCount;

    public List() {
        values = (T[]) new Object[10];
        indexCount = 0;
    }

    public void add(T value) {
        // check if array is running out of space
        if (values.length == indexCount) {
            resize();
        }

        values[indexCount] = value;
        indexCount++;
    }

    public boolean contains(T value) {
        for (int i = 0; i < indexCount; i++) {
            if (values[i].equals(value)) {
                return true;
            }
        }
        return false;
    }

    public void remove(T value) {
        int indefOfValue = indexOfValue(value);
        if (indefOfValue < 0) {
            return;
        }

        moveValuesToLeftFrom(indefOfValue);
        indexCount--;
    }

    private void resize() {
        int newLength = values.length + values.length / 2;
        T[] newArray = (T[]) new Object[newLength];
        for (int i = 0; i < values.length; i++) {
            newArray[i] = values[i];
        }

        values = newArray;
    }

    private int indexOfValue(T value) {
        for (int i = 0; i < indexCount; i++) {
            if (values[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }

    private void moveValuesToLeftFrom(int indefOfValue) {
        for (int i = indefOfValue; i < indexCount - 1; i++) {
            values[indefOfValue] = values[indefOfValue + 1];
        }
        System.out.println("moved left");
        System.out.println(Arrays.toString(values));
        values[indexCount - 1] = null;
        System.out.println(Arrays.toString(values));
    }


}
