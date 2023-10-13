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
class gamer implements Comparable <gamer>
{
    private String id, name;
    private String in, out;
    private Integer time;

    public gamer() {
    }

    public gamer(String id, String name, String in, String out) {
        this.id = id;
        this.name = name;
        this.in = in;
        this.out = out;
//        this.time = (Integer.parseInt(out.substring(0, 2))*60 + Integer.parseInt(out.substring(3)))-(Integer.parseInt(in.substring(0, 2))*60 + Integer.parseInt(in.substring(3)));
        this.time= (Integer.parseInt(out.substring(0, 2))*60 + Integer.parseInt(out.substring(3)))-(Integer.parseInt(in.substring(0, 2))*60 + Integer.parseInt(in.substring(3))) ;

    }
    
    public String gio()
    {
        
        int hour = (int)time/60;
        int min = time - hour*60;
        return hour+ " gio " + min+" phut";
    }
    
    @Override 
    public String toString()
    {
        return id + " " + name + " " + gio();
    }
    @Override 
    public int compareTo(gamer o)
    {
        return -this.time.compareTo(o.time);
    }
}
public class J05011_TinhGio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List <gamer> a = new ArrayList<>();
        for (int i=0;i<n;i++)
        {
            String b = sc.nextLine();
            String c = sc.nextLine();
            String in = sc.nextLine();
            String out = sc.nextLine();
            
            gamer x = new gamer (b, c, in, out);
            a.add(x);
        }
        
        Collections.sort(a);
        for(gamer x : a){
            System.out.println(x);
//            System.out.println(x.gio());
        }
    }
}
/*
3
01T
Nguyen Van An
09:00
10:30
06T
Hoang Van Nam
15:30
18:00
02I
Tran Hoa Binh
09:05
10:00
*/