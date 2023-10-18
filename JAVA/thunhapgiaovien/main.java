/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thunhapgiaovien;

/**
 *
 * @author Lycuy
 */
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String  a= sc.nextLine();
        String b= sc.nextLine();
        int c = sc.nextInt();
        teacher tc = new teacher(a, b, c);
        
        System.out.println(tc);
    }
}
