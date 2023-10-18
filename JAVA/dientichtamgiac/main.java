/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dientichtamgiac;

/**
 *
 * @author Lycuy
 */
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        int t= sc. nextInt();
        while(t-->0)
        {
            tamgiac [] arr = new tamgiac[3];
            for (int i=0;i<3;i++)
            {
                double x = sc.nextDouble();
                double y = sc.nextDouble();
                arr[i]= new tamgiac(x, y);
            }
            double a= arr[0].distance(arr[1]);
            double b= arr[1].distance(arr[2]);
            double c= arr[2].distance(arr[0]);
            if( a+b> c && a+c > b && c+b>a ){
                double S = 1 / 4f * Math.sqrt((a + b + c) * (a + b - c) * (a - b + c) * (-a + b + c));
                double r = (a*b*c)/(4*S) ; 
                double dt =Math. PI * r*r;
                System.out.printf("%.3f\n", dt);
                
            }else{
                System.out.println("INVALID");
            }
        }
    }
}
