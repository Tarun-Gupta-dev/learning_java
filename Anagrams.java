package Basics;
//Using o(n2)
/*public class Basics.Anagrams {
    public static void main(String[] args) {
        String str1="aab";
        String str2="baak";
        boolean isAnagram=false;
        boolean[] visited=new boolean[str1.length()];
        if(str1.length()==str2.length()) {
            for (int i = 0; i < str1.length(); i++) {

                for (int j = 0; j < str2.length(); j++) {
                    if (str1.charAt(i) == str2.charAt(j) && !visited[j]) {
                        visited[j]=true;
                        isAnagram = true;
                        break;
                    } else {
                        isAnagram = false;
                    }
                }
            }
            System.out.println(isAnagram);
        }
        else{
            System.out.println(isAnagram);
        }

    }
}*/

//Using O(n)//arraysort method

import java.util.*;

public class Anagrams{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        char[] ar=a.toCharArray();
        char[] br=b.toCharArray();
        Arrays.sort(ar);
        Arrays.sort(br);
        /*if(Arrays.compare(ar,br)==0){
            System.out.println("strings are Anagrams");
        }
        else{
            System.out.println("strings are not Anagrams");
        }*/

        System.out.println(Arrays.toString(ar));
        System.out.println(Arrays.toString(br));



    }
}
