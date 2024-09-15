 class student
 {
    int roll;
    String name;
    static  String cname="Bhadrak auto college";
    student(int x, String y)
    {
        roll=x;
        name=y;
    }
    void display()
    {
        System.out.println("Roll no="+roll+"Name="+name+"College name="+cname);
    }
}

class demo
    {
        public static void main(String[]args)
        {
            student aa=new student(101,"ram");
            student bb=new student(102,"hari");
                 aa.display();
                 bb.display();
        }
    }
 