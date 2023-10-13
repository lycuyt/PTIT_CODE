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
public class J01016_ChuSo4vaChuSo7 {
    public static Scanner ip= new Scanner(System.in);
    public static boolean issum(String s)
    {
        int dem4=0;
        int dem7=0;
        for(int i=0;i<s.length();i++)
        {
            char c= s.charAt(i);
            if(c=='4') dem4++;
            if(c=='7') dem7++;
        }
        if(dem4+dem7==7 || dem4+dem7==4) return true;
        else return false;
    }
    public static void testcase()
    {
        String s= ip.next();
        if(issum(s)) System.out.println("YES");
        else System.out.println("NO");
    }
    public static void main(String[] args) {
        testcase();
        
    }
}
