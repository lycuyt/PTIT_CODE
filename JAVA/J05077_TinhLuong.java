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
class Nhanvien{
    private String ma, ten;
    private int lcb, sn;
    
    public Nhanvien() {
    }

    public Nhanvien(String ma, String ten, int lcb, int sn) {
        this.ma = ma;
        this.ten = ten;
        this.lcb = lcb;
        this.sn = sn;
        
    }
    
    public int gethsl()
    {
        char c = ma.charAt(0);
        int nam = Integer.parseInt(ma.substring(1,3));
        if(c == 'A')
        {
            if(nam>=1 && nam<=3) return 10;
            if(nam<=8) return 12;
            if(nam<=15) return 14;
            else return 20;
        }else if(c=='B'){
            if(nam>=1 && nam<=3) return 10;
            if(nam<=8) return 11;
            if(nam<=15) return 13;
            else return 16;
        }else if(c=='C'){
            if(nam>=1 && nam<=3) return 9;
            if(nam<=8) return 10;
            if(nam<=15) return 12;
            else return 14;
        }else{
            if(nam>=1 && nam<=3) return 8;
            if(nam<=8) return 9;
            if(nam<=15) return 11;
            else return 13;
        }
    }
    
    public long getLuong()
    {
        return (long)(lcb*sn*gethsl()*1000);
    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public int getLcb() {
        return lcb;
    }

    public int getSn() {
        return sn;
    }
    
}
class phongban{
    private String ma, ten;

    public phongban() {
    }

    public phongban(String ma, String ten) {
        this.ma = ma;
        this.ten = ten;
    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }
    
}
class BangLuong{
    private List<Nhanvien> arr;
    private List<phongban> brr;

    public BangLuong() {
    }

    public BangLuong(List<Nhanvien> arr, List<phongban> brr) {
        this.arr = arr;
        this.brr = brr;
    }
    
    public void intheophongban(String tmp)
    {
        System.out.print("Bang luong phong ");
        for(phongban i : brr)
        {
            if(i.getMa().equals(tmp)){
                System.out.println(i.getTen()+":");
                break;
            }
        }
        for(Nhanvien i: arr)
        {
            if(i.getMa().substring(3).equals(tmp)){
                System.out.println(i.getMa()+" "+i.getTen()+" "+i.getLuong());
            }   
        }
    }
}
public class J05077_TinhLuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List <phongban> arr = new  ArrayList<>();
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            String ma = s.trim().substring(0, 2);
            String ten = s.trim().substring(3);
            arr.add(new phongban(ma, ten));
        }
        
        int m = Integer.parseInt(sc.nextLine());
        List<Nhanvien> brr = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            int lcb = Integer.parseInt(sc.nextLine());
            int sn = Integer.parseInt(sc.nextLine());
            brr.add(new Nhanvien(ma, ten, lcb, sn));
        }
        String tmp = sc.nextLine();
        BangLuong a = new BangLuong(brr, arr);
        a.intheophongban(tmp);
    }
}
/*
2
HC Hanh chinh
KH Ke hoach Dau tu
2
C06HC
Tran Binh Minh
65
25
D03KH
Le Hoa Binh
59
24
KH
*/