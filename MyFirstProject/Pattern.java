// import java.util.*;
public class Pattern {
    public static void main(String [] args)
    {
        int n =9
        ;
        for(int i=1; i<=n; i++)
        {
            for(int k=n-1;k>=i;k--)
            {
                System.out.print("  ");
            }
            int count=0;
            for(int j=1; j<=2*i-1; j++)
            {
                
                if(j<=i)
                {
                  count++;
                }
                else 
                {
                    count--;
                 }  
                 System.out.print(count+" ");
            }
            System.out.println();
        }
    }
    
}
