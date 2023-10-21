/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
class LoaiPhong implements Comparable<LoaiPhong>{
    private String kyhieu, ten;
    private int dg;
    private float dv;

    public LoaiPhong() {
    }

    public LoaiPhong(String line) {
        String[] a= line.split("\\s+");
        this.kyhieu = a[0];
        this.ten = a[1];
        this.dg = Integer.parseInt(a[2]);
        this.dv = Float.parseFloat(a[3]);
    }
    @Override
    public String toString()
    {
        return kyhieu + " " + ten +" "+ dg +" " + dv;
    }

    @Override
    public int compareTo(LoaiPhong o) {
        return this.ten.compareTo(o.ten);
    }
    
}
public class J07045_LoaiPhong {
    public static void main(String[] args) throws IOException {
        ArrayList<LoaiPhong> ds = new ArrayList<>();
        Scanner in = new Scanner(new File("PHONG.in"));
        int n = Integer.parseInt(in.nextLine());
        while(n-->0){
            ds.add(new LoaiPhong(in.nextLine()));
        }
        Collections.sort(ds);
        for(LoaiPhong tmp : ds){
            System.out.println(tmp);
        }
    }
}
