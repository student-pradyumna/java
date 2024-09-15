//write a java programe  to factorial of a given number
import java.util.*;
class fact 
{
    public static void main (String []args)
    {    int n,fac=1;
        Scanner sc=new Scanner(System.in);
        System.out.println ("Eneter a number ");
        n=sc.nextInt();
        while(n>1)
        {
            fac=fac*n;
            n=n-1;
        }
        System.out.println("factorial="+fac);
    }
} 