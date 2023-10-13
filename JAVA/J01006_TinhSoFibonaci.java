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
public class J01006_TinhSoFibonaci {
    public static Scanner ip = new Scanner ( System.in);
    public static long[] fibo= new long [100];
    public static void slove()
    {
        fibo[1]=fibo[2]=1L;
        for(int i=3;i<=92;i++)
        {
            fibo[i]=fibo[i-1]+fibo[i-2];
        }
    }
    public static void testcase()
    {
        int n= ip.nextInt();
        System.out.println(fibo[n]);
    }
    public static void main(String[] args) {
        slove();
        int t;
        t= ip.nextInt();
        while(t-->0){
                testcase();
        }
    }
}
