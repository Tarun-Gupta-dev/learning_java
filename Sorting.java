package Basics;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int temp,minIndex;
        int[] a={3,4,1,0,4,9,7,4};
        for (int i = 0; i < a.length; i++) {
            minIndex=i;
            for (int j = i; j < a.length; j++) {
                if(a[minIndex]>a[j]){
                    minIndex=j;
                }
            }
            temp=a[i];
            a[i]=a[minIndex];
            a[minIndex]=temp;
        }

        System.out.println(Arrays.toString(a));

    }
}
