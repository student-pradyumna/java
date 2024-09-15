import java.util.*;
class ob
{
    int n;
    void getdata()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter of n number:");
        n=sc.nextInt();

    }
void putdata()
{
    int i,count=0;
    for(i=1;i<=n;i++)
    {
        if(n%i==0)
        count=count+1;
    }
    if(count==2)
    System.out.println("prime");
    else
    System.out.println("not prime");
}
public static void main(String []args)
{
    ob aa=new ob();
    aa.getdata();
    aa.putdata();
}
}

