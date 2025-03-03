package TCS;

import java.util.Scanner;

public class perfectSquare {




    static void PerfectSquare(int n){
        int count=0;
        for(int i=1; i<n; i++){
            if(n%i==i){
                count=1;

            }
        }
        if(count==1){
            System.out.println("Perfect square");
        }
        else{
            System.out.println("Not Prime Number");
        }


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        PerfectSquare(n);

    }
}
