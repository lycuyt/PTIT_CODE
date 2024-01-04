/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
class sinhvien {
    private String msv, ten, lop, email;

    public sinhvien() {
    }

    public sinhvien(String msv, String ten, String lop, String email) {
        this.msv = msv;
        this.ten = chuanhoa(ten);
        this.lop = lop;
        this.email = email;
    }
    public String chuanhoa(String s)
    {
        String [] a = s.trim().split("\\s+");
        String res ="";
        for (int i =0;i<a.length;i++){
            res+=a[i].substring(0,1).toUpperCase() + a[i].substring(1).toLowerCase()+" ";
        }
        return res.substring(0, res.length()-1);
    }
    public String getMsv() {
        return msv;
    }

    public String getTen() {
        return ten;
    }

    public String getLop() {
        return lop;
    }

    public String getEmail() {
        return email;
    }

   public String toString()
   {
       return msv +" "+ten+" "+lop;
   }
    
}
class Doanhnghiep{
    private String ma, ten;
    private int sl;
    public Doanhnghiep() {
    }

    public Doanhnghiep(String ma, String ten, int sl) {
        this.ma = ma;
        this.ten = ten;
        this.sl = sl;
    }

    public int getSl() {
        return sl;
    }

    

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }
    
}
class thuctap {
    private Doanhnghiep dn;
    private sinhvien sv;

    public thuctap() {
    }

    public thuctap(Doanhnghiep dn, sinhvien sv) {
        this.dn = dn;
        this.sv = sv;
    }

    public Doanhnghiep getDn() {
        return dn;
    }

    public sinhvien getSv() {
        return sv;
    }
    
    
    
}
public class J07038_DanhSachThucTap_3 {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc1 = new Scanner(new File("SINHVIEN.in"));
        Scanner sc2 = new Scanner(new File("DN.in"));
        Scanner sc3 = new Scanner(new File("THUCTAP.in"));
        
        int n = Integer.parseInt(sc1.nextLine());
        List<sinhvien> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String msv = sc1.nextLine();
            String ten = sc1.nextLine();
            String lop = sc1.nextLine();
            String mail = sc1.nextLine();
            arr.add(new sinhvien(msv, ten, lop, mail));
        }
        
        int m = Integer.parseInt(sc2.nextLine());
        List<Doanhnghiep> brr = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            String ma = sc2.nextLine();
            String ten = sc2.nextLine();
            
            int sl = Integer.parseInt(sc2.nextLine());
            brr.add(new Doanhnghiep(ma, ten, sl));
        }
        int p = Integer.parseInt(sc3.nextLine());
        List<thuctap> crr = new ArrayList<>();
        for (int i = 0; i < p; i++) {
            String[] tmp = sc3.nextLine().split("\\s+");
            String msv = tmp[0];
            String mdn = tmp[1];
            for(sinhvien x : arr)
            {
                if(x.getMsv().equals(msv)){
                    for(Doanhnghiep y : brr){
                        if(y.getMa().equals(mdn)){
                            crr.add(new thuctap(y, x));
                        }
                    }
                }
            }
        }

        Collections.sort(crr, new Comparator<thuctap> ()
        {
            @Override
            public int compare(thuctap o1, thuctap o2) {
                return o1.getSv().getMsv().compareTo(o2.getSv().getMsv());
            }
            
        });
        int q = Integer.parseInt(sc3.nextLine());
        while(q-->0)
        {
            String madn = sc3.nextLine();
            String groupName = "";
            Integer amount = 0;
            for (Doanhnghiep gr : brr)
                if (gr.getMa().equals(madn)) {
                    amount = gr.getSl();
                    groupName = gr.getTen();
                    break;
                }
            System.out.println(String.format("DANH SACH THUC TAP TAI %s:", groupName));
            for (thuctap in : crr) {
                if (in.getDn().getMa().equals(madn)) {
                    System.out.println(in.getSv());
                    amount--;
                }
                if (amount == 0)    break;
            }
        }
    }
}
