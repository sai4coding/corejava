package com.corejava.collectionFramework.arrayList;

import java.util.*;

public class MyArrayList {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(12);
        list.add(9);
        list.add(1, 4);
        list.remove(1);
        list.sort(Comparator.naturalOrder());
        list.sort(Comparator.reverseOrder());
        System.out.println(list);

        List<String> st=new ArrayList<>();
        st.add("naga");
        st.add("sai");
        System.out.println(st);
        st.remove("sai");
        st.remove(0);
        System.out.println(st);

        List<Character> ch=new ArrayList<>();
        ch.add('N');
        ch.add('A');
        ch.add('G');
        ch.add('A');
        System.out.println(ch);

        List<Boolean> condition = new ArrayList<>();
        condition.add(true);
        condition.add(false);
        System.out.println(condition);
    }
}