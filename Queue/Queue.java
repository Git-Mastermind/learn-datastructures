package com.datastructures.Queue;
import java.util.List;
import java.util.ArrayList;


public class Queue<T> {
    List<T> queue = new ArrayList<>();

    public void append(T value) {
        queue.add(value);
    }

    public T peek() {
        return queue.get(-1);
    }
}
