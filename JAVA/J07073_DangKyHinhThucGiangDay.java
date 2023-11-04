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
class MonHoc implements Comparable<MonHoc>{
    private String name, id;
    private int sotc;
    private String lythuyet, thuchanh;

    public MonHoc() {
    }

    public MonHoc(String id, String name, int sotc, String lythuyet, String thuchanh) {
        this.name = name;
        this.id = id;
        this.sotc = sotc;
        this.lythuyet = lythuyet;
        this.thuchanh = thuchanh;
    }
    
    @Override
    public String toString()
    {
        return id +" "+name +" "+sotc +" "+lythuyet +" "+thuchanh;
    }

    @Override
    public int compareTo(MonHoc o) {
        return this.id.compareTo(o.id);
    }

    public String getThuchanh() {
        return thuchanh;
    }
    
}
public class J07073_DangKyHinhThucGiangDay {
    public static void main(String[] args)throws FileNotFoundException{
        Scanner sc = new Scanner (new File("MONHOC.in"));
        int n = Integer.parseInt(sc.nextLine());
        List<MonHoc> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String id = sc.nextLine();
            String name = sc.nextLine();
            int stc = Integer.parseInt(sc.nextLine());
            String lt = sc.nextLine();
            String tt = sc.nextLine();
            arr.add(new MonHoc(id, name, stc, lt, tt));
        }
        Collections.sort(arr);
        for (int i = 0; i < arr.size(); i++) {
            if(arr.get(i).getThuchanh().equals("Truc tuyen") ||
                arr.get(i).getThuchanh().contains(".ptit.edu.vn")     ){
                
                    System.out.println(arr.get(i));}
        }
    }
}
