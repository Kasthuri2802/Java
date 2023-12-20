
import java.util.*;
public class Fabnaci {
    public static void main (String [] args)
    {
        int first = 0;
        int second = 1;
        int third, element;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        element = obj.nextInt();
        System.out.print(first + " ");
        System.out.print(second + " ");
        for(int i=2; i<element; i++)
        {
            third = first + second;
            first = second;
            second = third;
            System.out.print(third + " ");
        }
        
    }
    
}
