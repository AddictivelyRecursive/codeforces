import java.util.*;
public class obstacle {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++)
        {
            int x1=in.nextInt();
            int y1=in.nextInt();
            int x2=in.nextInt();
            int y2=in.nextInt();
            int x3=in.nextInt();
            int y3=in.nextInt();
            if((x1==x2 && x1==x3 && ((y1<y3 && y3<y2)||(y1>y3 && y3>y2)))||(y1==y2 && y1==y3 && ((x1<x3 && x3<x2)||(x1>x3 && x3>x2))))
            System.out.println(Math.abs(x2-x1)+Math.abs(y2-y1)+2);
            else
            System.out.println(Math.abs(x2-x1)+Math.abs(y2-y1));
        }
    }    
}
