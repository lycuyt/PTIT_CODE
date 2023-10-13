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
public class ChiaTamGiac {
    public static Scanner ip = new Scanner (System.in);
    
    public static void testcase()
    {
        int n, h;
        n= ip.nextInt();
        h= ip.nextInt();
        for(double i=1;i<=n-1;i++){
            System.out.printf("%.6f ", Math.sqrt(i / n) * h);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int t= ip.nextInt();
        while(t-->0)
        {
            testcase();
                    
        }
    }
}
