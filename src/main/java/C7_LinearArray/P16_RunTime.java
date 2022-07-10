package C7_LinearArray;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * randomly build an array consists of 100_000 integers, input a key value,
 * use linearSearch and binarySearch to search value in array
 * measure how long it takes for these two function to search
 */
public class P16_RunTime {
    /**
     * build a random array
     * @param size the size of array
     * @param min minimum number
     * @param max maximum number
     * @return
     */
    public static int[] getRandomIntegerArray(int size,int min, int max){
        int[] intArray=new int[size];
        for(int i=0;i<size;i++){
            intArray[i]=(int)(Math.random()*(max-min+1));
        }
        return  intArray;
    }

    /**
     * create a random number between min and max
     * @param min
     * @param max
     * @return
     */
    public static int getRandomKeyValue(int min,int max){
        return (int)(Math.random()*(max-min+1));
    }

    /**
     * find first key position in array
     * @param array
     * @param key
     * @return first key position in array, if not find return -1
     */
    public static int linearSearch(int[] array,int key){
        for(int i=0;i<array.length;i++){
            if(array[i]==key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] intArray=getRandomIntegerArray(10000000,1,5000000);
        int key=getRandomKeyValue(1,500000);
        long startTime;
        long endTime;
        long executionTime;
        //use linear search to search key in intArray
        startTime=System.nanoTime();
        linearSearch(intArray,key);
        endTime=System.nanoTime();
        executionTime=endTime-startTime;
        System.out.println("Linear Search Time: "+executionTime);
        //sort array
        startTime=System.nanoTime();
        Arrays.sort(intArray);
        endTime=System.nanoTime();
        executionTime=endTime-startTime;
        System.out.println("Sort Time: "+executionTime);
        //use binary search to search key in intArray
        startTime=System.nanoTime();
        Arrays.binarySearch(intArray,key);
        endTime=System.nanoTime();
        executionTime=endTime-startTime;
        System.out.println("Binary Search Time: "+executionTime);
    }
}
