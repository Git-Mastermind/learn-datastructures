package com.datastructures.ArrayListImplementation;

public class ArrayListTester {

    public static void main(String[] args) {

        String[] letterArray = {"a", "b", "c", "d", "e", "d"};
        ArrayList tester = new ArrayList(letterArray);
        
        System.out.println(tester.lastIndexOf("h"));
    }
    

    
}
