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
public class J02004_MangDoiXung {
    
    public static Scanner ip = new Scanner ( System.in);
    public static void testcase()
    {
        int n= ip.nextInt();
        long[] a= new long[105];
        for(int i=0;i<n;i++)
        {
            a[i]=ip.nextLong();
        }
        for(int i=0;i<n/2;i++)
        {
            if(a[i] != a[n-i-1]){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
        
    }
    public static void main(String[] args) {
        int t= ip.nextInt();
        while(t-->0)
        {
            testcase();
        }
    }
}
