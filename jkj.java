import java.util.*;
class jkj
{
    int a,b;
    jkj(int x,int y)
    {
        a=x;
        b=y;
    }
    
    void output()
    {
        int c;
        c=a+b;
        System.out.println("addition="+c);
    }
    public static void main(String[] args)
    {
        int m;
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st number:");
        m = sc.nextInt();
        System.out.println("Enter 2 nd number:");
        n = sc.nextInt();
        jkj aa=new jkj(m,n);
        aa.output();
    }
}