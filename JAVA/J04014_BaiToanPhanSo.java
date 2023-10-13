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
class PhanSo{
    private long tu , mau;

    public PhanSo() {
    }

    public PhanSo(long tu, long mau) {
        this.tu = tu;
        this.mau = mau;
    }
    private long gcd ( long x, long y)
    {
        while( y != 0)
        {
            long z = x%y;
            x = y;
            y = z;
        }
        return x;
    }
    public void tinhc(PhanSo b){
        //(a+b)^2
        double a = Math.pow(tu * b.mau + mau* b.tu, 2);
        double c = Math.pow(mau * b. mau, 2);
        long g = gcd ((long) a, (long) c);
        System.out.print((long) a / g +"/" + (long) c / g) ;
        
    }
    public void tinhd(PhanSo b)
    {
        double a = Math.pow(tu * b.mau + mau* b.tu, 2) * tu * b.tu;
        double c = Math.pow(mau * b. mau, 2) * mau * b.mau;
        long g = gcd ((long) a, (long) c);
        System.out.print((long) a / g +"/" + (long) c / g) ;
    }
    
}
public class J04014_BaiToanPhanSo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            long d = sc.nextLong();
            
            PhanSo m = new PhanSo(a, b);
            PhanSo n = new PhanSo(c, d);
            m.tinhc(n);
            System.out.print(" ");
            m.tinhd(n);
            System.out.println();
        }
    }
}
/*
2
1 2 3 4
2 3 4 5
*/