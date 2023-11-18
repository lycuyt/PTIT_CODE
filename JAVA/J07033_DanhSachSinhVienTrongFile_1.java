/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
class sv implements Comparable<sv>{
    private String masv, ten, malop, mail;

    public sv() {
    }

    public sv(String masv, String ten, String malop, String mail) {
        this.masv = masv;
        this.ten = chuanhoa(ten);
        this.malop = malop;
        this.mail = mail;
    }
    public String chuanhoa(String s)
    {
        String [] a= s.trim().split("\\s+");
        String res = "";
        for (int i = 0; i < a.length; i++) {
            res+=a[i].substring(0,1).toUpperCase()+a[i].substring(1).toLowerCase()+" ";
            
        }
        return res.substring(0, res.length()-1);
        
    }
    @Override
    public String toString()
    {
        return masv+" "+ ten+" "+malop+" "+mail;
    }

    @Override
    public int compareTo(sv o) {
        return this.masv.compareTo(o.masv);
    }
    
}
public class J07033_DanhSachSinhVienTrongFile_1  {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner (new File("SINHVIEN.in"));
        int n = Integer.parseInt(sc.nextLine());
        List < sv > a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(new sv(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(a);
        for(sv x : a){
            System.out.println(x);
        }
        
    }
    
}
