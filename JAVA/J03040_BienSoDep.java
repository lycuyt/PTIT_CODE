import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class J03040_BienSoDep {
    public static boolean check1(int[] a){
        for(int i=0;i<5-1;i++){
            if(a[i]>=a[i+1]) return false;
        }
       
        return true;
        
    }
    public static boolean check2(int [] a)
    {
        for(int i=0;i<5;i++){
            if(a[i]!=6 && a[i]!=8) return false;
        }
        return true;
    }
    public static boolean check3(int [] a)
    {
        return(a[0]==a[1] && a[0]==a[2] && a[3]==a[4]);
    }
    public static void testcase(String s)
    {
        int [] a= new int[5];
        a[0]=s.charAt(5)-'0';
        a[1]=s.charAt(6)-'0';
        a[2]=s.charAt(7)-'0';
        a[3]=s.charAt(9)-'0';
        a[4]=s.charAt(10)-'0';
        if(check1(a) || check2(a) || check3(a)) System.out.println("YES");
        else System.out.println("NO");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc .nextInt();
        while(t-->0)
        {
            String s = sc.next();
            testcase(s);
        }
    }
}
