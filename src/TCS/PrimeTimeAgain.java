package TCS;

import java.util.Scanner;

public class PrimeTimeAgain {




    static  void primeTimeagain(int d,int p){

        int c=d/p;
        int count=0;
        int a=0;
        for(int i=2; i<c; i++){
            for(int j=i; j<=d; j=j+c) {
                for (int k = 2; k <= d; k++) {
                    if (j % k == 0) {
                        count++;
                    }
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
        primeTimeagain(d,p);


    }
}
