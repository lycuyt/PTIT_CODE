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
class Sv implements Comparable<Sv>{
    private String id , name, clas, email;

    public Sv() {
    }
    
    public Sv(String id, String name, String clas, String email) {
        this.id = id;
        this.name = name;
        this.clas = clas;
        this.email = email;
    }
    public void in()
    {
        Scanner sc = new Scanner(System.in);
        id = sc.next();
        name = sc.nextLine();
        clas = sc.next();
        email = sc.next();
    }
    @Override
    public String toString()
    {
        return id+ " " + name + " " + clas + " " + email;
    }
    @Override
    public int compareTo(Sv o)
    {
        return this.id.compareTo(o.id);
    }
}
class MangSv{
    private Sv[] a;

    public MangSv() {
    }

    public MangSv(Sv[] a) {
        this.a = a;
    }
    
    public void SapXep()
    {
        Arrays.sort(a);
    }
    
    public void out()
    {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
    
}
public class J05021_SapXepTheoMaSinhVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Sv[] a = new Sv[1000];
        int k =0;
        while(sc.hasNext())
        {
            String id = sc.nextLine();
            String name = sc.nextLine();
            String clas = sc.nextLine();
            String email = sc.nextLine();
            a[k] = new Sv(id, name, clas, email);
            k++;
        }
        Sv[] b = new Sv[k];
        for (int i = 0; i < k; i++) {
            b[i] = a[i];
        }
        MangSv arr = new MangSv(b);
        arr.SapXep();
        arr.out();
        
    }
}
