import java.util.*;
public class dislike3
{
    public static void main( String args[])
    {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        int c=0,j;
        int arr[]=new int[t];
        for (int i=0;i<t;i++)
        {
            int n=in.nextInt();
                for(j=1;;j++)
                {
                  if(j%3==0)
                  continue;
                  else if(j%10==3)
                  continue;
                  else 
                  c++;
                  if(c==n)
                  break;
                }
            arr[i]=j;
            c=0;
        }
        for (int i=0;i<t;i++)
        System.out.println(arr[i]);
    }
}