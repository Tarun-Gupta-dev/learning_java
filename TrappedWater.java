package Basics;

import java.util.Arrays;
import java.util.Scanner;

public class TrappedWater {

    public static int getwater(int a[]){
        int w=0;
        int[] maxleft=new int[a.length];

        maxleft[0]=a[0];
        int maxright=a[a.length-1];

        for (int i = 1; i < a.length; i++) {
            maxleft[i] = Math.max(a[i - 1], maxleft[i - 1]);
        }
        for (int i = a.length-2; i >=0 ; i--) {
            maxright= Math.max(a[i + 1], maxright);
            if(maxleft[i]>a[i] && maxright>a[i]) {
                w = w + (Math.min(maxleft[i], maxright) - a[i]);
            }
        }
        

        return w;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int n;
        int[] a;
        while (t>0){

            n=sc.nextInt();
            a=new int[n];
            for (int i = 0; i < n; i++) {
                a[i]=sc.nextInt();
            }

            System.out.println(getwater(a));

            t--;
        }
    }
}
