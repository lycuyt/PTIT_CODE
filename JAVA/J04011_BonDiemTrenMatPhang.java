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
class Point3D{
    private int x, y, z;

    public Point3D() {
    }

    public Point3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public  static boolean check(Point3D a, Point3D b, Point3D c, Point3D d)
    {
        Point3D ab = new Point3D(b.x - a.x, b.y - a.y, b.z-a.z);
        Point3D ac = new Point3D(c.x - a.x, c.y - a.y, c.z-a.z);
        Point3D ad = new Point3D(d.x - a.x, d.y - a.y, d.z-a.z);
        Point3D abc = new Point3D(ab.y * ac.z - ab.z * ac.y, ab.z*ac.x - ab.x * ac. z, ab.x * ac.y - ab.y*ac.x);
        int s = abc.x * ad. x +abc.y *ad.y + abc.z*ad.z;
        return s == 0;
    }
}
public class J04011_BonDiemTrenMatPhang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
        Point3D p1 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
        Point3D p2 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
        Point3D p3 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
        Point3D p4 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
        
        if(Point3D.check(p1,p2,p3,p4)){
            System.out.println("YES");
        } else{
            System.out.println("NO");
        }
        }
    }
}
