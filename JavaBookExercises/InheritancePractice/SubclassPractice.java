package com.datastructures.JavaBookExercises.InheritancePractice;

public class SubclassPractice extends SuperclassPractice {
    public void greeting() {
        super.greeting();
        System.out.println("Greetings once again!");
    }

    public static void main(String[] args) {
        SubclassPractice subclass = new SubclassPractice();
        subclass.greeting();
    }
}
