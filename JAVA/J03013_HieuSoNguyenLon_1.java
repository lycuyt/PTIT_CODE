import java.math.BigInteger;
import java.util.Scanner;

public class J03013_HieuSoNguyenLon_1 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int t=  ip.nextInt();
        while(t-->0)
        {
            BigInteger a= ip.nextBigInteger();
            BigInteger b= ip.nextBigInteger();
            // System.out.println(a.subtract(b).abs());
            int maxlen= Math.max(a.toString().length(), b.toString().length());
            String  c =a.subtract(b).abs().toString();
            while( c.length() < maxlen)
            {
                c='0'+c;
            }
            System.out.println(c);

        }
    }
}
