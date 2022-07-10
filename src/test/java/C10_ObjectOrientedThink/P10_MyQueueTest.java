package C10_ObjectOrientedThink;

import java.util.Arrays;

/**
 * my queue class
 */
public class P10_MyQueueTest {
    public static void main(String[] args) {
        P10_MyQueue queue=new P10_MyQueue();
        for(int i=0;i<100;i++){
            queue.enqueue(i);
        }
        for(int i=0;i<100;i++){
            System.out.println(queue.dequeue());
        }
    }
}
