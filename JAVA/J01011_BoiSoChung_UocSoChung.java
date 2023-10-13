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
public class J01011_BoiSoChung_UocSoChung {
    public static Scanner ip= new Scanner(System.in);
    public static long UCLN(long a, long b)
    {
        long tmp;
        while(b != 0)
        {
            tmp=a%b;
            a=b;
            b=tmp;
        }
        return a;
            
    }
    public static void testcase(){
        long a= ip.nextLong();
        long b= ip.nextLong();
        long x=UCLN(a, b);
        long y=(a*b)/x;
        System.out.println(y+" "+x);
    }
    public static void main(String[] args) {
        int t = ip.nextInt();
        while(t-->0)
        {
            testcase();
        }
    }
}
