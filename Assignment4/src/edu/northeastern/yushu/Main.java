package edu.northeastern.yushu;

import java.util.Stack;
public class Main {

    public static void main(String[] args) {

    }
}
class Queue<T> {
    private Object lock;
    Stack<T> s1;
    Queue() {
        s1 = new Stack<>();

    }
    // 1.void add(T data)
    public void add(T data) {
        synchronized (lock) {
            this.s1.push(data);
        }
    }
    // 2. T remove()
    public T remove() {
        synchronized (lock) {
            return this.s1.pop();
        }
    }
    // 3. T peek()
    public T peek() {
        synchronized (lock) {
            return this.s1.peek();
        }
    }
    // 4. boolean isEmpty()
    public boolean isEmpty() {
        synchronized (lock) {
            return s1.peek() == null;
        }
    }
}
