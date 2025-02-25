package TCS;

import java.util.Scanner;

public class MinSum {


    static void minSum(int n,int r,int[] arr){
        int max=0;

        for(int i=0; i<n; i++){
            if(arr[i]>max){
                max=arr[i];
            }


        }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
    }
}
