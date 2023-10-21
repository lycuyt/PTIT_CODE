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
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
class Phong implements Comparable<Phong>{
    private String ten, sophong, den , di, ma;
    private long songay;
    private long dv;
    public static int num = 1;
    private SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
    public Phong() {
    }

    public Phong(String ten, String sophong, String den, String di, long dv) throws ParseException{
        this.ma = String.format("KH%02d", num++);
        this.ten = chuanhoaten(ten.trim());
        this.sophong = sophong.trim();
        this.den = den.trim();
        this.di = di.trim();
        this.dv = dv;
        
        Date tu = f.parse(chuanhoangay(den));
        Date denn = f.parse(chuanhoangay(di));
        this.songay = (denn.getTime() -tu.getTime())/(1000*60*60*24) + 1;
        
    }
    private String chuanhoaten(String s)
    {
        String[] a= s.split("\\s+");
        String res = "";
        for (int i = 0; i < a.length; i++) {
            res+=a[i].substring(0,1).toUpperCase()+ a[i].substring(1).toLowerCase()+" ";
        }
        
        return res.substring(0, res.length() -1);
    }
    private String chuanhoangay(String s)
    {
        try{
            Date date = f.parse(s);
            return f.format(date);
        }catch(ParseException e){
            System.out.println(e);
        }
        return "";
    }
    
    public long TT()
    {
        String tmp = sophong.substring(0,1);
        if(tmp.equals("1")){
            return 25 * songay + dv;
        }
        if(tmp.equals("2")){
            return 34 * songay + dv;
        }
        if(tmp.equals("3")){
            return 50 * songay + dv;
        }
        return 80 * songay + dv;
    }
    @Override
    public String toString()
    {
        return ma + " " + ten+" " + sophong +" "+ songay +" " + TT();
    }

    @Override
    public int compareTo(Phong o) {
        return Long.compare(o.TT(), this.TT());
    }
}
public class J07051_TinhTienPhong {
    public static void main(String[] args) throws FileNotFoundException, ParseException{
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        int n = Integer.parseInt(sc.nextLine());
        
        List<Phong> list = new ArrayList<>();
        
        for(int i=0;i<n;i++)
        {
            String name = sc.nextLine();
            String sophong = sc.nextLine();
            String den = sc.nextLine();
            String di = sc.nextLine();
            long dv = Integer.parseInt(sc.nextLine());
            Phong x  = new Phong (name, sophong, den , di, dv);
            list.add(x);
        }
        Collections.sort(list);
        
        for(Phong x : list)
        {
            System.out.println(x);
        }
        
    }
}
