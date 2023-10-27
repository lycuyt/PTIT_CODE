/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
class SinhVien{
    private String ten , ma, dt ;
    private int kv;
    private float diem;
    public static  int num= 1;

    public SinhVien() {
        
    }

    public String getMa() {
        return ma;
    }

    public SinhVien(String ten,  float diem,String dt, int kv ) {
        this.ten = chuanhoa(ten);
        this.ma = String.format("TS%02d", num++);
        this.dt = dt;
        this.kv = kv;
        this.diem = diem;
    }
    private String chuanhoa(String s)
    {
        String res ="";
        String[]a = s.trim().split("\\s+");
        for (int i = 0; i < a.length; i++) {
            res+=a[i].substring(0,1).toUpperCase() + a[i].substring(1).toLowerCase()+" ";
        }
        return res.substring(0, res.length() -1);
    }
    public float getDiem(){
        float ut = 0;
        if(kv == 1) ut +=1.5f;
        else if(kv == 2) ut+=1f;
        else kv += 3f;
        
        if(dt.equals("Kinh")) ut+=0;
        else ut+=1.5;
        return diem +ut;
    }
    public String XH(){
        if(getDiem()>=20.5f) return "Do";
        else return "Truot";
    }
    public String toString(){
        return ma +" "+ten+" "+String.format("%.1f", getDiem())+" "+XH();
    }
}
public class J07057_DiemTuyenSinh {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("THISINH.in"));
        List <SinhVien> a = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String ten = sc.nextLine();
            float diem = Float.parseFloat(sc.nextLine());
            String dt = sc.nextLine();
            int kv = Integer.parseInt(sc.nextLine());
            a.add(new SinhVien(ten,diem,dt,kv ));
        }
        a.sort(new Comparator<SinhVien>(){
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                if(o1.getDiem() == o2.getDiem()){
                    return o1.getMa().compareTo(o2.getMa());
                }
                return Float.compare(o2.getDiem(), o1.getDiem());
            }
            
            
            
        });
        for(SinhVien x : a){
            System.out.println(x);
        }
    }
}
