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
public class J0101_HinhChuNhat {
    public static void main(String[] args) {
        Scanner ip= new Scanner(System.in);
        int x= ip.nextInt();
        int y = ip.nextInt();
        
        if(x<=0 || y<=0){
            System.out.println(0);
        }else{
            System.out.println(2*(x+y)+" "+ x*y);
        }
    }
}
