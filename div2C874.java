import java.util.*;
public class div2C874 {
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=in.nextInt();
            int arr[]=new int[n];
            int min=0,c=0;
            for(int j=0;j<n;j++)
            {
                arr[j]=in.nextInt();
                if(j==0)
                min=arr[j];
                else if(arr[j]<min)
                min=arr[j];
                if(arr[j]%2==1)
                c++;
            }
            if(min%2==1 || c==0)
            System.out.println("YES");
            else
            System.out.println("NO");
        }
    }
}
