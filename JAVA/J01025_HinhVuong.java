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
import java.util.Arrays;
public class J01025_HinhVuong {
    public static Scanner ip = new Scanner(System.in);
    public static void main(String[] args) {
        int[] x= new int[4];
        int y[]= new int[4];
        for(int i= 0;i<4 ;i++)
        {
            x[i]=ip.nextInt();
            y[i]=ip.nextInt();
        }
        Arrays.sort(x);
        Arrays.sort(y);
        int a=Math.max(x[3]-x[0],y[3]-y[0]);
        System.out.println(a*a);
    }
}
