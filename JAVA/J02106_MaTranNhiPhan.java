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
public class J02106_MaTranNhiPhan {
    public static Scanner ip = new Scanner (System.in);
    public static void testcase()
    {
        int n= ip.nextInt();
        int[][] a= new int[n][3];
        for (int i=0;i<n;i++)
        {
            for (int j=0;j<3;j++)
            {
                a[i][j]=ip.nextInt();
            }
        }
        int cnt=0;
        for(int i=0;i<n;i++)
        {
            int d1=0;
            int d0=0;
            for(int j=0;j<3;j++)
            {
                if(a[i][j]==1) d1++;
                else d0++;
            }
            if (d1>d0) cnt++;
        }
        System.out.println(cnt);
        
    }
    public static void main(String[] args) {
        testcase();
    }
}
