package Basics;

import java.util.Arrays;
import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String ans="";
        int i=s.length()-1;

        while(i>=0) {
            while (i >= 0 && s.charAt(i) == ' ') i--;
            int j = i;
            while (i >= 0 && s.charAt(i) != ' ') i--;

            if(i<0) break;
            if(ans.isEmpty()){
                ans=ans.concat(s.substring(i+1,j+1));
            }
            else{
                ans=ans.concat(" "+s.substring(i+1,j+1));
            }
        }

        System.out.println(ans);


    }
}
