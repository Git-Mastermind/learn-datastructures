package com.datastructures.ArrayListImplementation;

public class ArrayListTester {

    public static void main(String[] args) {

        String[] letterArray = {"a", "b", "c", "d", "e"};
        ArrayList tester = new ArrayList(letterArray);
        
        System.out.println(tester.indexOf("g"));
    }
    

    
}
