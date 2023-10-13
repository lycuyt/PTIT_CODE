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
public class J02008_BoiSoNhoNhatCua_N_SoNguyenDuongDauTien {
    public static Scanner ip= new Scanner(System.in);
    public static long gcd(long a, long b)
    {
        long r;
        while(b!=0)
        {
            r=a%b;
            a=b;
            b=r;
        }
        return a;
    }
    public static long bcnn(long a, long b)
    {
        return (a*b)/gcd(a,b);
    }
    public static void main(String[] args) {
        int t= ip.nextInt();
        while(t-->0)
        {
            int n= ip.nextInt();
            long k=1;
            for(int i=1;i<=n;i++)
            {
                k=bcnn(i,k);
            }
            System.out.println(k);
            
        }
    }
}
