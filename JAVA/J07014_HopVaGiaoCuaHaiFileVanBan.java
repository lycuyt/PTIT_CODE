/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Admin
 */
public class J07014_HopVaGiaoCuaHaiFileVanBan {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("DATA1.in"));
        Scanner in = new Scanner(new File("DATA2.in"));
        // doc file 1
        String s1 ="";
        while(sc.hasNextLine()){
            s1+=sc.nextLine()+" ";
        }
        
        String s2 ="";
        while(in.hasNextLine()){
            s2+=in.nextLine()+" ";
        }
//        System.out.println(s1);
//        System.out.println(s2);
        // tim hop cua hai xau
        
        TreeSet<String> hop = new TreeSet<>();
        String[] a1 = s1.trim().toLowerCase().split("\\s+");
        String[] a2 = s2.trim().toLowerCase().split("\\s+");
        for (int i = 0; i < a1.length; i++) {
            hop.add(a1[i]);
        }
        for (int i = 0; i < a2.length; i++) {
            hop.add(a2[i]);
        }
        for(String x : hop){
            System.out.print(x+" ");
        }
        System.out.println();
        TreeSet<String> giao = new TreeSet<>();
        for (int i = 0; i < a1.length; i++) {
            for (int j = 0; j < a2.length; j++) {
                if(a1[i].equals(a2[j]) ){
                    giao.add(a1[i]);
                }
            }
        }
        for(String x : giao){
            System.out.print(x+" ");
        }
        System.out.println();
    }
}
