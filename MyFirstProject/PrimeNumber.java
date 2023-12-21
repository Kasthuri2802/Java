import java.util.*;
public class PrimeNumber
{
    public static void main(String [] args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = obj.nextInt();
        if( num == 0 || num == 1)
        {
            System.out.println(num + " is not a Prime Number");
        }
        int i = 2, flag = 0;
        while (i<=num/2)
        {
            if(num % i == 0)
            {
                flag = 1;
                break;
            }
            i++;
        }
        if(flag == 1)
        {
            System.out.println(num + " is not a Prime Number");
        }
        else
        {
            System.out.println(num + " is a Prime Number");
        }

    }
    
}
