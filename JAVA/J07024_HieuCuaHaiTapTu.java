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
import java.util.Arrays;
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
    
    public String difference(WordSet b)
    {
        String res ="";
        String[] m= s.toLowerCase().split("\\s+");
        List<String> arr = Arrays.asList(m);
        String[] n = b.getS().toLowerCase().split("\\s+");
        List<String> brr = Arrays.asList(n);
        TreeSet<String> u = new TreeSet<>();
        for(String x: arr)
        {
            if(!brr.contains(x)){
                u.add(x);
            }
        }
        for(String x : u)
        {
            res+=x+" ";
        }
        return res;
    }
}
public class J07024_HieuCuaHaiTapTu {
    public static void main(String[] args) throws IOException {
        WordSet s1 = new WordSet("DATA1.in");
        WordSet s2 = new WordSet("DATA2.in");
        System.out.println(s1.difference(s2));
        System.out.println(s2.difference(s1));
    }
}
