/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.text.ParseException;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

/**
 *
 * @author Admin
 */
class VDV implements Comparable<VDV>{
    private String name, birth,id;
    private Date start, end;
    private int tuoi;
    private int uutien;
    private int xh;

    public void setXh(int xh) {
        this.xh = xh;
    }
    private long thanhtichtt, thanhtichxh;
    private SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
    private SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
    public static int num =1;

    public VDV() {
    }

    public VDV(String name, String birth, String start, String end) throws ParseException{
        this.name = name;
        this.birth = birth;
        this.id = String.format("VDV%02d", num++);
        this.start = sdf.parse(start);
        this.end = sdf.parse(end);
        
        tuoi = 2021 - sdf2.parse(birth).getYear() - 1900;
        uutien = 3;
        if (tuoi < 18)
            uutien = 0;
        else if (tuoi < 25)
            uutien = 1;
        else if (tuoi < 32)
            uutien = 2;
        
        thanhtichtt = (this.end.getTime() - this.start.getTime())/1000;
        thanhtichxh = thanhtichtt -uutien;
    }
    
    public long getThanhtichxh() {
        return thanhtichxh;
    }

    public String getId() {
        return id;
    }
    
    public String StringFormat(long s)
    {
        long h = s /3600;
        long m = (s-3600*h)/60;
        return String.format("%02d:%02d:%02d", h, m, s - h*3600 - m*60);
    }
    @Override
    public String toString()
    {
        return id + " " + name +" " + StringFormat(thanhtichtt) + " " +StringFormat(uutien)+" " + StringFormat(thanhtichxh) + " " + xh;
    }

    @Override
    public int compareTo(VDV o) {
       return (int)(this.thanhtichxh - o.thanhtichxh) ;
    }
    
    
}
    

public class J05055_XepHangVienDongVien_1 {
    public static void main(String[] args)throws ParseException{
        Scanner sc  = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<VDV> a = new ArrayList<>();
        VDV vdv;
        for(int i=0;i<n;i++)
        {
            vdv = new VDV(sc.nextLine(), sc.nextLine(), sc.nextLine(),sc.nextLine());
            a.add(vdv);
        }
        Collections.sort(a);
        int k = 1, s = 0 , e = 0;
        for(int i = 1;i<n;i++)
        {
//            System.out.println(k);
            if(a.get(i).getThanhtichxh() == a.get(i-1).getThanhtichxh())
            {
                e += 1;
            }else{
                
                for (int j = s; j <= e; j++) {
                    a.get(j).setXh(k);
                    
                }
                k = k + (e -s) + 1;                 
                s = i;
                e = i;
                        
            }
            
        }
       
        for (int i = s; i < n; i++) {
            a.get(i).setXh(k);
        }
        
//        Collections.sort(a, new Comparator<VDV>(){
//            @Override
//            public int compare(VDV o1, VDV o2){
//                return o1.getId().compareTo(o2.getId());
//            }
//        });
        for(VDV x : a){
            System.out.println(x);
        }
    }
}
/*
3
Nguyen Van Thanh
20/03/1990
07:00:00
07:10:01
Nguyen Hoa Binh
01/10/1993
07:02:00
07:11:20
Le Thanh Van
15/03/1998
07:05:00
07:15:30
*/
