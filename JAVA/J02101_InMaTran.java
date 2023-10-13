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
public class J02101_InMaTran {
    public static Scanner ip= new Scanner (System.in);
    public static void slove()
    {
        int n= ip.nextInt();
        int[][] a= new int[105][105];
        for (int i=0;i<n;i++)
        {
            for (int j=0;j<n;j++)
            {
                a[i][j]=ip.nextInt();
            }
        }
        
        for (int i=0;i<n;i++)
        {
            // chan tu trai->phai
            // le tu phai -> trai
            if ( i%2==0){
                for(int j=0;j<n;j++){
                    System.out.print(a[i][j]+" ");
                }
            }
            
            if(i%2==1){
                for (int j=n-1;j>=0;j--)
                {
                    System.out.print(a[i][j]+" ");
                }
            }
            
        }
        System.out.println();
        
    }
    public static void main(String[] args) {
        int t=ip.nextInt();
        while(t-->0)
        {
            slove();
        }
    }
}
