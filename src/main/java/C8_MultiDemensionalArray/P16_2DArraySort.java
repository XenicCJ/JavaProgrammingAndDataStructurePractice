package C8_MultiDemensionalArray;

import java.util.Arrays;

/**
 * sort a 2D array
 */
public class P16_2DArraySort {
    /**
     * sort a n*m matrix
     * @param m
     */
    public static void sort(int[][] m){
        for(int i=m.length-1;i>0;i--){
            for(int j=0;j<i;j++){
                if(compare(m[j],m[j+1])==1){
                    switchArray(m[j],m[j+1]);
                }
            }
        }
    }

    /**
     * compare which array is larger, length of a and b should be same
     * @param a
     * @param b
     * @return -1 if a<b, 0 if a==b, 1 if a>b 2 if length of a and b is not same
     */
    public static int compare(int[] a,int[] b){
        if(a==null||b==null||a.length!=b.length)
            return 2;
        for(int i=0;i<a.length;i++){
            if(a[i]>b[i]){
                return 1;
            }
            if(a[i]<b[i]){
                return -1;
            }
        }
        return 0;
    }

    /**
     * switch array a and b
     * @param a
     * @param b
     * @return false if length of a and b is not equal, true if success
     */
    public static boolean switchArray(int[] a, int[] b){
        if(a==null||b==null||a.length!=b.length){
            return false;
        }

        int[] temp=new int[a.length];
        assignArray(temp,a);
        assignArray(a,b);
        assignArray(b,temp);
        return true;
    }

    /**
     * assign b to a
     * @param a
     * @param b
     * @return false if length of a and b is not equal, true if success
     */
    public static boolean assignArray(int[] a, int[] b){
        if(a==null||b==null||a.length!=b.length){
            return false;
        }

        for(int i=0;i<a.length;i++){
            a[i]=b[i];
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] matrix={
                {4,6,3},
                {4,6,6},
                {1,1,4},
                {4,6,7},
                {4,2,3},
                {4,2,9},
                {1,4,4},
        };
        sort(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }
}
