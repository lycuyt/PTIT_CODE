/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dientichtamgiac;

/**
 *
 * @author Lycuy
 */
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
public class tamgiac {
    private double x, y;
    public tamgiac(){
        
    }

    public tamgiac(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public tamgiac(tamgiac p){
        this.x= p.x;
        this.y= p.y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    public double distance(tamgiac p){
        return sqrt(pow(this.x- p.x, 2)+ pow(this.y-p.y, 2));
    }
    public double distance(tamgiac a, tamgiac b)
    {
        return sqrt(pow(a.x- b.x, 2)+ pow(a.y-b.y, 2));
    }
    
}
