
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
class sv implements Comparable<sv>{
    private String ma, ten , lop, email, sdt;

    public sv() {
    }

    public sv(String ma, String ten, String lop, String email, String sdt) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
        this.sdt = "0"+sdt;
    }
    @Override
    public String toString()
    {
        return ma +" "+ten+" " + lop+" " + email+" "+ sdt;
    }

    @Override
    public int compareTo(sv o) {
        if(this.lop.equals(o.lop)){
            return this.ma.compareTo(o.ma);
        }
        return this.lop.compareTo(o.lop);
    }
    
}
public class DanhSachLienLac {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        List<sv> arr = new ArrayList<>();
        
        while(sc.hasNext()){
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            String lop = sc.nextLine();
            String email = sc.nextLine();
            String sdt = sc.nextLine();
            sv x = new sv (ma, ten, lop, email, sdt);
            arr.add(x);
        }
        Collections.sort(arr);
        for(sv x : arr)
        {
            System.out.println(x);
        }
    }
}
