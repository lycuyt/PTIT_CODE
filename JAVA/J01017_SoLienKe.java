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
public class J01017_SoLienKe {
    public static Scanner ip= new Scanner ( System.in);
    public static boolean check(String s)
    {
        for(int i=0;i<s.length()-1;i++){
            char a=s.charAt(i);
            char b=s.charAt(i+1);
            int n= a-'0';
            int m= b-'0';
            if(Math.abs(n-m)!=1) return false;
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
        while(t-->0)
        {
            testcase();
        }
    }
}
