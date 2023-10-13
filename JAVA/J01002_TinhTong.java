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
public class J01002_TinhTong {
    public static Scanner ip=new Scanner(System.in);
    public static void testcase(){
        long n= ip.nextLong();
        long s=n*(n+1)/2;
        System.out.println(s);
    }
    public static void main(String[] args) {
        int t= ip.nextInt();
        while(t-->0){
            testcase();
        }
    }
}
