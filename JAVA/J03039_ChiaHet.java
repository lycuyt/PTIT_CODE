import java.math.BigInteger;
import java.util.Scanner;

public class J03039_ChiaHet {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            BigInteger a= sc.nextBigInteger();
            BigInteger b= sc.nextBigInteger();
            if(a.mod(b).toString().equals("0") || b.mod(a).toString().equals("0")){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }

}
