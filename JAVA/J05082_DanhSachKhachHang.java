/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
class KhachHang implements  Comparable<KhachHang>{
    private  String ten, gt, ns, dc;
    Date n1;
    public static int num = 1;
    private String ma ;
    private SimpleDateFormat  f = new SimpleDateFormat("dd/MM/yyyy");

    public KhachHang() {
    }

    public KhachHang(String ten, String gt, String ns, String dc) throws ParseException{
        this.ten = chuanhoa(ten);
        this.gt = gt;
        this.ns = f.format(f.parse(ns));
        this.dc = dc;
        this.ma = String.format("KH%03d", num++);
        this.n1 = f.parse(this.ns);
       
    }
    public String chuanhoa(String s)
    {
        String [] a = s.trim().split("\\s+");
        String res ="";
        for (int i =0;i<a.length;i++){
            res+=a[i].substring(0,1).toUpperCase() + a[i].substring(1).toLowerCase()+" ";
        }
        return res.substring(0, res.length()-1);
    }

    @Override
    public int compareTo(KhachHang o) {
       return Long.compare(this.n1.getTime(), o.n1.getTime());
    }
    public String toString()
    {
        return ma + " " + ten +" "+gt+ " " + dc +" "+ ns ;
    }
    
}
public class J05082_DanhSachKhachHang {
    public static void main(String[] args) throws ParseException{
        Scanner sc = new Scanner(System.in);
        int n =  Integer.parseInt(sc.nextLine());
        List<KhachHang> k = new ArrayList<>();
        for(int i = 0;i<n;i++)
        {
            k.add(new KhachHang(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(k);
        for(KhachHang i : k)
        {
            System.out.println(i);
        }
    }
}
/*
2
 nGuyen VAN     nAm
Nam
12/12/1997
Mo Lao-Ha Dong-Ha Noi
 TRan    vAn     biNh
Nam
14/1/1995
Phung Khoang-Nam Tu Liem-Ha Noi
*/