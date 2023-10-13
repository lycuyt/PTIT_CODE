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
public class J01022_XauNhiPhan {
    public static Scanner ip= new Scanner(System.in);
    public static long[] f= new long[100];
    public static void fibo()
    {
        f[1]=f[2]=1L;
        for(int i=3;i<100;i++)
        {
            f[i]=f[i-1]+f[i-2];
        }
    }
    public static char slove(int n, long k)
    {
        if(n==1) return '0';
        if(n==2) return '1';
        if(k<=f[n-2]) return slove(n-2,k);
        return slove(n-1,k- f[n-2]);
    }
    public static void main(String[] args) {
        fibo();
        int t= ip.nextInt();
        while(t-->0)
        {
            int n= ip.nextInt();
            long k= ip.nextLong();
            System.out.println(slove(n ,k));
        }
    }
}
