package com.datastructures.ArrayListImplementation;

public class ArrayListImplementationTester {

    public static void main(String[] args) {

        String[] letterArray = {"a", "b", "c", "d", "e"};
        ArrayListImplementation tester = new ArrayListImplementation(letterArray);
        
        tester.turnArrayToStringRepresentation(tester.append("f"));
    }
    

    
}
