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
public class GiaiPhuongTrinhBacNhat {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        float a= ip.nextFloat();
        float b= ip.nextFloat();
        if(a == 0f){
            if(b == 0f){
                System.out.println("VSN");
            }else{
                System.out.println("VN");
            }
        }else{
            System.out.println(String.format("%.2f", -b / a));
        }
    }
}
