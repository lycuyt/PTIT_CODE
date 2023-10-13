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
class MaHang implements Comparable<MaHang>{
    private String ma;
    private int sl;

    public MaHang() {
    }

    public MaHang(String ma, int sl) {
        this.ma = ma;
        this.sl = sl;
        
    }

    public String getMa() {
        return ma;
    }
    
    public int getXuat()
    {
        if(ma.substring(0, 1).equals("A")) return Math.round((float) ( 0.6 * sl));
        return Math.round((float) (0.7 * sl));
    }
    public int getDG()
    {
        if(ma.charAt(4) == 'Y') return 110000;
        return 135000;
    }
    public int Tien()
    {
        return getXuat() * getDG();
    }
    public int getThue()
    {
        if(ma.charAt(0) == 'A' && ma.charAt(4) == 'Y')  return (int)(0.08 * Tien());
        if(ma.charAt(0 ) == 'A' && ma.charAt(4) == 'N')  return (int)(0.11 * Tien());
        if(ma.charAt(0 ) == 'B' && ma.charAt(4) == 'Y')  return (int)(0.17 * Tien());
         return (int)(0.22 * Tien());
    }
    @Override
    public String toString()
    {
        return ma + " " + sl + " " + getXuat()+" " + getDG() + " " + Tien() + " " + getThue();
    }

    @Override
    public int compareTo(MaHang o) {
        return -(this.getThue() - o.getThue());
    }
}
public class J05048_BangTheoDoiNhapXuatHang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<MaHang> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String ma  = sc.nextLine();
            int sl = Integer.parseInt(sc.nextLine());
            MaHang x = new MaHang(ma, sl);
            a.add(x);
        }
        Collections.sort(a);
        String s = sc.nextLine();
        for(MaHang x : a){
            if(x.getMa().substring(0, 1).equals(s)){
                System.out.println(x);
            }
        }
    }
}
/*
3
A001Y
1000
B012N
2500
B003Y
4582
B
*/
