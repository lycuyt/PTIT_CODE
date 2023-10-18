/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package khiabaolophinhchunhat;

/**
 *
 * @author Lycuy
 */
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double x = sc .nextDouble();
        double y = sc.nextDouble();
        String z = sc.next();
        hinhchunhat a = new hinhchunhat(x, y, z);
        if (a.getWidth()<=0 || a.getHeight()<=0){
            System.out.print(" INVALID");
        }else{
            System.out.print((int)a.findPerimeter()+" ");
            System.out.print((int)a.findArea()+" ");
            String res = a.getColor().substring(0, 1).toUpperCase()+ a.getColor().substring(1).toLowerCase();

            System.out.print(res+"\n");
        }
        
        
    }
}
