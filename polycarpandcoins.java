import java.util.*;
public class polycarpandcoins {
    public static void main(String[] args)
    {
       Scanner in=new Scanner(System.in);
       int n=in.nextInt();
       int arr1[]=new int[n];
       int arr2[]=new int[n];
       for(int i=0;i<n;i++)
       {
        int p=in.nextInt();
        if(p%3==0)
        {
            arr1[i]=p/3;
            arr2[i]=p/3;
        }
        else if(p%3==1)
        {
            arr1[i]=p/3+1;
            arr2[i]=p/3;
        }
        else
        {
            arr1[i]=p/3;
            arr2[i]=p/3+1;
        }
       }
       for (int j=0; j<n;j++)
       {
        System.out.println(arr1[j]+" "+arr2[j]);
       }
    }
}
