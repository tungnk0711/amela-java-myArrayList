package com.codegym;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(0,'a');
        myArrayList.add(0,'b');
        myArrayList.add(0,'c');
        myArrayList.add(0,'d');

        myArrayList.remove(0);
        myArrayList.remove(1);
    }
}
