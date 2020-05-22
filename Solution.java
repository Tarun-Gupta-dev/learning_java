package Basics;

public class Solution {
    public static void main(String[] args) {
        String s="TarunGupta";
        s=s.replace('a',' ');
        s=s.replace('e',' ');
        s=s.replace('i',' ');
        s=s.replace('o',' ');
        s=s.replace('u',' ');

        String[] str=s.split(" ");
        String ans="";
        for (String i:str) {
            ans=ans+i;
        }

        System.out.println(ans);
    }
}