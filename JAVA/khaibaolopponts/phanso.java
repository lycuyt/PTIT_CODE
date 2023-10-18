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
public class phanso {
    private double x;
    private double y;
    public phanso(){
        
    }
    public phanso(double x, double y){
        this.x= x;
        this.y= y;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
//    double distance(phanso p) {
//        return sqrt(pow(this.x - p.x, 2) + pow(this.y - p.y, 2));
//    }
    double distance(phanso a, phanso b){
        return sqrt(pow(a.x - b.x, 2) + pow(a.y - b.y, 2));
    }
     @Override
    public String toString() {
        return x + " " + y;
    }
}
