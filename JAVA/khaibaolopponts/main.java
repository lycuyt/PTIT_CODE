/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package khaibaolopponts;

/**
 *
 * @author Lycuy
 */
import static java.lang.Math.*;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            phanso a = new phanso(x, y);
            x = sc.nextDouble();
            y = sc.nextDouble();
            phanso b = new phanso(x, y);
            System.out.printf("%.4f\n", a.distance(a, b));
        }
    }
}
