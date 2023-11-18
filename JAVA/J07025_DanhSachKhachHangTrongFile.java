/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
class khachhang implements Comparable<khachhang>{
    private String ten, gt, ns, dc, ma;
    public static int num = 1;
    private Date thoigian;
    private long time ;
    public khachhang() {
    }

    public khachhang(String ten, String gt, String ns, String dc) throws ParseException{
        this.ma = String.format("KH%03d", num++);
        this.ten = chuanhoa(ten);
        this.gt = gt;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        this.ns = sdf.format(sdf.parse(ns));
        this.dc = dc;
        this.thoigian = sdf.parse(ns);
        this.time = this.thoigian.getTime();
    }
    public String chuanhoa(String s)
    {
        String res = "";
        String [] a = s.trim().split("\\s+");
        for (int i = 0; i < a.length; i++) {
            res += a[i].substring(0,1).toUpperCase() + a[i].substring(1).toLowerCase()+" ";
        }
        return res.substring(0, res.length() -1);
    }
    @Override
    public String toString()
    {
        return ma + " " + ten +" " + gt +" " + dc + " " + ns;
    }

    @Override
    public int compareTo(khachhang o) {
        return Long.compare(this.time, o.time);
    }
    
}
public class J07025_DanhSachKhachHangTrongFile {
    public static void main(String[] args) throws  FileNotFoundException, ParseException{
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        List <khachhang> list = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String ten = sc.nextLine();
            String gt = sc.nextLine();
            String ns = sc.nextLine();
            String dc = sc.nextLine();
            khachhang a = new khachhang(ten, gt, ns, dc);
            list.add(a);
            
        }
        Collections.sort(list);
        for(khachhang x : list)
        {
            System.out.println(x);
        }
        
    }
}
