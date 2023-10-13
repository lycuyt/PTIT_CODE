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
class SV{
    private String ma, ten, lop;
    private int cc ;
    private String ghichu;
    public SV() {
    }

    public SV(String ma, String ten, String lop) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public void setGhichu(String ghichu) {
        this.ghichu = ghichu;
    }

    public String getMa() {
        return ma;
    }

    public String getLop() {
        return lop;
    }
    
    @Override
    public String toString()
    {
        return ma + " " + ten +" " +lop + " " + cc +" " +ghichu;
    }
}

public class J05074_DiemDanh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<SV> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            String lop = sc.nextLine();
            list.add(new SV(ma, ten, lop));
        }
        for (int i = 0; i < n; i++) {
            String ma = sc.next();
            String dd = sc.next();
            int cc = 10;
            for (int j = 0; j < dd.length(); j++) {
                char c = dd.charAt(j);
                if(c == 'v') cc = cc-2;
                if(c == 'm') cc = cc -1;
            }
            if(cc<=0) cc = 0;
            String gc ="" ;
            if(cc == 0) gc ="KDDK";
            for(SV x : list)
            {
                if(x.getMa().equals(ma)){
                    x.setCc(cc);
                    x.setGhichu(gc);
//                    System.out.println(x);
                    break;
                    
                }
            }
        }
        String lop = sc.next();
        for(SV x : list){
            if(x.getLop().equals(lop)){
                System.out.println(x);
            }
            
        }
    }
}
/*
3
B19DCCN999
Le Cong Minh
D19CQAT02-B
B19DCCN998
Tran Truong Giang
D19CQAT02-B
B19DCCN997
Nguyen Tuan Anh
D19CQCN04-B
B19DCCN998 xxxmxmmvmx
B19DCCN997 xmxmxxxvxx
B19DCCN999 xvxmxmmvvm
D19CQAT02-B
*/