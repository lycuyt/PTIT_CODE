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
class NV implements Comparable<NV>{
    public static int num = 1;
    private String id, name;
    private long wage, day;
    private String cv;

    public NV() {
    }

    public NV( String name, long wage, long day, String cv) {
        this.id = String.format("NV%02d", num++);
        this.name = name;
        this.wage = wage;
        this.day = day;
        this.cv = cv;
    }
    public long getLT()
    {
        return wage*day;
    }
    public long getT()
    {
        if( day >=25) return (long)(getLT() * 0.2);
        if(day>=22) return (long) (getLT() *0.1);
        return 0;
    }
    public long getPC()
    {
        if(cv.equals("GD")) return 250000;
        if(cv.equals("PGD")) return 200000;
        if(cv.equals("TP")) return 180000;
        else return 150000;
    }
    public long tong()
    {
        return getLT() + getT() + getPC();
    }
    @Override
    public String toString()
    {
        return id+ " " + name+" " + getLT() + " " + getT() + " " + getPC() + " " + tong();
    }
    @Override
    public int compareTo(NV o)
    {
        if(this.tong() > o.tong()) return -1;
        return 1;
    }
}
public class J05038_BangKeTienLuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        long sum =0;
        List<NV> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            long wage = Long.parseLong(sc.nextLine());
            long day = Long.parseLong(sc.nextLine());
            String cv = sc.nextLine();
            NV x = new NV(name, wage, day, cv);
//            sum+=x.tong();
            a.add(x);
        }
        Collections.sort(a);
        for ( NV x : a) {
            System.out.println(x);
        }
//        System.out.println("Tong chi phi tien luong: "+ sum);
        
    }
}
/*
3
Cao Van V
50000
26
GD
Do Van Truong
40000
25
PGD
Truong Thi Tu Linh
45000
22
NV
*/