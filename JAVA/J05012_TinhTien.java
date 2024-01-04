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
class Sanpham implements Comparable<Sanpham>{
    private String ma;
    private String ten;
    private long sl, dg, ck;
    public static int num = 1;
    public Sanpham() {
    }

    public Sanpham( String ma, String ten, long sl, long dg, long ck) {
        this.ma = ma;
        this.ten = ten;
        this.sl = sl;
        this.dg = dg;
        this.ck = ck;
    }
    public long TT()
    {
        return sl*dg - ck;
    }
    public String toString()
    {
        return ma + " " + ten +" " + sl + " " + dg +" " + ck +" " + TT();
    }

    @Override
    public int compareTo(Sanpham o) {
        return Long.compare(o.TT(), this.TT());
    }
}
public class J05012_TinhTien {
    public static void main(String[] args) throws NumberFormatException{
        Scanner sc = new Scanner (System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Sanpham> arr = new ArrayList<>();
        for(int i =0;i< n ;i++)
        {
            String ma= sc.nextLine();
             String ten = sc.nextLine();
            long sl = Long.parseLong(sc.nextLine());
            long dg = Long.parseLong(sc.nextLine());
            long ck = Long.parseLong(sc.nextLine());
            arr.add(new Sanpham(ma, ten, sl, dg, ck));
        }
        Collections.sort(arr);
        for(Sanpham i : arr)
        {
            System.out.println(i);
        }
    }
}
/*
3
ML01
May lanh SANYO
12
4000000
2400000
ML02
May lanh HITACHI
4
2550000000
0
ML03
May lanh NATIONAL
5
3000000
150000
*/
