/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
class csdl implements Comparable<csdl>{
    private String hoten, baudau, ketthuc;
    private long phut;
    private Date tu, den;
    private SimpleDateFormat f1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
   
    public csdl() {
    }

    public csdl(String hoten, String baudau, String ketthuc) throws ParseException{
        this.hoten = chuanhoa(hoten);
        this.baudau = baudau;
        this.ketthuc = ketthuc;
        
        tu = f1.parse(baudau);
        den = f1.parse(ketthuc);
        this.phut = (den.getTime() - tu.getTime())/(1000*60);
        
    }
    public String chuanhoa(String s)
    {
        String [] a= s.trim().split("\\s+");
        String res ="";
        for (int i = 0; i < a.length; i++) {
            res+=a[i].substring(0,1).toUpperCase() + a[i].substring(1).toLowerCase()+" ";
        }
        return res.substring(0,res.length()-1);
    }
    @Override
    public String toString()
    {
        return hoten + " " + phut;
    }

    @Override
    public int compareTo(csdl o) {
        if(this.phut == o.phut)
        {
            return this.hoten.compareTo(o.hoten);
        }
        return Long.compare(o.phut, this.phut);
    }
    
}
public class J07084_ThoiGianOnlineLienTuc {
    public static void main(String[] args) throws FileNotFoundException, ParseException{
        Scanner sc = new Scanner(new File("ONLINE.in"));
        int n = Integer.parseInt(sc.nextLine());
        List <csdl> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(new csdl(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(arr);
        for(csdl x: arr){
            System.out.println(x);
        }
    }
}
