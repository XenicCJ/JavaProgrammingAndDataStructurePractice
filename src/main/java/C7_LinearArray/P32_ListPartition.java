package C7_LinearArray;

import java.util.Arrays;

/**
 * use first element as key, seperate a list to two parts, with time complexity in list size
 */
public class P32_ListPartition {
    /**
     * list partitioner
     * @param intList
     */
    public static void listPartitioner(int[] intList){
        int pivot=0;
        int high=intList.length-1;
        int low=1;

        while(!(high<=low&&intList[pivot]>=intList[high]&&intList[pivot]<intList[low])){
            if(intList[high]>=intList[pivot]){
                high--;
            }else if(intList[low]<intList[pivot]){
                low++;
            }else{
                int temp=intList[high];
                intList[high]=intList[low];
                intList[low]=temp;
            }
        }
        int temp=intList[high];
        intList[high]=intList[pivot];
        intList[pivot]=temp;
    }

    /**
     * build a random list
     * @param length
     * @return
     */
    public static int[] buildRandomList(int length,int min,int max){
        int[] list=new int[length];
        for(int i=0;i<length;i++){
            list[i]=(int)(Math.random()*(max-min+1)+min);
        }
        return list;
    }

    public static void main(String[] args) {
        int[] list=buildRandomList(25,1,8);
        System.out.println("List before partition: "+ Arrays.toString(list));
        listPartitioner(list);
        System.out.println("List after partition: "+Arrays.toString(list));
    }
}
