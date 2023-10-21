/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */


import java.util.Scanner;


public interface ChucNang {
    //5
    public void nhapGDVang(Scanner in);
    public void nhapGDTT(Scanner in);
    public void out();
    public void xoa(String ma);
    //sua, xoa, timkiem, sap xep (de, kong kenh)
    public void suaVang(String ma,Scanner in);
    public void suaTT(String ma,Scanner in);
    // tim kiem
    public void timKiemTheoGia(double tu, double den);
    public void timTheoLoaiTien(String loai);// tim kiem tren tap tien te
    public void timTheoNam(String nam);
    // sap xep
    public void sapxepTheoMa();
    public void sapxepTheoGia();
    public void sapxepVangTheoSoluong();// giam dan
    public void sapxepGDVangTheoThanhTien();// tang dan
    
    //cau thong ke
    
}
