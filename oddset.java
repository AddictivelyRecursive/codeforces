import java.util.*;
public class oddset {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        String arr[]= new String[t];
        int even=0,odd=0,i;
        for(i=0; i<t; i++)
        {
            int n=in.nextInt();
            for( int j=0;j<2*n;j++)
            {
                int num=in.nextInt();
                if(num%2==0)
                even++;
                else
                odd++;
            }
            if(n==Math.min(even,odd))
            arr[i]="Yes";
            else
            arr[i]="No";
            even=0;
            odd=0;
    }
    for( i=0; i<t; i++)
    System.out.println(arr[i]);
    
}
}
