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
class SoPhuc{
    private int a, b;
    // tuong duong a + bi
    // voi i^2 = -1
    // (a+bi) + ( c + di) = (a+c) + (b+d) i
    
    

    public SoPhuc() {
    }

    public SoPhuc(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public SoPhuc tong(SoPhuc y){
        SoPhuc p = new SoPhuc();
        int n = a + y.a;
        int m = b + y.b;
        p = new SoPhuc(n, m);
        return p;
    }
    // (a + bi) * ( c + di ) = (ac - bd ) + (ad + bc) i
    public SoPhuc tich(SoPhuc y){
        SoPhuc p = new SoPhuc();
        int n = a * y.a - b*y.b;
        int m = a * y.b + b * y.a;
        p = new SoPhuc(n, m);
        return p;
    }
    @Override
    public String toString()
    {
        return a + " + " + b +"i";
    }
    
}
public class J04018_SoPhuc {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            
            SoPhuc n = new SoPhuc ( a, b);
            SoPhuc m = new SoPhuc ( c, d);
            
            SoPhuc p = n.tong(m);
            p = p.tich(n);
            System.out.print(p +", ");
            
            SoPhuc q = n.tong(m);
            q = q.tich(q);
            System.out.println(q);
             
        }
    }
}
/*
3
1 2 3 4
2 3 4 5
1 -2 5 -6
*/