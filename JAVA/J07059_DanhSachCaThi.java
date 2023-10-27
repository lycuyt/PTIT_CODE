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
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
class cathi implements Comparable<cathi>{
    private String ma ;
    private String ngay ;
    private String gio ;
    private String id ;
    private long t;
    private SimpleDateFormat f1 = new SimpleDateFormat("dd/MM/yyyy");
    public static  int num = 1;
    public cathi() {
    }

    public cathi( String ngay, String gio, String id) throws ParseException{
        this.ma = String.format("C%03d", num++);
        this.ngay = ngay;
        this.gio = gio;
        this.id = id;
        this.t = f1.parse(this.ngay).getTime();
    }
    public int getGio(){
        return Integer.parseInt(gio.split(":")[1]) + Integer.parseInt(gio.split(":")[0])*60;
    }
    @Override
    public int compareTo(cathi o) {
        if(this.ngay.equals(o.ngay)){
            if(this.gio.equals(o.gio)){
                return this.ma.compareTo(o.ma);
            }
            return this.getGio() - o.getGio();
        }
        
        return Long.compare(this.t, o.t);
    }
    @Override
    public String toString()
    {
        return ma+" "+ ngay+" "+gio +" "+ id;
    }
    
}
public class J07059_DanhSachCaThi {
    public static void main(String[] args) throws FileNotFoundException, ParseException{
        Scanner sc = new Scanner(new File("CATHI.in"));
        int n = Integer.parseInt(sc.nextLine());
        List <cathi> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String ngay = sc.nextLine();
            String gio = sc.nextLine();
            String id = sc.nextLine();
            a.add(new cathi(ngay, gio, id));
            
        }
        Collections.sort(a);
        for(cathi x : a){
            System.out.println(x);
        }
        
    }
}
