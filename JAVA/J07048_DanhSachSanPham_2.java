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
class sanpham{
    private String ma, ten;
    private int gia, bh;

    public sanpham() {
    }

    public String getMa() {
        return ma;
    }

    public int getGia() {
        return gia;
    }
    
    public sanpham(String ma, String ten, int gia, int bh) {
        this.ma = ma;
        this.ten = ten;
        this.gia = gia;
        this.bh = bh;
    }
    @Override
    public String toString()
    {
        return ma +" " + ten +" " + gia+" " + bh;
    }
}
public class J07048_DanhSachSanPham_2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("src/codeptit/SANPHAM.in"));
        int n = Integer.parseInt(sc.nextLine());
        List<sanpham> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            int sl = Integer.parseInt(sc.nextLine());
            int bh = Integer.parseInt(sc.nextLine());
            arr.add(new sanpham(ma, ten, sl, bh));
        }
        arr.sort(new Comparator<sanpham>(){
            @Override
            public int compare(sanpham o1, sanpham o2) {
                if(o1.getGia() == o2.getGia()){
                    return o1.getMa().compareTo(o2.getMa());
                }
                return o2.getGia() - o1.getGia();
            }
            
        });
        for(sanpham x : arr)
        {
            System.out.println(x);
        }
    }
}
