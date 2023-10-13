/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

/**
 *
 * @author Lycuy
 */
import java.util.Scanner;
public class J01018_SoKhongLienKe {
    public static Scanner ip = new Scanner (System.in);
    public static boolean check(String s)
    {
        int sum=0;
        for(int i=0;i<s.length();i++)
        {
            int a = s.charAt(i)-'0';
            sum+=a;
        }
        if(sum%10 != 0) return false;
        for(int i=0;i<s.length()-1;i++)
        {
            int a= s.charAt(i)-'0';
            int b= s.charAt(i+1)-'0';
            if(Math.abs(a-b) != 2) return false;
        }
        return true;
    }
    public static void testcase()
    {
        String s= ip.next();
        if(check(s)) System.out.println("YES");
        else System.out.println("NO");
    }
    public static void main(String[] args) {
        int t= ip.nextInt();
        while(t-->0){
            testcase();
        }
    }
}
