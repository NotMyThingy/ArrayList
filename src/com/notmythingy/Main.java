package com.notmythingy;

public class Main {

    public static void main(String[] args) {

        List<String> mylist = new List<>();

        mylist.add("Hi");
        mylist.add("Hello");
        mylist.add("Howdy");

        for (int i = 0; i < mylist.size(); i++) {
            System.out.println(mylist.valueOf(i));
        }
    }
}
