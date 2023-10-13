import java.util.Scanner;
public class J02022_SoXaCach {
    public static Scanner ip= new Scanner (System.in);
    public static int[] vs;
    public static int [] x;
    public static int n;
    public static void slove()
    {
        for(int i=1;i<n;i++)
        {
            if(Math.abs(x[i]-x[i+1])==1) {
                return;
            }
        }
        for(int i=1;i<=n;i++)
        {
            System.out.print(x[i]);
        }
        System.out.println();
    }
    public static void sinh( int i)
    {
        for (int j=1;j<=n;j++)
        {
            if( vs [j]==0)
            {
                vs[j]=1;
                x[i]=j;
                if(i==n)
                {
                    slove();
                }else{
                    sinh( i+1);
                }
                vs[j]=0;
            }
        }
    }
    public static void main(String[] args) {
        int t= ip.nextInt();
        while(t-->0){
            n= ip.nextInt();
            x= new int[n+1];
            vs = new int[n+1];
            for (int i=1;i<=n;i++) vs[i]=0;
            sinh(1);
        }
    }
}
