/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class QLTV implements ChucNang{
    private List<TaiLieu> list ;
    private Scanner sc = new Scanner(System.in);
    public QLTV() {
        list = new ArrayList<>();
    }

    public void setList(List<TaiLieu> list) {
        this.list = list;
    }

    
    
    // tim vi tri cua 1 ma
    private int timViTri(String ma)
    {
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getMa().toUpperCase().equalsIgnoreCase(ma)){
                return i;
            }
        }
        return -1;
    }
    //nhap tai lieu
    private TaiLieu nhap()
    {
        
        String ma, tenNXB;
        int soPH;
        String re = "^[ABCD][1]\\d{3}";// bat dau bang abcd va co 1 ki tu , sau do den 3 so
        while (true) {            
            try {
                System.out.print("ma");
                ma = sc.nextLine().toUpperCase();
                if(timViTri(ma)== -1 && ma.matches(re)){
                    break;
                }else{
                    throw new VailidException("Ma bi trung hoac khong dung dinh dang");
                }
            } catch (VailidException e) {
                System.err.println(e);
            }
        }
        System.out.print("ten NXB");
        tenNXB = sc.nextLine();
        while(true){
            try {
                System.out.print("so ban PH");
                soPH = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.err.println(e);
            }
        }
        return(new TaiLieu(ma, tenNXB, soPH)) ;
    }
    @Override
    public void nhapSach() {
        TaiLieu t = nhap();
        // ten tg , ten sach , so trang
        String tenTG , tenSach;
        int soTrang;
        System.out.print("ten TG: ");
        tenTG = sc.nextLine();
        System.out.print("tenSach : ");
        tenSach = sc.nextLine();
        soTrang = Integer.parseInt(sc.nextLine());
        list.add(new Sach(t.getMa(), t.getTenNXB(), t.getSoBanPH(), tenTG, tenSach, soTrang));
    }

    @Override
    public void nhapBao() {
        TaiLieu t = nhap();
        String ngay;
        String re = "\\d{1,2}/\\d{1,2}/\\d{4}";
        while (true) {            
            try {
                System.out.print("Ngay: ");
                ngay = sc.nextLine().toUpperCase();
                if( ngay.matches(re)){
                    break;
                }else{
                    throw new VailidException("ngay khong dung dinh dang");
                }
            } catch (VailidException e) {
                System.err.println(e);
            }
        }
        list.add(new Bao(t.getMa(), t.getTenNXB(),ngay, t.getSoBanPH()));
        
    }

    @Override
    public void hienthiDS() {
        for(TaiLieu i : list){
            System.out.println(i);
        }
        System.out.println("tong: " + list.size());
    }

    @Override
    public void luu(String fname) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void docra(String fname) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void xoa() {
        System.out.println("Nhap vao ma can xoa");
        String ma = sc.nextLine();
        int vt = timViTri(ma);
        if(vt == -1){
            System.out.println("Khong tim thay ma can xoa");
        }else{
            System.out.println("tai lieu can xoa: " + list.remove(vt));
            System.out.println("xoa thanh cong");
        }
    }

    @Override
    public void sua() {
        System.out.println("Nhap vao ma can sua");
        String ma = sc.nextLine();
        int vt = timViTri(ma);
        if(vt == -1){
            System.out.println("Khong tim thay ma can sua");
        }else{
            
        }
    }

    @Override
    public void timTheoTenSach() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void timBaoTuDenNam() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void sapxepsoBanPH() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void sapxepSachTheoTenTG() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void sapxepBao2TT() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void thongke1() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void thongke2() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
