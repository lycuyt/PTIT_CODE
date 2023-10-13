import java.util.Scanner;

public class J03026_XauKhacNhauDaiNhat {
    public static boolean same(String a, String b)
    {
        if (a.length()!= b.length()) return false;
        for (int i=0;i<a.length();i++)
        {
            if(a.charAt(i) != b.charAt(i)) return false;
        }
        return true;
    }
    public static void slove(String a, String b)
    {
        if (same(a, b)) System.out.println("-1");
        else{
            if(a.length()>b.length()) System.out.println(a.length());
            else System.out.println(b.length());
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0)
        {
            String a = sc.next();
            String b= sc.next();
            slove(a, b);
        }
    }
}
