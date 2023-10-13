/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
class DonHang implements Comparable<DonHang>{
    private String ten, ma;
    private int dg, sl;

    public DonHang() {
    }

    public DonHang(String ten, String ma, int dg, int sl) {
        this.ten = ten;
        this.ma = ma;
        this.dg = dg;
        this.sl = sl;
    }
    public String STT()
    {
        return ma.substring(1, 4);
    }
    public int GG()
    {
        if(ma.charAt(4) == '1') return (int)(dg * sl *0.5);
        return (int)( dg *sl * 0.3);
    }
    public int TT()
    {
        return (dg * sl) - GG();
    }
    @Override
    public String toString()
    {
        return ten +" " + ma + " " + STT() + " " +GG() +" " + TT();
    }

    @Override
    public int compareTo(DonHang o) {
        return this.STT().compareTo(o.STT());
    }
    
}
public class J05052_TraCuuDonHang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<DonHang> a= new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String ten = sc.nextLine();
            String ma = sc.nextLine();
            int dg = Integer.parseInt(sc.nextLine());
            int sl = Integer.parseInt(sc.nextLine());
            a.add(new DonHang(ten, ma, dg, sl));
        }
        Collections.sort(a);
        for(DonHang x : a)
        {
            System.out.println(x);
        }
    }
}
/*
3
Kaki 2
K0252
80000
15
Jean 1
J2011
200000
24
Jean 2
J0982
150000
12
*/