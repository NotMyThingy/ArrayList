package com.notmythingy;

public class Main {

    public static void main(String[] args) {

        List<String> mylist = new List<>();

        System.out.println(mylist.contains("Hey"));

        mylist.add("Hey");
        System.out.println(mylist.contains("Hey"));

        int index = mylist.indexOf("Hey");
        System.out.println(index);

        System.out.println(mylist.valueOf(index));

        mylist.remove("Hey");
        System.out.println(mylist.contains("Hey"));
    }
}
