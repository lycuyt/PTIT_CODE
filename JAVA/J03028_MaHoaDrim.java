import java.util.Scanner;

public class J03028_MaHoaDrim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            String s = sc.next();
            String a = s.substring(0, s.length()/2);
            String b = s.substring(s.length()/2);
            // System.out.println(a);
            // System.out.println(b);
            String res ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            // System.out.println(res.length());

            int sum1 =0;
            int sum2 =0;
            for(int i=0;i<a.length();i++)
            {
                sum1 += a.charAt(i) - 65;
            }
            for(int i=0;i<b.length();i++)
            {
                sum2 += b.charAt(i) - 65;
            }
            String ans ="";
            for(int i= 0;i<a.length();i++)
            {
                int k = (a.charAt(i) + sum1 -65) %26;
                ans += res.charAt(k);
            }
            // System.out.println(ans);
            a = ans;
            ans ="";
            for(int i= 0;i<b.length();i++)
            {
                int k = (b.charAt(i) + sum2 -65) %26;
                ans += res.charAt(k);
            }
            // System.out.println(ans);
            b = ans;
           
            ans ="";
            for(int i=0;i<a.length();i++)
            {
                int k = (a.charAt(i)-65 + b.charAt(i) -65) %26;
                ans += res.charAt(k);
            }
            System.out.println(ans);
        }
    }
}
