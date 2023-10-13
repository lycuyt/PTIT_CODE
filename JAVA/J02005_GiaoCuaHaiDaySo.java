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
public class J02005_GiaoCuaHaiDaySo {
    public static Scanner ip = new Scanner (System.in);
    public static void main(String[] args) {
        int n= ip.nextInt();
        int m= ip.nextInt();
        int[] a= new int[n];
        int[] b= new int[m];
        int[] d= new int [1005];
        for(int i=0;i<n;i++){
            a[i]=ip.nextInt();
            d[a[i]]=1;
        }
        for(int i=0;i<m;i++){
            b[i]=ip.nextInt();
        }
        Arrays.sort(b);
        for(int i=0;i<m;i++){
           
            if(d[b[i]]==1){
                System.out.print(b[i] + " ");
                d[b[i]]=0;
            }
        }
//        for(int i=0;i<=1000;i++)
//        {
//            if (d[i]>=2) System.out.print(i + " ");
//            
//        }
        System.out.println();
    }

}
