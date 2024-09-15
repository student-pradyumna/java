 // single inheritance
import java.util.*;
class A 
{
    int a;
    int b;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 st number:");
         a=sc.nextInt();
         System.out.println("Enter 2nd number:");
         b=sc.nextInt();
    }
    void add()
    {
        System.out.println("addition="+(a+b));
    }
class D extends A
{
int c;
void putdata()
{
    Scanner sc=new Scanner(System.in);
    c=sc.nextInt();
}
void display()
{
    System.out.println("addition="+(a+b+c));
}
}
class demo{
    public static void main(String[]args)
    {
        D aa = new D();
        aa.input();
        aa.add();
        aa.putdata();
        aa.display();

    }
}
    }


