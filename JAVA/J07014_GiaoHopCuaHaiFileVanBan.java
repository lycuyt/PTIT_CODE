/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author Admin
 */
class WordSet{
    private String s;
    private String fname;
    public WordSet() {
    }

    public WordSet(String fname) throws IOException,FileNotFoundException{
        this.fname = fname;
        
        Scanner sc = new Scanner(new File(this.fname));
        String res ="";
        while(sc.hasNext())
        {
            res+=sc.nextLine()+" ";
        }
        this.s = res;
    }

    public String getS() {
        return s;
    }
    
    public String union(WordSet b)
    {
        String[] m= s.toLowerCase().split("\\s+");
        String[] n = b.getS().toLowerCase().split("\\s+");
        TreeSet<String> u = new TreeSet<>();
        for (int i = 0; i < m.length ; i++) {
            u.add(m[i]);
        }
        for (int i = 0; i < n.length; i++) {
            u.add(n[i]);
        }
        String res = "";
        for(String x : u)
        {
            res+=x+" ";
        }
        return res;
    }
    public String intersection(WordSet b)
    {
        String res ="";
        String[] m= s.toLowerCase().split("\\s+");
        String[] n = b.getS().toLowerCase().split("\\s+");
        TreeSet<String> u = new TreeSet<>();
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < n.length; j++) {
                if(m[i].equals(n[j])){
                    u.add(m[i]);
                }
            }
        }
        for(String x : u)
        {
            res+=x+" ";
        }
        return res;
    }
}
public class J07014_GiaoHopCuaHaiFileVanBan {
    public static void main(String[] args) throws FileNotFoundException,IOException {
        WordSet s1 = new WordSet("DATA1.in");
        WordSet s2 = new WordSet("DATA2.in");
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}
