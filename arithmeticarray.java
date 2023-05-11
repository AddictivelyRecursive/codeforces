import java.util.*;
public class arithmeticarray {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        int i,j,sum=0;
        int arr[]=new int[t];
        for(i=0;i<t;i++)
        {
            int size=in.nextInt();
            for(j=0;j<size;j++)
            {
                int n=in.nextInt();
                sum+=n;
            }
            if(sum==size)
            arr[i]=0;
            else if(sum>size)
            arr[i]=sum-size;
            else
            arr[i]=1;
            sum=0;
        }
        for(i=0;i<t;i++)
        System.out.println(arr[i]);
    }
    
}
