/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
class student implements Comparable<student>{
    private String name, ma;
    private float gpa;
    private  int xh;
    public static int num =1;
    public student() {
    }

    public int getXh() {
        return xh;
    }

    public void setXh(int xh) {
        this.xh = xh;
    }
    
    public student(String name, float gpa) {
        this.ma = String.format("HS%02d", num++);
        this.name = name;
        this.gpa = gpa;
    }

    public String getMa() {
        return ma;
    }
    
    public float getGpa() {
        return gpa;
    }
    
    public String Xep()
    {
        if(gpa >= 9f) return "Gioi";
        if(gpa >= 7f) return "Kha";
        if(gpa >= 5f) return "Trung Binh";
        return "Yeu";
    }
    @Override
    public String toString()
    {
        return ma + " " + name +" " + gpa +" " + Xep() +" " + xh;
    }
    @Override
    public int compareTo(student o) {
        if(this.gpa < o.gpa) return 1;
        else return -1;
    }
    
    
}
public class J05054_XepHangHocSinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<student> a= new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            String ten = sc.nextLine();
            float gpa = sc.nextFloat();
            a.add(new student(ten, gpa));
            
        }
        Collections.sort(a);
        // dang sap xep giam dan rooi
        int k = 1, s = 0 , e = 0;
        for(int i = 1;i<n;i++)
        {
            if(a.get(i).getGpa() == a.get(i-1).getGpa())
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
//        System.out.println(s + " " + e);
        for (int i = s; i < n; i++) {
            a.get(i).setXh(k);
        }
        // sap xep lai theo ma sv theo thu tu tu dien
        Collections.sort(a, new Comparator<student>(){
            @Override
            public int compare(student o1, student o2){
                return o1.getMa().compareTo(o2.getMa());
            }
        });
                    
        for( student x : a)
        {
            System.out.println(x);
        }
    }
}
/*
3
Tran Minh Hieu
5.9
Nguyen Bao Trung
9.2
Le Hong Ha
9.2
*/
