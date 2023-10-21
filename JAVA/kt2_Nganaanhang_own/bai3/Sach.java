/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai3;

import java.io.Serializable;
import java.util.StringTokenizer;

/**
 *
 * @author Admin
 */
public class Sach extends TaiLieu implements ITaiLieu, Serializable{
    private String TenTG, tenSach;
    private int soTrang;

    public Sach() {
    }

    public Sach(String ma, String tenNXB, int soBanPH,String TenTG, String tenSach, int soTrang) {
        super(ma, tenNXB, soBanPH);
        this.TenTG = TenTG;
        this.tenSach = tenSach;
        this.soTrang = soTrang;
    }

    public String getTenTG() {
        return TenTG;
    }

    public String getTenSach() {
        return tenSach;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setTenTG(String TenTG) {
        this.TenTG = TenTG;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }
    
    @Override
    public String getCode() {
        String c = getMa().toUpperCase();
        StringTokenizer s = new StringTokenizer(tenSach.trim().toUpperCase());
        while(s.hasMoreTokens()){
            c+=s.nextToken().charAt(0);
        }
        return c;
    }
    public String toString()
    {
        return getMa() + "\t" + tenSach +"\t" + TenTG +"\t"+soTrang+"\t" +getTenNXB() +"\t" +getSoBanPH();
    }
    
}
