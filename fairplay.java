import java.util.*;
public class fairplay
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        String arr[]=new String[t];
        for(int i=1; i<=t;i++)
        {
            int n1=in.nextInt();
            int n2=in.nextInt();
            int n3=in.nextInt();
            int n4=in.nextInt();
            if(Math.min(n1,n2)>Math.max(n3,n4) || Math.min(n3,n4)>Math.max(n1,n2) )
             arr[i-1]="No";
             else
             arr[i-1]="Yes";
        }
        for(int i=1; i<=t;i++)
        System.out.println(arr[i-1]);
    }

}