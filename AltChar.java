package Basics;

import java.util.Scanner;

public class AltChar {

    static int delete(String s){
        int count=0;
        char[] a=s.toCharArray();
        for (int i = 0; i < s.length()-1; i++) {
            if(a[i+1]==a[i]){
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] store=new String[n];
        for (int i = 0; i < n; i++) {
            store[i]=sc.next();
        }
        for (int i = 0; i < n; i++) {
            System.out.println(delete(store[i]));
        }
    }
}
