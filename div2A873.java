import java.util.*;
public class div2A873
{
    public static void main(String[] args)
    {
       Scanner in=new Scanner(System.in);
       int t=in.nextInt();
       for (int i=0;i<t;i++)
       {
         int n=in.nextInt();
         int j,d;double c=0;
         int arr[]=new int[n];
         for( j=1;j<n;j++)
            arr[j]=j+1;
        for(int k=1; ;k++)
        {
            c= k*n+1-n*(n+1)/2;
            d=(int)c;
            if((c>0) && (c==d))
            {
                arr[0]=d;
                break;
            }
        }
        for( j=0;j<n;j++)
        System.out.print(arr[j]+" ");
        System.out.println();
       }
    }
}
