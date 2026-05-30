package com.datastructures.ArrayListImplementation;

public class ArrayList {

    public String[] array;

    public ArrayList(int size) {
        array = new String[size];
    }

    public void add(int index, String value) {
        array[index] = value;
    }

    public int size() {
        return array.length;
    }

    public String get(int index) {
        return array[index];
    }

    public void remove(int index) {
        array[index] = null;
    }

    public int indexOf(String value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public void addAtEnd(String value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                array[i] = value;
            }
        }
    }





    // public String[] append(String valueToAppend) {
    //     String[] newArray = new String[array.length + 1];

    //     for (int i = 0; i < array.length; i++) {
    //         newArray[i] = array[i];
    //     }
    //     newArray[array.length] = valueToAppend;
    //     return newArray;
    //     }

    // public void delete(String valueToErase) {
    //     String[] newArray = new String[array.length - 1];

    //     int indexOfValueToErase = -1;

    //     for (int i = 0; i <= newArray.length; i++) {
    //         if (indexOfValueToErase != -1) {
    //             if (array[i] != valueToErase) {
    //                 newArray[i - 1] = array[i];
    //             }
    //         }
    //         else {
    //             if (array[i] == valueToErase) {
    //                 indexOfValueToErase = i + 1;
    //             }
    //             else {
    //                 newArray[i] = array[i];
    //             }
    //         }
    //     }
        
    //     turnArrayToStringRepresentation(newArray);
    // }

    // public void turnArrayToStringRepresentation(String[] array) {
    //     for (int i = 0; i < array.length; i++) {
    //         System.out.println(array[i]);
    //     }
    // }

    // public boolean isEmpty() {
    //     int length = 0;

    //     for (int i = 0; i < array.length; i++) {
    //         if (array[i] != null) {
    //             length++;
    //         }
    //     }

    //     if (length == 0) {
    //         return true;
    //     }
    //     else {
    //         return false;
    //     }
    // }

    // public boolean contains(String value) {
        
    //     for (int i = 0; i < array.length; i++) {
    //         if (array[i] == value) {
    //             return true;
    //         }
    //     }
    //     return false;
    // }

    // public String get(int index) {
    //     if (index > array.length - 1) {
    //         return "IndexOutOfBoundException!";
    //     }
    //     return array[index];
    // }

    // public int indexOf(String value) {
    //     for (int i = 0; i < array.length; i++) {
    //         if (array[i] == value) {
    //             return i;
    //         }
    //     }
    //     return -1;
    // }

    // public int lastIndexOf(String value) {
    //     int index = -1;

    //     for (int i = 0; i < array.length; i++) {
    //         if (array[i] == value) {
    //             index = i;
    //         }
    //     }
    //     return index;
    // }
    
    
}
