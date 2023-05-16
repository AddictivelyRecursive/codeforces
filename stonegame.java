import java.util.*;
public class stonegame {
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++)
        {
            int j,p1=0,p2=0,c=0,a=0,max=0,min=0;
            int n=in.nextInt();
            int arr[]=new int[n];
            for(j=0;j<n;j++)
            {
                arr[j]=in.nextInt();
                if(j==0)
                {
                    max=arr[0];
                    p1=0;
                    min=arr[0];
                    p2=0;
                }
                else
                {
                    if(arr[j]>max)
                    {
                        max=arr[j];
                        p2=j;
                    }
                    else if(arr[j]<min)
                    {
                        min=arr[j];
                        p1=j;
                    }
                }
            }
            if(p1<n/2 && p2<n/2)
            {
                c=Math.max(p1,p2)+1;
                System.out.println(c);
                continue;
            }
            else if(p1>=n/2 && p2>=n/2)
            {
                c=n-Math.min(p1,p2);
                System.out.println(c);
                continue;
            }
            else
            {
                if(p1<n/2 && p2>=n/2)
                {
                    if(p1+1<=n-p2)
                    {
                        c=p1+1;
                        p2=p2-c;
                        n= n-c;
                        if(p2>=n/2)
                        c=c+n-p2;
                        else
                        c=c+p2+1;
                        System.out.println(c);
                        continue;
                    }
                    else
                    {
                        c=n-p2;
                        n=n-c;
                        if(p1<n/2)
                        c=c+p1+1;
                        else
                        c=c+n-p1;
                        System.out.println(c);
                        continue;
                    }
                }
                else
                {
                    a=p1;
                    p1=p2;
                    p2=a;
                    if(p1+1<=n-p2)
                    {
                        c=p1+1;
                        p2=p2-c;
                        n= n-c;
                        if(p2>=n/2)
                        c=c+n-p2;
                        else
                        c=c+p2+1;
                        System.out.println(c);
                        continue;
                    }
                    else
                    {
                        c=n-p2;
                        n=n-c;
                        if(p1<n/2)
                        c=c+p1+1;
                        else
                        c=c+n-p1;
                        System.out.println(c);
                        continue;
                    }
                }
            }
        }
    }
}
