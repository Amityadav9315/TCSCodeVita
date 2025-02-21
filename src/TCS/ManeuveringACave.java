package TCS;

import java.util.Scanner;

public class ManeuveringACave {
        public static void main (String[] args) throws java.lang.Exception
        {
            Scanner sc=new Scanner(System.in);
                int m=sc.nextInt();
                int n=sc.nextInt();

                int c=(m+n-2);
                int sum=c;
                while(c>0){
                    sum=sum*c-1;
                    c--;
                }

                int d=m-1;
                int sum1=d;
                while(d>0){
                    sum1=sum1*(d-1);
                    d--;
                }
                int e=n-1;
                int sum2=e;
                while(e>0){
                    sum2=sum2*(e-1);
                    e--;

                }
                int den=sum1*sum2;



                int path=sum/den;
                System.out.println(path);
            }
            // your code goes here

        }



