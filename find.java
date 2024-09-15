import java.util.*;
class find
{
    public static void main(String []args)
    {
        int x,y,pro=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Eneter Base:");
        x=sc.nextInt();
        System.out.println("Enetr power:");
        y=sc.nextInt();
        while(y>0)
        {
            pro=pro*x;
            y--;
        }
        System.out.println("value="+pro);
    }



}