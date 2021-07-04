package com.codegym;

public class MyArrayList<E> {
    public static final int INITIAL_CAPACITY = 3;
    private E[] data;
    private int size = 0;

    public MyArrayList() {
        data = (E[]) new Object[INITIAL_CAPACITY];
    }

    public void add(int index, E e) {
        ensureCapacity();
        for (int i = size - 1; i >= index; i--) {
            data[i + 1] = data[i];
        }
        data[index] = e;
        size++;
    }

    private void ensureCapacity() {
        //int a = data.length;
        //int b = size;
        if (size >= data.length) {
            E[] newData = (E[]) new Object[size * 2];
            System.arraycopy(data, 0, newData, 0, size);
            data = newData;
        }
    }

    public E remove(int index) {
        checkIndex(index);
        E e = data[index];
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        data[size - 1] = null;
        size--;
        return e;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bound");
        }
    }
}
