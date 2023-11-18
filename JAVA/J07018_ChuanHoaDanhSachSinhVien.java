/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
class sv{
    private String ten, lop, ns, id;
    private float gpa;
    public static int num = 1;
    public sv() {
    }
    public static String chuanhoa(String s)
    {
        String[]a = s.trim().split("\\s+");
        String res ="";
        for (int i = 0; i < a.length; i++) {
            res+=a[i].substring(0,1).toUpperCase() + a[i].substring(1).toLowerCase()+" ";
        }
        return res;
    }
    public sv(String ten, String lop, String ns, float gpa) throws ParseException {
        
        this.id = String.format("B20DCCN%03d", num++);
        this.ten = chuanhoa(ten);
        this.lop = lop;
        this.gpa = gpa;
        SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy");
        this.ns = sdf.format(sdf.parse(ns));
    }
    
    @Override
    public String toString()
    {
        return id+" " + ten  + lop + " " + ns + " " + String.format("%.2f", gpa);
    }
}
public class J07018_ChuanHoaDanhSachSinhVien {
    public static void main(String[] args) throws FileNotFoundException,ParseException{
        Scanner sc = new Scanner (new File("SINHVIEN.in"));
        
        int n = Integer.parseInt(sc.nextLine());
        for(int i=0;i<n;i++)
        {
            String name = sc.nextLine();
            String clas = sc.nextLine();
            String birth = sc.nextLine();
            float gpa = Float.parseFloat(sc.nextLine());
            sv k = new sv(name, clas, birth, gpa);
            System.out.println(k);
        }
        
    }
}
