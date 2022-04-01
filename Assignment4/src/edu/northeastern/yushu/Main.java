package edu.northeastern.yushu;

import java.util.LinkedList;
import java.util.Queue;
public class Main {

    public static void main(String[] args) {
    }
}
class currentQueue<T> {
    Queue<T> queue;
    private Object lock;

    public currentQueue(Queue<T> queue) {
        queue = new LinkedList<T>();
    }
    // 1.void add(T data)
    public void add(T data) {
        synchronized (lock){
            queue.add(data);
        }
    }
    // 2. T remove()
    public T remove(){
        synchronized (lock){
            return queue.remove();
        }
    }
    // 3. T peek()
    public T peek(){
        synchronized (lock){
            return queue.peek();
        }
    }
    // 4. boolean isEmpty()
    public boolean isEmpty(){
        synchronized (lock){
            return queue.isEmpty();
        }
    }
}
