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
class SinhVien implements 
        Comparable<SinhVien>{
    private String masv, hoten, sdt, email, ho, ten, dem;

    public SinhVien() {
    }

    public SinhVien(String masv, String hoten, String sdt, String email) {
        this.masv = masv;
        this.hoten = hoten;
        this.sdt = sdt;
        this.email = email;
        String[] a = hoten.split("\\s+");
        this.ho = a[0];
        this.ten = a[a.length-1];
        this.dem ="";
        for (int i = 1; i < a.length -1; i++) {
            this.dem += a[i];
        }
       
    }
    @Override
    public String toString()
    {
        return masv + " "+ hoten +" "+ sdt +" "+email;
    }

    @Override
    public int compareTo(SinhVien o) {
        if(this.ten.equals(o.ten)){
            if(this.ho.equals(o.ho)){
                if(this.dem.equals(o.dem)){
                    return this.masv.compareTo(o.masv);
                }
                return this.dem.compareTo(o.dem);
            }
            return this.ho.compareTo(o.ho);
        }
        return this.ten.compareTo(o.ten);
    }
}
public class J07081_SapXepDanhSachSinhVien  {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        List<SinhVien> arr = new ArrayList<>();
        
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            arr.add(new SinhVien(sc.nextLine(),sc.nextLine(),
            sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(arr);
        for(SinhVien x : arr)
        {
            System.out.println(x);
        }
    }
}
