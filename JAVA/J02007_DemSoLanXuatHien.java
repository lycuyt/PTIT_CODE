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
public class J02007_DemSoLanXuatHien {
    public static Scanner ip = new Scanner(System.in);
    public static int[] d= new int[100005];
    public static void testcase()
    {
        int n= ip.nextInt();
        int[] a= new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=ip.nextInt();
            d[a[i]]++;
        }
        for(int i=0;i<n;i++)
        {
            if(d[a[i]]>=1){
                System.out.println(a[i]+" xuat hien "+d[a[i]]+" lan");
                d[a[i]]=0;
            }
        }
    }
    public static void main(String[] args) {
        int t= ip.nextInt();
        for(int i=1;i<=t;i++)
        {
            System.out.println("Test "+i+":");
            testcase();
        }
    }
}
