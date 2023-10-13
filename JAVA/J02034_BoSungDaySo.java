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
public class J02034_BoSungDaySo {
    public static Scanner ip= new Scanner ( System.in);
    public static int[] a= new int [105];
    public static int[] d= new int [205];
    public static void slove()
    {
        int maxx=0;
        int n= ip.nextInt();
        for (int i=0;i<n;i++)
        {
            a[i]= ip.nextInt();
            if (maxx<a[i]) maxx= a[i];
            d[a[i]]=1;
        }
        int kt=0;
        for (int i=1;i<=maxx;i++)
        {
            if (d[i]==0) {
                System.out.println(i);
                kt=1;
            }
        }
        if (kt==0) System.out.println("Excellent!");
        
    }
    public static void main(String[] args) {
        slove();
    }
    
}
