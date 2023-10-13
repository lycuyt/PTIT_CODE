import java.util.Scanner;

public class J03025_XauDoiXung {
    // chi ton tai 1 cap ki tu khac nhau
    public static void testcase(String s)
    {
        int cnt=0;
        for (int i=0;i<s.length()/2;i++)
        {
            if(s.charAt(i) != s.charAt(s.length()-i-1)) cnt++;
        }
        
        if(cnt == 1){
            System.out.println("YES");
        }else if( cnt ==0 ){
            if(s.length()%2==0) System.out.println("NO");
            else System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0)
        {
            String s = sc.next();
            testcase(s);
        }
    }
}
