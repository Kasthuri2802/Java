import java.util.*;
public class ArmStrongNumber 
{
    public static void main(String [] args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = obj.nextInt();
        int temp = num, count = 0, sum = 0;
        while(num!=0)
        {
            count++;
            num = num/10;
        }
        num = temp;
        while(temp!=0)
        {
            int lastdigit = temp % 10;
            sum = sum + (int) Math.pow(lastdigit,count);
            temp = temp/10;
        }
        if(num == sum)
        {
            System.out.println(num + " is a ArmStrong Number" );
        }
        else
        {
            System.out.println(num + " is not a ArmStrong Number" );
        
        }


    }
    
}
