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
class Hang{
    private String ma, ten , xeploai ;
    private long tongnhap, tongxuat;
    public Hang() {
    }

    public Hang(String ma, String ten, String xeploai) {
        this.ma = ma;
        this.ten = ten;
        this.xeploai = xeploai;
    }

    public void setTongnhap(long tongnhap) {
        this.tongnhap += tongnhap;
    }

    public void setTongxuat(long tongxuat) {
        this.tongxuat += tongxuat;
    }
    @Override
    public String toString()
    {
        return ma+" " + ten +" " + tongnhap + " " + tongxuat;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getXeploai() {
        return xeploai;
    }

    public void setXeploai(String xeploai) {
        this.xeploai = xeploai;
    }

    
    
    
}
class thongke{
    private String ma ;
    private int slnhap, dongianhap, slxuat;
     private long  dongiaxuat, gianhap, giaxuat;
    public thongke() {
    }

    public thongke(String ma, int slnhap, int dongianhap, int slxuat) {
        this.ma = ma;
        this.slnhap = slnhap;
        this.dongianhap = dongianhap;
        this.slxuat = slxuat;
        this.dongiaxuat = dongiaxuat;
        this.gianhap = dongianhap*slnhap;
        
    }
    
    public int getDongianhap() {
        return dongianhap;
    }

    public int getSlxuat() {
        return slxuat;
    }


    public void setDongiaxuat(long dongiaxuat) {
        this.dongiaxuat = dongiaxuat;
    }

    public void setGiaxuat(long giaxuat) {
        this.giaxuat = giaxuat;
    }
    
    public long getGiaNhap()
    {
        return this.gianhap;
    }
    public long getGiaXuat()
    {
        return this.giaxuat;
    }

    public String getMa() {
        return ma;
    }

    public int getSlnhap() {
        return slnhap;
    }

    public long getGiaxuat() {
        return giaxuat;
    }

    public void setDongianhap(int dongianhap) {
        this.dongianhap = dongianhap;
    }

    public long getDongiaxuat() {
        return dongiaxuat;
    }

    public void setGianhap(long gianhap) {
        this.gianhap = gianhap;
    }
    
    
}
public class J05076_NhapXuatHang {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        List <Hang> arr = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            arr.add(new Hang(sc.nextLine(), sc.nextLine(), sc.nextLine()));
            
        }
        int m = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < m; i++) {
            String s = sc.nextLine();
            String [] a = s.split("\\s+");
            thongke k = new thongke(a[0], Integer.parseInt(a[1]), Integer.parseInt(a[2]),Integer.parseInt(a[3]));
            for(Hang x : arr)
            {
                if(k.getMa().equals(x.getMa())){
                   
                    if(x.getXeploai().equals("A")){
                        k.setDongiaxuat(Math.round((double) k.getDongianhap()*1.08)); 
                    }else if( x.getXeploai().equals("B")){
                        k.setDongiaxuat(Math.round((double) k.getDongianhap()*1.05)); 
                        
                    }else{
                        k.setDongiaxuat(Math.round((double) k.getDongianhap()*1.02));  
                    }
                    k.setGiaxuat((long)(k.getDongiaxuat()*k.getSlxuat()));
                    x.setTongxuat(k.getGiaXuat());
                    x.setTongnhap(k.getGiaNhap());
                }
            }
        }
        for(Hang x : arr)
        {
            System.out.println(x);
        }
        
    }
}
/*
2 
A001
Tu lanh
A
P002
May giat
B
2
A001 500 100 300
P002 1000 1000 500
*/