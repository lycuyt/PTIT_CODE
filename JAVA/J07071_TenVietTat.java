/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
class Ten {
    private String ten, viettat, layten, layho;

    public Ten() {
    }

    public Ten(String ten) {
        this.ten = ten;
        
        String [] a = ten.split("\\s+");
        String res ="";
        for (int i = 0; i < a.length; i++) {
            res += a[i].substring(0,1).toUpperCase()+".";
        }
        this.layten = a[a.length-1];
        this.layho = a[0];
        this.viettat = res.substring(0,res.length()-1);
    }
    
    public int check(String s)
    {
        // check s co cung from giong viettat khong
        int idx = -1;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '*'){
                idx = i;
            }
        }
        
        String s1 = s.substring(0,idx);
        String s2 = s.substring(idx+1);
        String a1 = viettat.substring(0,idx);
        String a2 = viettat.substring(idx + 1);
        if(s1.equals(a1) && s2.equals(a2)){
            return 1;
        }else {
            return 0;
        }
    }

    public String getLayten() {
        return layten;
    }

    public String getLayho() {
        return layho;
    }
    public String toString(){
        return ten;
    }
    
}
public class J07071_TenVietTat {
    public static void main(String[] args)throws FileNotFoundException{
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        int n = Integer.parseInt(sc.nextLine());
        List <Ten> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String b = sc.nextLine();
            arr.add(new Ten(b));
        }
        arr.sort(new Comparator<Ten>(){
            @Override
            public int compare(Ten o1, Ten o2) {
                if(o1.getLayten().equals(o2.getLayten())){
                    return o1.getLayho().compareTo(o2.getLayho());
                }
                return o1.getLayten().compareTo(o2.getLayten());
            }
            
        });
        int q = Integer.parseInt(sc.nextLine());
        while(q-->0)
        {
            String s = sc.nextLine();
            for(Ten x : arr)
            {
                if(x.check(s) == 1) System.out.println(x);
            }
        }
    }
}
