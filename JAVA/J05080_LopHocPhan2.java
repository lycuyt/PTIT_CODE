/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
class MH implements Comparable<MH>{
    private String ma, ten ;
    private String tt;
    private String tengv;

    public MH() {
    }

    public MH(String ma, String ten, String tt, String tengv) {
        this.ma = ma;
        this.ten = ten;
        this.tt = tt;
        this.tengv = tengv;
    }
    public String toString()
    {
        return  ma+" " + ten+" "+tt;
    }

    public String getTengv() {
        return tengv;
    }

    public String getTen() {
        return ten;
    }
    
    public String getMa() {
        return ma;
    }
    
    @Override
    public int compareTo(MH o) {
        if(this.ma.equals(o.ma)){
            return this.tt.compareTo(o.tt);
        }
        return this.ma.compareTo(o.ma);
    }
    
}
public class J05080_LopHocPhan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<MH> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            String nhom = sc.nextLine();
            String gv = sc.nextLine();
            a.add(new MH(ma, ten, nhom, gv));
        }
//        Collections.sort(a);
        int q = Integer.parseInt(sc.nextLine());
        while(q-->0)
        {
            String ten = sc.nextLine();
            System.out.print("Danh sach cho giang vien ");
            for(MH i : a){
                if(i.getTengv().equals(ten)){
                    System.out.println(i.getTengv()+":");
                    break;
                }
                
            }
            List<MH> brr  = new ArrayList<>();
            for(MH i : a){
                if(i.getTengv().equalsIgnoreCase(ten)){
//                    System.out.println(i);
                    brr.add(i);
                }
            }
                
            Collections.sort(brr);
            for(MH i : brr){
                System.out.println(i);
            }
//            
        }
    }
    
}
/*
4
THCS2D20
Tin hoc co so 2 - D20
01
Nguyen Binh An
CPPD20
Ngon ngu lap trinh C++ - D20
01
Le Van Cong
THCS2D20
Tin hoc co so 2 - D20
02
Nguyen Trung Binh
LTHDTD19
Lap trinh huong doi tuong - D19
01
Nguyen Binh An
1
Nguyen Binh An
*/