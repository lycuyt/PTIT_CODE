/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author Admin
 */
class DN implements Comparable<DN>{
    private String id, name;
    private int num;

    public DN() {
    }

    public DN(String id, String name, int num) {
        this.id = id;
        this.name = name;
        this.num = num;
    }

    public int getNum() {
        return num;
    }
    
    @Override
    public String toString()
    {
        return id + " " + name + " " + num;
    }
    @Override
    public int compareTo(DN o)
    {
        if(this.num == o.num)
        {
            return this.id.compareTo(o.id);
        }
        return -(this.num - o.num);
    }
        
}
public class J05028_DanhSachDoanhNghiepNhanSinhVienThucTap {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        DN [] a = new DN[n];
        for (int i = 0; i < n; i++) {
            
            String id = sc.nextLine();
            String name = sc.nextLine();
            int num = Integer.parseInt(sc.nextLine());
            a[i] = new DN(id, name, num);
        }
        Arrays.sort(a);
        int q = Integer.parseInt(sc.nextLine());
        while(q-->0)
        {
            int b = sc.nextInt();
            
            int c = sc.nextInt();
            System.out.println("DANH SACH DOANH NGHIEP NHAN TU "+b+" DEN "+c +" SINH VIEN:");
            for(DN x : a)
            {
                if(x.getNum()>=b && x.getNum()<=c)
                {
                    System.out.println(x);
                }
            }
        }
    }
}
/*
4
VIETTEL
TAP DOAN VIEN THONG QUAN DOI VIETTEL
40
FSOFT
CONG TY TNHH PHAN MEM FPT - FPT SOFTWARE
300
VNPT
TAP DOAN BUU CHINH VIEN THONG VIET NAM
200
SUN
SUN*
50
1
30 50
*/