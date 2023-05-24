import java.util.*;
public class div2A874 {
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=in.nextInt();
            String s=in.next();
            String arr[]=new String[n];
            int j,c,k=0;
            c=n-1;
            for(j=0;j<n-1;j++)
            {
                arr[j]=s.substring(j,j+2);
                for(k=j-1;k>=0;--k)
                {
                    if(arr[k].equals(arr[j]))
                    {
                        --c;
                        break;
                    }
                }
            }
            System.out.println(c);
            }
        }
    }