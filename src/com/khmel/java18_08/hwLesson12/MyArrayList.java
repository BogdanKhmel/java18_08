package com.khmel.java18_08.hwLesson12;


import java.util.*;

public class MyArrayList<I extends Number> {


    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        System.out.println(myList);
        System.out.println(myList.isEmpty());
        myList=new ArrayList(Arrays.asList(10, 35, 7, 4, 12, 15, 5, 2, 8, 1));
        myList.add(10);
        myList.add(35);
        myList.add(7);
        myList.add(4);
        myList.add(12);
        myList.add(15);
        myList.add(5);
        myList.add(2);
        myList.add(8);
        myList.add(1);
        System.out.println(myList);
        System.out.println(myList.size());
        System.out.println(myList.isEmpty());
        System.out.println(myList.contains(3));
        myList.remove(7);
        System.out.println(myList);
        System.out.println(myList.size());
        myList.add(7,1);
        System.out.println(myList);

        System.out.println(myList.get(7));
        myList.set(7,2);
        System.out.println(myList);

        System.out.println(myList.indexOf(35));


        Set<Integer> set = new LinkedHashSet<>(myList);
        System.out.println(set);
        myList.clear();
        System.out.println(myList);
        myList.addAll(set);
        System.out.println(myList);


    }


}

