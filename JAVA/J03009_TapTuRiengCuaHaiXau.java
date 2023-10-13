import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
public class J03009_TapTuRiengCuaHaiXau {
    public static Scanner ip= new Scanner(System.in);
    public static void testcase()
    {
        String s1= ip.nextLine();
        // ip.nextLine();
        String s2= ip.nextLine();
        String [] a= s1.split("\\s+");
        String [] b= s2.split("\\s+");
        HashSet<String> res= new HashSet<String>(); 
        for (int i=0;i<a.length;i++)
        {
            String s= a[i];
            // System.out.println(s);
            int kt=0;
            for (int j=0;j<b.length;j++)
            {
                boolean areEqual = s.equals(b[j]);
                if(areEqual){
                    kt=1;
                    break;
                }
            }
            // ko tim thay trong b
            // System.out.println(kt);
            if(kt==0)
            {
                res.add(s);
            }
        }
        // Collections.sort(res);
        for (String s: res)
        {
            System.out.print(s+" ");
        }
        System.out.println();

    }
    public static void main(String[] args) {
        int t= ip.nextInt();
        ip.nextLine();
        while(t-->0)
        {
            testcase();
        }
    }
}
