package Basics;

import java.util.Arrays;

public class Strings {
    public static void main(String[] args) {
        String s1="Hello";
        String s2="World";

        int[] a=new int[256];

        for (int i = 0; i <s1.length() ; i++) {
            a[(int)s1.charAt(i)]=1;
        }

        for (int i = 0; i < s2.length() ; i++) {
            if(a[(int)s2.charAt(i)]==1){
                System.out.println("YES");
            }

        }

    }
}
