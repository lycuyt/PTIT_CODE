/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
class monhoc implements Comparable<monhoc>{
    private String ma, ten;
    private int tc;

    public monhoc() {
    }

    public monhoc(String ma, String ten, int tc) {
        this.ma = ma;
        this.ten = ten;
        this.tc = tc;
    }
    @Override
    public String toString()
    {
        return ma + " " + ten + " " + tc;
    }

    @Override
    public int compareTo(monhoc o) {
        return this.ten.compareTo(o.ten);
    }
}
public class J07034_DanhSachMonHoc {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("src/codeptit/MONHOC.in"));
        
        int n = Integer.parseInt(sc.nextLine());
        List<monhoc> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            int tc = Integer.parseInt(sc.nextLine());
            monhoc a = new monhoc(ma, ten, tc);
            arr.add(a);
        }
        Collections.sort(arr);
        for(monhoc x : arr)
        {
            System.out.println(x);
        }
        
        
    }
}
