// write a java programe to prtint fibonaccin series
import java.util.*;
class built
{
    public static void main (String []args)
    { 
        int n,x=0,y=1,z=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr number:");
        n=sc.nextInt();
        while(z<=n)
        {
            z=x+y;
            System.out.println(z);
            x=y;
            y=z;
            z=x+y;
        }
    }
