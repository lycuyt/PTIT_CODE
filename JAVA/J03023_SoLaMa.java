
import java.util.Scanner;

public class J03023_SoLaMa {
    public static int change(char  a)
    {
        if(a == 'I') return 1;
            else if(a == 'V') return 5;
            else if(a == 'X') return 10;
            else if(a == 'L') return 50;
            else if(a == 'C') return 100;
            else if (a =='D') return 500;
            else return 1000;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {

            String s = sc.next();
            int i =s.length()-1;
            long sum = change(s.charAt(i));
            i--;
            while(i>=0)
            {
                char c = s.charAt(i);
                char d = s.charAt(i+1);
                if((change(c) == 1  && (change(d) == 5 || change(d) == 10)) || (change(c) == 10  && (change(d) == 50 || change(d) == 100)) || (change(c) == 100  && (change(d) == 500 || change(d) == 1000)))
                {
                    sum -= change(c);
                }else{
                    sum+=change(c);
                }
                i--;
            }
            System.out.println(sum);
        }
    }
}
