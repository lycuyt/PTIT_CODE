/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

/**
 *
 * @author Admin
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
class SinhVien implements Comparable<SinhVien>{
    private String msv, hoten, dt;
    private int nhom;

    public SinhVien() {
    }

    public SinhVien(String msv, String hoten, String dt, int nhom) {
        this.msv = msv;
        this.hoten = hoten;
        this.dt = dt;
        this.nhom = nhom;
    }

    public int getNhom() {
        return nhom;
    }
    
    public String toString()
    {
        return msv+" " + hoten +" "+ dt+" "+nhom;
    }

    @Override
    public int compareTo(SinhVien o) {
        return this.msv.compareTo(o.msv);
    }
}
public class J06004_QuanLyBaiTapNhom_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String s = sc.nextLine();
        int n = Integer.parseInt(s.split("\\s+")[0]);
        int m = Integer.parseInt(s.split("\\s+")[1]);
        List<SinhVien> arr = new ArrayList<>();
//        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String msv = sc.nextLine();
            String ten = sc.nextLine();
            String dt = sc.nextLine();
            int nhom = Integer.parseInt(sc.nextLine());
            SinhVien a = new SinhVien(msv, ten, dt, nhom);
            arr.add(a);
        }
        List<String> team = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            team.add(sc.nextLine());
        }
        Collections.sort(arr);
        for(SinhVien i : arr)
        {
            System.out.println(i+" "+team.get(i.getNhom()-1));
            
        }
    }
}
/*
5 2
B17DTCN001
Nguyen Chi  Linh
0987345543
1
B17DTCN011
Vu Viet Thang
0981234567
1
B17DTCN023
Pham Trong Thang
0992123456
1
B17DTCN022
Nguyen Van  Quyet
0977865432
2
B17DTCN031
Ngo Thanh Vien
0912313111
2
Xay dung website ban dien thoai truc tuyen
Xay dung ung dung quan ly benh nhan Covid-19
*/