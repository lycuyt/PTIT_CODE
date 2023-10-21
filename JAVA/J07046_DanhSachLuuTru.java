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
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
class LuuTRu{
    private String ten, phong, ma;
    private String den, di;
    private long songay;
    public static int num = 1;
    
    public LuuTRu() {
    }

    public LuuTRu(String ten, String phong, String den, String di) throws ParseException{
        this. ma  = String.format("KH%02d", num++);
        this.ten = ten;
        this.phong = phong;
        this.den = den;
        this.di = di;
        
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
        Date tu = f.parse(den);
        Date denn = f.parse(di);
        this.songay = (denn.getTime() - tu.getTime())/(1000*60*60*24);
    }

    public long getSongay() {
        return songay;
    }
    
    @Override
    public String toString() 
    {
        return ma + " " + ten + " " + phong+" " + songay;
    }
    
    
}
public class J07046_DanhSachLuuTru {
    public static void main(String[] args) throws FileNotFoundException, ParseException{
        Scanner sc = new Scanner(new File("KHACH.in"));
        int n = Integer.parseInt(sc.nextLine());
        List<LuuTRu> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String ten = sc.nextLine();
            String phong = sc.nextLine();
            String den = sc.nextLine();
            String di = sc.nextLine();
            arr.add(new LuuTRu(ten, phong, den, di));
        }
        arr.sort(new Comparator<LuuTRu>(){
            @Override
            public int compare(LuuTRu o1, LuuTRu o2) {
                return Long.compare(o2.getSongay() ,o1.getSongay());
            }
            
        });
        for(LuuTRu x : arr)
        {
            System.out.println(x);
        }
    }
}
