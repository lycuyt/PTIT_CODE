/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
class Dn{
    private String ma, ten;
    private int sl;

    public Dn() {
    }

    public String getMa() {
        return ma;
    }
    
    public Dn(String ma, String ten, int sl) {
        this.ma = ma;
        this.ten = ten;
        this.sl = sl;
    }
    @Override 
    public String toString(){
        return ma + " " + ten +" " + sl;
    }
    
}
public class J07037_DanhSachDoanhNghiep {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("DN.in"));
        int n = Integer.parseInt(sc.nextLine());
        List<Dn> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            int sl = Integer.parseInt(sc.nextLine());
            arr.add(new Dn(ma, ten, sl));
        }
        arr.sort(new Comparator<Dn>(){
            @Override
            public int compare(Dn o1, Dn o2) {
                return o1.getMa().compareTo(o2.getMa());
            }
            
        });
        for(Dn x : arr)
        {
            System.out.println(x);
        }
    }
}
