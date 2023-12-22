public class max {
    public static void main(String [] args)
    {
        int a[]={10,40,70,90,30};
        maximum(a);
    }
    public static void maximum(int a[])
    {
        int max=a[0];
        for(int i=0;i<a.length;i++)
        {
            
            if(a[i]>max)
            {
                max=a[i];
            }

         }
         System.out.println(max +" is a maximum number of given array");

    }
    
}
