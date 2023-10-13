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
public class J02011_SapXepChon {
   public static void slove(int n, int a[])
    {
        for(int i=0;i<n-1;i++)
        {
            System.out.print("Buoc "+(i+1)+": ");
            int min_idx=i;
            for(int j=i+1;j<n;j++)
            {
                if(a[j]<a[min_idx])
                {
                    min_idx=j;
                }
            }
            int tmp= a[i];
            a[i]=a[min_idx];
            a[min_idx]=tmp;
            for(int l=0;l<n;l++)
            {
                System.out.print(a[l]+" ");
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
