import java.util.Scanner;

public class prime_from_1_to_n 
{
    public static void main(String[] args) {
         int n, i,count,j=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr the value of n");
        n = sc.nextInt();
        System.out.println("Prime no from 1 to "+n+" are ");
        for (i=1 ; i<=n ; ++i)
        {
            count=0;
          for(j=1 ; j<=i ; ++j)
          {
            if(i%j==0)
               ++count;
            
          }
          if(count==2)
          System.out.println(i);
        //   else{
        //     count=0;
        //   }
          
        }
    
    }
    
}
