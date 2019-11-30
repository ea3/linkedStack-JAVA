package dev.ea3;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedStack {

    private LinkedList<Employee> stack;

    public LinkedStack(){
        this.stack = new LinkedList<Employee>();
    }

    public void push(Employee employee){
        this.stack.push(employee);
    }

    public Employee pop(){
        return this.stack.pop();
    }

    public Employee peek(){
        return this.stack.peek();
    }

    public boolean isEmpty(){
        return this.stack.isEmpty();
    }

    public void printStack(){
        ListIterator<Employee> iterator = stack.listIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
