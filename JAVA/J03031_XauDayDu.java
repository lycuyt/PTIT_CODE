import java.util.Scanner;

public class J03031_XauDayDu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            String s = sc.next();
            int k = sc.nextInt();

            int [] a = new int [123];
            for(int i=0;i<s.length();i++){
                a[s.charAt(i)] ++;
            }
            int cnt =0;
            for(int i=0;i<123;i++)
            {
                if(a[i] >0)
                {
                    cnt ++;
                }
            }
            if(k+cnt>=26)
            {
                System.out.println("YES");

            }else{
                System.out.println("NO");
            }
        }
    }
}
