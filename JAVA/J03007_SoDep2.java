import java.util.Scanner;

public class J03007_SoDep2 {
    public static Scanner ip = new Scanner(System.in);
    public static Boolean check(String s)
    {
        for (int i=0;i<s.length()/2;i++)
        {
            char a= s.charAt(i);
            char b=s.charAt(s.length()-i-1);
            if ( a!= b) return false;
            
        }

        int statr= s.charAt(0)-'0';
        int end= s.charAt(s.length()-1)-'0';
        if(statr !=8 || end != 8) return false;

        int sum=0;
        for (int i=0;i<s.length();i++)
        {
            char a= s.charAt(i);
            int k= a-'0';
            sum+=k;
        }
        if(sum%10!=0) return false;
        else return true;
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
