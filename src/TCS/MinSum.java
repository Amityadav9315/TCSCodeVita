package TCS;

import java.util.Scanner;

public class MinSum {


    static void minSum(int n,int k,int[] arr){
        int[] array2=new int[n];


        int max=0;

        for(int i=0; i<n; i++){
            if(arr[i]>max){
                max=arr[i];
            }
            for(int j=0; j<k;  j++){
                max=max/2;
                array2[i]=max;
            }


        }
        System.out.println();
        for(int i=k; i<n; i++){
            array2[i]=arr[i];
        }
        int sum=0;
        for(int i=0; i<n; i++){
            sum=sum+array2[i];

        }
        System.out.println(sum);


    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        minSum(n,k,arr);
    }
}

