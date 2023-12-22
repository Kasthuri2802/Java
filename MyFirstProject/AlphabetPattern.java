// import java.util.*;
public class AlphabetPattern {
    public static void main(String[] args) {
        int row = 10, col = 20;
        int fp = 20/2;
        int sp = 20/2;
        for (int i=1; i<=row; row++ )
        {
            for (int j=1; j<=col; col++)
            {
                if(j==fp || j==sp || i==row/2 && j>fp && j<sp && i%2==0)
                {
                    System.out.println("*");
                }
                else
                {
                     
                }
            }
            
        }
    }
}
