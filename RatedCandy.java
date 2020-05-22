package Basics;

import java.util.Arrays;
import java.util.Scanner;

public class RatedCandy {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] rating=new int[n];
        int[] candies=new int[n];
        for (int i = 0; i < n; i++) {
            rating[i]=sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            candies[i]=1;
        }
        for (int i = 0; i < candies.length-1; i++) {
            if(rating[i+1]>rating[i] ) candies[i+1]=candies[i]+1;
            if(rating[i+1]<rating[i] && candies[i+1]>=candies[i]) candies[i]=candies[i+1]+1;
            if(rating[i+1]==rating[i]) candies[i+1]=candies[i];
        }

        for (int i = candies.length-1; i >0 ; i--) {
            if(rating[i-1]>rating[i] && candies[i-1]<=candies[i]) candies[i-1]=candies[i]+1;
            if(rating[i-1]<rating[i] && candies[i-1]>=candies[i]) candies[i]=candies[i-1]+1;
        }
        System.out.println(Arrays.toString(candies));


    }
}
