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
class monhoc{
    private String mamh, tenmh;
    private int tc;

    public monhoc() {
    }

    public monhoc(String mamh, String tenmh, int tc) {
        this.mamh = mamh;
        this.tenmh = tenmh;
        this.tc = tc;
    }

    public String getMamh() {
        return mamh;
    }

    public String getTenmh() {
        return tenmh;
    }

    public int getTc() {
        return tc;
    }
    
}
class lich{
    private String ma, mamh, tenmh;
    private int thu,kip;
    private String tengv, phong;
    public static int num = 1;
    public lich() {
    }

    public lich(String mamh, int thu, int kip, String tengv, String phong) {
        this.ma = String.format("HP%03d", num++);
        this.mamh = mamh;
        this.thu = thu;
        this.kip = kip;
        this.tengv = tengv;
        this.phong = phong;
        this.tenmh = tenmh;
    }

    public void setTenmh(String tenmh) {
        this.tenmh = tenmh;
    }
    
    public int getThu() {
        return thu;
    }

    public int getKip() {
        return kip;
    }

    public String getTengv() {
        return tengv;
    }

    public String getMa() {
        return ma;
    }

    public String getMamh() {
        return mamh;
    }
    
    public String toString()
    {
        return ma+" "+tenmh+" "+thu+" "+kip+" "+phong;
    }
}

public class J07074_LichGiangDayTheoMonHoc {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc1 = new Scanner(new File("MONHOC.in"));
        Scanner sc2 = new Scanner(new File("LICHGD.in"));
        List <monhoc> arr = new ArrayList<>();
        List <lich> brr = new ArrayList<>();
        int n = Integer.parseInt(sc1.nextLine());
        for (int i = 0; i < n; i++) {
            String ma = sc1.nextLine().trim();
            String ten = sc1.nextLine().trim();
            int tc = Integer.parseInt(sc1.nextLine().trim());
            arr.add(new monhoc(ma, ten, tc));
        }
        int m = Integer.parseInt(sc2.nextLine());
        for (int i = 0; i < m; i++) {
            String mamh = sc2.nextLine().trim();
            int thu = Integer.parseInt(sc2.nextLine().trim());
            int kip = Integer.parseInt(sc2.nextLine().trim());
            String tengv = sc2.nextLine().trim();
            String phong = sc2.nextLine().trim();
            brr.add(new lich(mamh, thu, kip, tengv, phong));
        }
        Collections.sort(brr, new Comparator<lich>()
        {
            @Override
            public int compare(lich o1, lich o2) {
                if(o1.getThu() == o2.getThu()){
                    if(o1.getKip()==o2.getKip()){
                        return o1.getTengv().compareTo(o2.getTengv());
                    }
                    return o1.getKip() - o2.getKip();
                }
                return o1.getThu() - o2.getThu();
            }
            
        });
        String ten = sc2.nextLine();
        
        for (lich y : brr)
        {
            for(monhoc x: arr)
            {
                if (y.getMamh().equals(x.getMamh())){
                    y.setTenmh(x.getTenmh());
                    break;
                }
            }
        }
        System.out.println("LICH GIANG DAY GIANG VIEN "+ten+":");
        for(lich x : brr)
        {
            if(x.getTengv().equals(ten)){
                System.out.println(x);
            }
        }
        
    }
}
