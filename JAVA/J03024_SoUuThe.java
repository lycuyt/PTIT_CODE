import java.util.Scanner;

public class J03024_SoUuThe {
    public static void slove(String s)
    {
        for (int i=0;i<s.length();i++)
        {
            if(s.charAt(i) <'0' || s.charAt(i)>'9'){
                System.out.println("INVALID");
                return;
            }
        }
        if(s.length()%2==1)
        {
            System.out.println("NO");
            return;
        }
        int chan=0,le=0;
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            int tmp= c-'0';
            if(tmp%2==1){
                le++;
            }else{
                chan++;
            }
        }
        if(chan>le){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc .nextInt();
        while(t-->0)
        {
            String s= sc.next();
            slove(s);
        }
    }
}
