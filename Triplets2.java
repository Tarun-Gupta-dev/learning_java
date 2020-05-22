package Basics;

// { Driver Code Starts
import java.util.*;
class Triplets2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            Triplet g=new Triplet();
            if(g.findTriplets(a,n))
                System.out.println("1");
            else
                System.out.println("0");

        }
    }
}// } Driver Code Ends


/*Complete the function below*/


class Triplet
{
    // Function to check if triplet is present
    // arr[]: input array
    // n: size of the array
    public boolean findTriplets(int a[] , int n)
    {
        Arrays.sort(a);
        
        int[] b=new int[n-1];
        for(int i=0;i<n;i++){

            for (int j = 0; j < i; j++) {
                b[j]=a[j];
            }
            for (int j = i+1; j < n; j++) {
                b[j-1]=a[j];
            }

            if(twoSum(b,-a[i])){
                return true;
            }


        }

        return false;

    }

    public boolean twoSum(int[] a,int x){
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

}