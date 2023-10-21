/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai3;

import java.io.Serializable;

/**
 *
 * @author Admin
 */
public class TaiLieu implements Serializable{
    private String  ma,tenNXB;
    private int soBanPH;

    public TaiLieu() {
    }

    public TaiLieu(String ma, String tenNXB, int soBanPH) {
        this.ma = ma;
        this.tenNXB = tenNXB;
        this.soBanPH = soBanPH;
    }

    public String getMa() {
        return ma;
    }

    public String getTenNXB() {
        return tenNXB;
    }

    public int getSoBanPH() {
        return soBanPH;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public void setTenNXB(String tenNXB) {
        this.tenNXB = tenNXB;
    }

    public void setSoBanPH(int soBanPH) {
        this.soBanPH = soBanPH;
    }
    
}
