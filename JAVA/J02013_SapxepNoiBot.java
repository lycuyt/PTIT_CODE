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
public class J02013_SapxepNoiBot {
    public static void slove(int n, int a[])
    {
        boolean kt=false;
        for(int i=0;i<n-1;i++)
        {
            kt=false;
            for(int j=0;j<n-i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    int tmp= a[j];
                    a[j]=a[j+1];
                    a[j+1]=tmp;
                    kt=true;
                }
                
            }
            if(kt==false) break;
            
            System.out.printf("Buoc %d: ",i+1);
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
