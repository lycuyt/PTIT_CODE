/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
class Point{
    private double x, y;

    public Point() {
    }
    
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public  static Point nextPoint(Scanner sc )
    {
        return new Point(sc.nextDouble(), sc.nextDouble());
    }
    public double distance ( Point a)
    {
        double k = Math.sqrt((x - a.x) * (x-a.x) + (y - a.y) * (y-a.y));
        return k;
    }
    
}
class Triangle{
    private Point a, b, c;

    public Triangle() {
    }

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public boolean valid()
    {
        double ab = a.distance(b);
        double ac = a.distance(c);
        double bc = b.distance(c);
        
        if (ab + ac > bc && ab + bc > ac && bc + ac > ab){
            return true;
        }else{
            return false;
        }
    }
    public String getPerimeter()
    {
        double ab = a.distance(b);
        double ac = a.distance(c);
        double bc = b.distance(c);
        return String.format("%.3f", ab + bc + ac);
    }
    
}
public class J04019_LopTriagle1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            Triangle a = new Triangle(Point.nextPoint(sc), Point.nextPoint(sc), Point.nextPoint(sc));
            if(!a.valid()){
                System.out.println("INVALID");
            } else{
                System.out.println(a.getPerimeter());
            }
        }
        
    }
}
/*
3
0 0 0 5 0 199
1 1 1 1 1 1
0 0 0 5 5 0
*/