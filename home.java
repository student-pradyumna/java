import java.util.*;
class home
{
     public static void main(String[]args)
    {
        int n,i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
    n=sc.nextInt();
    for(i=1;n>=i;n--)
    {
        for(j=1;j<=n;j++)
        {
            System.out.print("*");
        }
        System.out.println();
    }
    }

}