import java.math.BigInteger;
import java.util.Scanner;

public class J03033_BoiChungNhoNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            BigInteger a= sc.nextBigInteger();
            BigInteger b= sc.nextBigInteger();
            BigInteger ucln = a.gcd(b);
            System.out.println(a.multiply(b).divide(ucln));
        }
    }
}
