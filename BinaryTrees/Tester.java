package com.datastructures.BinaryTrees;
import com.datastructures.Queue.Queue;

public class Tester {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<Integer>();
        queue.append(1);
        queue.append(2);
        queue.append(3);
        queue.append(4);
        queue.append(5);

        System.out.println(queue.poll());
    }
    
    
}
