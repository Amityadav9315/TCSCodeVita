package TCS;

import java.util.Scanner;

public class ConsecutivePrimeSum{

        static void primeSum(int n){


            int count1=1;
            int count2=0;
            int sum=0;
            for(int i=2; i<n; i++){
                for(int j=2; j<n; j++){
                    if(i%j==0){
                        count1++;

                    }

                    }
                if(count1==2){
                    sum=sum+i;


                }
                for(int k=2; k<n; k++){
                    if(sum%k==0){
                        count2++;
                    }

                }


                }
            System.out.println(count2);
            }







        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            primeSum(n);


        }


    }



