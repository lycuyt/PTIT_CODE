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
public class J01024_SoTamPhan {
    public static Scanner ip = new Scanner (System.in);
    public static void testcase(String s)
    {
        for(int i=0;i<s.length();i++)
        {
            char c= s.charAt(i);
            if(c != '0' && c != '1' && c != '2'){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
    public static void main(String[] args) {
        int t = ip.nextInt();
        while(t-->0)
        {
            String s= ip.next();
            testcase(s);
        }
    }
}
