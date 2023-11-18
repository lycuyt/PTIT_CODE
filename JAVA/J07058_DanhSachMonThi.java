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
class mon implements Comparable<mon> {
    private String ma, ten, hinhthuc;
    

    public mon() {
    }

    public mon(String ma, String ten, String hinhthuc) {
        this.ma = ma;
        this.ten = ten;
        this.hinhthuc = hinhthuc;
    }

    @Override
    public int compareTo(mon o) {
        return this.ma.compareTo(o.ma);
    }
    @Override
    public String toString()
            
    {
        return ma + " " + ten +" "+ hinhthuc;
    }
    
            
}
public class J07058_DanhSachMonThi {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner (new File("MONHOC.in"));
        int n = Integer.parseInt(sc.nextLine());
        List <mon> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            String hinhthuc = sc.nextLine();
            arr.add(new mon(ma, ten, hinhthuc));
                    
            
        }
        Collections.sort(arr);
        for(mon x : arr){
            System.out.println(x);
        }
    }
}
