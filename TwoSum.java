package Basics;

import java.util.*;
import java.lang.*;

class TwoSum {
    static boolean twoSum(int[] a,int x){
        int n=a.length;
        int i=0,j=n-1;
        while (i<j){
            if(a[i]+a[j]<x){
                i++;
            }
            else if (a[i]+a[j]>x) {
                j--;
            }
            else {
                return true;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        int[] a={97,-27 ,2 ,-34 ,61 };
        int x=39;
        System.out.println(twoSum(a,x));

    }
}