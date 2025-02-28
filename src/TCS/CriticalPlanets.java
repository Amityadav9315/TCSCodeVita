package TCS;

import java.util.Scanner;

public class CriticalPlanets {


    static void criticalPlanets(){



    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int[] arr=new int[2*m];
        for(int i=0; i<2*m; i++ ) {
            arr[i]=sc.nextInt();

        }
        for(int i=0; i<2*m; i++){
            if(arr[i]==arr[i+2]){

            }
        }




    }
}
