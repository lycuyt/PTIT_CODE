/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
class Hang implements Comparable<Hang>{
    public static int num = 1;
    private String id, name ;
    public String ma;
    private int sl, dg;

    public Hang() {
    }

    public Hang(String name, int sl, int dg) {
        this.id = String.format("%02d", num++);
        this.name = name;
        this.sl = sl;
        this.dg = dg;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }
    
    public String getma()
    {
        String [] a= name.toUpperCase().split("\\s+");
        String res="";
        for(int i=0;i<2;i++)
        {
            res+= a[i].charAt(0);
        }
        return res +"0";
    }
    
    public int CK()
    {
        if(sl>10) return (int)(dg*sl*0.05);
        if(sl>=8) return (int) (dg*sl*0.02);
        if(sl>=5) return (int)(dg*sl*0.01);
        return 0;
    }
    public int TT()
    {
        return (int)(dg*sl - CK());
    }
    @Override
    public String toString()
    {
        return ma + " " + name + " " + CK() + " "+ TT();
    }

    @Override
    public int compareTo(Hang o) {
        return -(this.CK()  - o.CK());
    }
}
public class J05046_BangKeNhapKho {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<Hang> a = new ArrayList<>();
        Map<String, Integer> b = new LinkedHashMap<>();
        for (int i = 0; i < t; i++) {
            String name = sc.nextLine();
            int sl = Integer.parseInt(sc.nextLine());
            int dg = Integer.parseInt(sc.nextLine());
            a.add(new Hang(name, sl, dg));
        }
        for(Hang x : a){
            if(b.containsKey(x.getma())){
                b.put(x.getma(), b.get(x.getma()) +1);
            }else{
                b.put(x.getma(), 1);
            }
        }
        for(Map.Entry<String, Integer> entry : b.entrySet())
        {
            String key = entry.getKey();
            Integer val = entry.getValue();
            int k = 1;
            for(Hang x : a)
            {
                if(x.getma().equals(key) && k<= val){
                    x.setMa(x.getma() + k);
                    k++;
                }
            }
        }
        Collections.sort(a);
        for(Hang x: a){
            System.out.println(x);
        }
    }
}
/*
3
May lanh SANYO
12
4000000
Dien thoai Samsung
30
3230000
Dien thoai Nokia
18
1240000
*/