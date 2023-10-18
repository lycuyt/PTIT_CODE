/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chuvitamgiac;

/**
 *
 * @author Lycuy
 */
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t= sc.nextInt();
        while(t-->0)
        {
            toado[] a= new toado[3];
            for (int i=0;i<3;i++)
            {
                double x = sc.nextDouble();
                double y= sc.nextDouble();
                a[i]=new toado(x, y);
            }
            double m= a[0].distance(a[1]);
            double n= a[1].distance(a[2]);
            double p = a[2].distance(a[0]);
            if(n+m> p && n+p>m && m+p>n){
                System.out.printf("%.3f", n+m+p);
                System.out.println();
            }else{
                System.out.println("INVALID");
            }
        }
    }
}
