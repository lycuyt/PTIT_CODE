/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author Admin
 */
class Student implements Comparable <Student>{
    public static int num =1;
    public String id, name;
    public Float avg;
    
    public Student(String name, float[] p)
    {
        this.id = String.format("HS%02d", num++);
        this.name = name;
        avg = 0f;
        for (int i = 0; i < 10; i++) {
            if(i == 1 || i == 0)
            {
                avg += p[i] * 2f;
            }
            else{
                avg += p[i];
            }
        }
        avg = avg /12f;
        avg = Math.round(avg * 10f) / 10f;
        
    }
    public String getHL()
    {
        if(avg >= 9f) {
            return "XUAT SAC";
        }
        if(avg >=8f){
            return "GIOI";
        }
        if(avg >= 7f){
            return "KHA";
        }
        if(avg >= 5f)
        {
            return "TB";
        }
        return "YEU";
    }
    @Override
    public String toString()
    {
        return id + " " + name + " " + String.format("%.1f", avg)+" " + getHL();
    }
    @Override
    public int compareTo(Student o)
    {
        if (this.avg.compareTo(o.avg) == 0) {
            return this.id.compareTo(o.id);
        }
        return -this.avg.compareTo(o.avg);
    }
}

public class J05018_BangDiemHocSinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        Student[] a = new Student[n];
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            String name = sc.nextLine();
            float[] diem = new float[10];
            for (int j = 0; j < 10; j++) {
                diem[j] = sc.nextFloat();
            }
            a[i] = new Student(name, diem);
        }
        Arrays.sort(a);
        for( Student x : a)
        {
            System.out.println(x);
        }
    }
}
/*
3
Luu Thuy Nhi
9.3  9.0  7.1  6.5  6.2  6.0  8.2  6.7  4.8  5.5
Le Van Tam
8.0  8.0  5.5  9.0  6.8  9.0  7.2  8.3  7.2  6.8
Nguyen Thai Binh
9.0  6.4  6.0  7.5  6.7  5.5  5.0  6.0  6.0  6.0
*/