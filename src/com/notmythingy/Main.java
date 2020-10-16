package com.notmythingy;

public class Main {

    public static void main(String[] args) {

        List<String> mylist = new List<>();

        mylist.add("Hey");
        mylist.add("Hello");


        System.out.println(mylist.contains("Elloh"));
        System.out.println(mylist.contains("Hey"));

        mylist.remove("Hey");
    }
}
