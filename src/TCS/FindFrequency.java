package TCS;

import java.util.Scanner;

public class FindFrequency {


    static void findFrequency(int n,int[] arr){
        int visited=-1;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
            if(arr[i]==arr[j]){
                visited=1;
            }
        }




    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

    }
}
