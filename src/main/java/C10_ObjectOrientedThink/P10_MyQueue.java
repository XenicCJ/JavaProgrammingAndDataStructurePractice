package C10_ObjectOrientedThink;

import java.util.Arrays;

/**
 * my queue class
 */
public class P10_MyQueue {
    private int[] elements;
    private int size;

    public P10_MyQueue(){
        elements=new int[8];
        size=0;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty(){
        return size==0?true:false;
    }

    public void enqueue(int v){
        if(size+1>elements.length){
            elements=Arrays.copyOf(elements,elements.length*2);
        }
        elements[size]=v;
        size++;
    }

    public int dequeue(){
        int val=elements[0];
        for(int i=0;i<size-1;i++){
            elements[i]=elements[i+1];
        }
        size--;
        return val;
    }
}
