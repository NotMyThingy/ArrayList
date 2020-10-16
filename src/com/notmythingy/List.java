package com.notmythingy;

public class List<T> {

    private T[] values;
    private int valuesCount;

    public List() {
        values = (T[]) new Object[10];
        valuesCount = 0;
    }

    /**
     * @param value - Adds given value into an array.
     */
    public void add(T value) {
        // check if array is running out of space
        if (values.length == valuesCount) {
            resize();
        }

        values[valuesCount] = value;
        valuesCount++;
    }

    /**
     * @param value - Search param
     * @return - Return true if an array contain value.
     */
    public boolean contains(T value) {
        return indexOf(value) >= 0;
    }

    /**
     * @param value - Removes first instance of given value.
     */
    public void remove(T value) {
        int removed = indexOf(value);
        if (removed < 0) {
            return;
        }

        moveValuesToLeftFrom(removed);
        valuesCount--;
    }

    /**
     * @param value - Search param
     * @return - Returns index of given value. Returns -1 if not found.
     */
    public int indexOf(T value) {
        for (int i = 0; i < valuesCount; i++) {
            if (values[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }

    /**
     *
     * @param index - Search param
     * @return - Returns value in index.
     */
    public T valueOf(int index) {
        if (index < 0 || index > valuesCount) {
            throw new IndexOutOfBoundsException("Index should be between [0 - " + valuesCount + "]");
        }

        return values[index];
    }

    private void resize() {
        int newLength = values.length + values.length / 2;
        T[] newArray = (T[]) new Object[newLength];
        for (int i = 0; i < values.length; i++) {
            newArray[i] = values[i];
        }

        values = newArray;
    }

    private void moveValuesToLeftFrom(int indefOfValue) {
        for (int i = indefOfValue; i < valuesCount - 1; i++) {
            values[indefOfValue] = values[indefOfValue + 1];
        }
        values[valuesCount - 1] = null;
    }


}
