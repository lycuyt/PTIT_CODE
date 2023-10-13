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
public class J01026_SoChinhPhuong {
    public static Scanner ip= new Scanner ( System.in);
    public static void testcase()
    {
        long n = ip.nextLong();
        long m= (long)Math.sqrt(n);
        if(m*m==n){
            System.out.println("YES");
            return;
        }
        System.out.println("NO");
    }
    public static void main(String[] args) {
        int t = ip.nextInt();
        while(t-->0)
        {
            testcase();
        }
    }
}
