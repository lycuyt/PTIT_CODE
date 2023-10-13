import java.util.Scanner;
public class J03006_SoDep1 {
    public static Scanner ip = new Scanner(System.in);
    public static Boolean check(String s)
    {
        for (int i=0;i<s.length()/2;i++)
        {
            char a= s.charAt(i);
            char b=s.charAt(s.length()-i-1);
            if ( a!= b) return false;
            
        }
        for (int i=0;i<s.length();i++)
        {
            char a= s.charAt(i);
            int k= a-'0';
            if(k%2==1) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int t= ip.nextInt();
        while(t-->0)
        {
            String s= ip.next();
            if(check(s)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
