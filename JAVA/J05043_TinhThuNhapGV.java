/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class J05043_TinhThuNhapGV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        long sum =0;
        List<NV> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            String cv = sc.nextLine();
            long wage = Long.parseLong(sc.nextLine());
            long day = Long.parseLong(sc.nextLine());
           
            NV x = new NV(name, cv, wage, day);
//            sum+=x.tong();
            a.add(x);
        }
        Collections.sort(a);
        for ( NV x : a) {
            System.out.println(x);
        }
    }
}
class NV implements Comparable<NV>{
    public static int num = 1;
    private String id, name, cv;
    private long wage, day;
    
    

    public NV() {
    }

    public NV( String name, String cv,long wage, long day ) {
        this.id = String.format("NV%02d", num++);
        this.name = name;
        this.wage = wage;
        this.day = day;
        this.cv = cv;
    }

    public String getCv() {
        return cv;
    }
    public long getPC()
    {
        if (cv.equals("GD")) return 500;
        if(cv.equals("PGD")) return 400;
        if(cv.equals("TP")) return 300;
        if(cv.equals("KT")) return 250;
        return 100;
    }
    public long getLC()
    {
        return wage * day;
    }
    public long getTU()
    {
        if((getLC() + getPC())*2.0/3<25000) return (long) Math.round(((double) getPC() + getLC()) * 2.0 / 3000) *1000;
        return 25000;
    }
    public long conlai()
    {
        return getLC() + getPC() - getTU();
    }
    
    @Override
    public String toString()
    {
        return id + " " + name + " " + getPC() + " "+ getLC()+" "+ getTU() + " " + conlai();
    }

    @Override
    public int compareTo(NV o) {
        if(this.getLC() + this.getPC()> o.getLC() + o.getPC()) return -1;
        return 1;
    }
}
/*
4
Tran Thi Yen
NV
1000
24
Nguyen Van Thanh
BV
1000
30
Doan Truong An
TP
3000
25
Le Thanh
GD
5000
28
*/