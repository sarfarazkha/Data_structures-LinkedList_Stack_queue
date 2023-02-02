package com.bridgelabz.datastructure.hashtable;

import java.util.Map;

public class HashtableMain {
    public static void main(String[] args) {
        HashTable<String, Integer> hash = new HashTable<String, Integer>();
        hash.put("To", 1);
        hash.put("Be", 2);
        hash.put("Or", 3);
        hash.put("Not", 4);
        hash.put("To", 5);
        hash.put("Be", 6);
        System.out.println(hash.size());
    }
}
