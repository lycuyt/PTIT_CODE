/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
class Xau implements Comparable<Xau>{
    private String hoten, layho, layten , laydem;

    public Xau() {
    }

    public Xau(String hoten) {
        this.hoten = chuanhoa(hoten);
        String [] a= this.hoten.trim().split("\\s+");
        this.layho = a[0];
        this.layten = a[a.length -1];
        this.laydem = "";
        for (int i = 1; i < a.length-1; i++) {
            this.laydem += a[i].substring(0,1).toUpperCase() + a[i].substring(1).toLowerCase();
        }
    }
    public String chuanhoa(String s)
    {
        String [] a= s.trim().split("\\s+");
        String res ="";
        for (int i = 0; i < a.length; i++) {
            res+=a[i].substring(0,1).toUpperCase() + a[i].substring(1).toLowerCase()+ " ";
            
        }
        return res.substring(0, res.length()-1);
    }

    @Override
    public int compareTo(Xau o) {
        if(this.layten.equals(o.layten)){
            if(this.layho.equals(o.layho)){
                return this.laydem.compareTo(o.laydem);
            }
            return this.layho.compareTo(o.layho);
        }
        return this.layten.compareTo(o.layten);
    }
    public String toString(){
        return hoten;
    }
}
public class J07072_ChuanHoaVaSapXep {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        
        List <Xau> arr = new ArrayList<>();
        while(sc.hasNext()){
            arr.add(new Xau(sc.nextLine()));
        }
        Collections.sort(arr);
        for(Xau i : arr){
            System.out.println(i);
        }
    }
}
