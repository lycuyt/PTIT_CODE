/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai3;

import java.io.Serializable;
import java.util.Calendar;

/**
 *
 * @author Admin
 */
public class Bao extends TaiLieu implements ITaiLieu,Serializable{
    private String ngayPH;

    public Bao() {
    }

    public Bao( String ma, String tenNXB, String ngayPH, int soBanPH) {
        super(ma, tenNXB, soBanPH);
        this.ngayPH = ngayPH;
    }
    
    @Override
    public String getCode() {
        String c = getMa().toUpperCase() + ngayPH.substring(ngayPH.lastIndexOf("/")+1);// tim dau cach cuoi cung
        return c;
    }
    public int getNam()
    {
        int n;
        try{
            return Integer.parseInt(ngayPH.substring(ngayPH.lastIndexOf("/") + 1));
        }catch(NumberFormatException e){
            Calendar c = Calendar.getInstance();
            return c.get(Calendar.YEAR);
        }
    }
    public String toString()
    {
        return getMa()+"\t"+getTenNXB()+"\t"+ngayPH+"\t"+getSoBanPH();
    }
}
