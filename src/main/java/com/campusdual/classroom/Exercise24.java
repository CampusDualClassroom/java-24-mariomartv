package com.campusdual.classroom;

import java.util.LinkedList;
import java.util.Queue;

public class Exercise24 {
    public static Queue<String> createQueue() {
    Queue<String> queue = new LinkedList<String>();
    queue.add("Smith");
        queue.add("Montessori");
        queue.add("Peralta");
        queue.add("House");
    return queue;
    }
    public static void printAndEmptyQueue(Queue<String> queue) {
    for(String elem : queue){
        System.out.println(elem);
    }
    }

    public static void main(String[] args) {

    }

}
