package Basics;

import java.util.Arrays;
import java.util.Scanner;

public class kthsmallest {

    public static int findsmallest(int a[],int k){
        Arrays.sort(a);
        return a[k-1];
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int n;
        int[] a;
        int k;
        while (t>0){

            n=sc.nextInt();
            a=new int[n];
            for (int i = 0; i < n; i++) {
                a[i]=sc.nextInt();
            }
            k=sc.nextInt();


            System.out.println(findsmallest(a,k));

            t--;
        }
    }
}
