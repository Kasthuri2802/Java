import java.util.*;
public class SpyNumber 
{
    public static void main(String [] args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = obj.nextInt();
        int sum = 0, product = 1;
        int temp = num;
        while(num!=0)
        {
            int lastdigit = num % 10;
            sum = sum + lastdigit;
            product = product * lastdigit;
            num = num / 10;
        }
        if(sum  ==  product)
        {
            System.out.println(temp + " is a Spy number");
        }
        else
        {
            System.out.println(temp + " is not a Spy number");
        }

    }
    
}
