import java.util.Scanner;

public class J02021_LietkeToHop_2 {
    public static Scanner ip= new Scanner(System.in);
    public static int cnt;
    public static void sinh(int n, int k, int x[], int i)
    {
        for(int j=x[i-1]+1;j<=n-k+i;j++)
        {
            x[i]=j;
            if(i==k)
            {
                cnt++;
                for (int l=1;l<=k;l++){
                    System.out.print(x[l]);
                }
                System.out.print(" ");
            }else{
                sinh(n, k, x, i+1);
            }
        }
    }
    public static void testcase()
    {
        int n= ip.nextInt();
        int k= ip.nextInt();
        int [] x= new int[k+5];
        cnt=0;
        x[0]=0;
        sinh(n, k, x, 1);

        System.out.printf("\nTong cong co %d to hop", cnt);
    }
    public static void main(String[] args) {
        testcase();
    }

}
