/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
class XD{
    private String ma, hang;
    private int dongia, sl;
    private float thue;

    public XD() {
    }

    public XD(String ma, int sl) {
        this.ma = ma;
        this.sl = sl;
        
        String tmp = ma.substring(0,1);
        if(tmp.equals("X")){
            this.dongia = 128000;
            this.thue = 0.03f;
        }
        if(tmp.equals("D")){
            this.dongia = 11200;
            this.thue = 0.035f;
        }
        if(tmp.equals("N")){
            this.dongia = 9700;
            this.thue = 0.02f;
        }
        String end = ma.substring(ma.length()-2, ma.length());
        if(end.equals("BP")){
            this.hang = "British Petro";
        }
        if(end.equals("ES")){
            this.hang = "Esso";
        }
        if(end.equals("SH")){
            this.hang = "Shell";
        }
        if(end.equals("CA")){
            this.hang = "Castrol";
        }
        if(end.equals("MO")){
            this.hang = "Mobil";
        }
        
        if(end.equals("TN")){
            this.hang = "Trong Nuoc";
            this.thue = 0f;
        }
    }
    public float Thue()
    {
        return (sl * dongia *thue );
    }
    public float TT()
    {
        return sl*dongia + Thue();
    }
    @Override
    public String toString()
    {
        return ma +" "+ hang +" " + dongia+" " + (long)Math.round(Thue()) +" " +(long) Math.round(TT());
    }
    
}
public class J05067_QuanLyKhoXangDau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<XD> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String ma = sc.next();
            int sl = sc.nextInt();
            arr.add(new XD(ma, sl));
        }
        for(XD x: arr){
            System.out.println(x);
        }
    }
}
/*
3
N89BP 4500
D00BP 3500
X92SH 2600
*/