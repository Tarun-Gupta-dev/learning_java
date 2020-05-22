package Basics;

import java.util.Arrays;

public class SlidingWindowMax {

    public static void main(String[] args) {
        int[] a={ 2,3,1,6,9,4,3,7,6,8 };
        int k=3;
        int[] max=new int[a.length];
        max[0]=0;
        int i=0;
        int j=i+k-1;
        while(i<=a.length-k){

            for (int l = i; l <=j ; l++) {
                max[i]=Math.max(a[l],max[i]);
            }

            i++;
            j=i+k-1;
        }

        System.out.println(Arrays.toString(max));

    }

}
