package IUS;

import java.util.LinkedList;

public class Homework1<T> implements ILinkedList {
    T data;
    ILinkedList<T> next;

    public int size(){
        return 0;
    }

    @Override
    public ILinkedList next() {
       return this.next;
    }

    @Override
    public ILinkedList last() {
        ILinkedList temp;
        temp = this;
        while(((Homework1) temp).next!= null) {
            temp = ((Homework1) temp).next;
        }
        return temp;
    }

    @Override
    public ILinkedList after(int n) {
        ILinkedList temp = next;
        int count = 0;
        temp = this;
        while(temp != null){
            if(count == n){
                return temp;
            }
            count++;
            temp = ((Homework1) temp).next;
        }
        return temp;
    }

    @Override
    public ILinkedList detach() {
        ILinkedList temp;
        temp = this;
        this.next = null;
        /*while(((Homework1) temp).next != null){
            ((Homework1) temp).next = null;
            return temp;
        }*/
        return this;
    }

    @Override
    public Object get() {
        ILinkedList current;
        current = this;
        return this;
    }

    @Override
    public void set(Object value) {
        ILinkedList temp;
        temp = this;
        if(((Homework1) temp).data == null){
            ((Homework1) temp).data = value;
            System.out.println(value);
        }
    }

    @Override
    public void setNext(ILinkedList next) {
        ILinkedList temp;
        temp = this;
        while (((Homework1) temp).next == null){
            ((Homework1) temp).data = next;
            System.out.println(temp);
        }
    }

    @Override
    public void append(ILinkedList next) {
        ILinkedList temp;
        temp = last();
        temp.setNext(next);
        System.out.println(temp);
    }

    @Override
    public void insert(ILinkedList newFirst) {
        newFirst.setNext(this);
        System.out.println(newFirst);
    }
}
