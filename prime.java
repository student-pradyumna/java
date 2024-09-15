
// write a java programe to check whether a number isn prime or not by user input
import java.util.*;

class prime {
    public static void main(String[] args) {
        int n, i, count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr a no to check prime");
        n = sc.nextInt();
        i = 1;
        while (i <= n) {
            if (n % i == 0)
                count = count + 1;
            i = i + 1;
        }
        if (count == 2)
            System.out.println("prime");
        else
            System.out.println("this is not a prime number");

    }
}