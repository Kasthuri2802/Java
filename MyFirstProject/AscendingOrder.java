import java.util.Arrays;
public class AscendingOrder {
    public static void main(String[] args) {
        int [] a = {7,3,4,6,1,8};
        for(int i=0; i<a.length-1;i++)
        {
            for(int j=0;j<a.length-i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
        // for(int i=0; i<a.length; a++)
        // {
        //     System.out.print(a[i]+" ");
        // }
    }
}