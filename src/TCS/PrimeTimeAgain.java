package TCS;

import java.util.Scanner;

public class PrimeTimeAgain {




    static  void primeTimeagain(int d,int p){

        int c=d/p;
        int count=0;
        int a=0;
        for(int i=2; i<c; i++){
            for(int j=2; j<d; j=j+c){
                if(i%j==0){
                    count++;
                }
            }
            if(count==3){
                 a++;
            }
            count=0;


        }
        System.out.println(a);


    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int d=sc.nextInt();
        int p=sc.nextInt();


    }
}
