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
public class J02012_SapXepChen {
    public static void slove(int n, int a[])
    {
        for(int i=0;i<n;i++)
        {
            int idx=i;
            while(idx>0 && a[idx]<a[idx-1])
            {
                int tmp= a[idx];
                a[idx]=a[idx-1];
                a[idx-1]=tmp;
                idx--;
            }
            System.out.printf("Buoc %d: ", i);
            for(int j=0;j<=i;j++)
            {
                System.out.print(a[j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner ip= new Scanner( System.in);
        int n= ip.nextInt();
        int[] a= new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=ip.nextInt();
        }
        slove(n, a);
        
    }
    
}
