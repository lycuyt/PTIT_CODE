/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

/**
 *
 * @author Admin
 */
public class J07023_NguyenToVaThuanNghich {
    public static boolean check(int n)
    {
        String res = String.valueOf(n);
        StringBuilder dao = new StringBuilder(res).reverse();
        if(!res.equals(dao.toString())){
            return false;
        }
        if(n<2) return false;
        for(int i = 2;i<=Math.sqrt(n);i++)
        {
            if(n%i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, IOException{
        ObjectInputStream ios1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        List < Integer> arr = (ArrayList<Integer>) ios1.readObject();
        
        ObjectInputStream ios2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        List < Integer> brr = (ArrayList<Integer>) ios2.readObject();
        
        int [] d1 = new int[10001];
        int [] d2 = new int[10001];
        
        for(Integer x: arr)
        {
            if(check(x)){
                d1[x]++;
            }
        }
        
        for(Integer x: brr)
        {
            if(check(x)){
                d2[x]++;
            }
        }
        TreeSet< Integer> se = new TreeSet<>();
        for(Integer x: arr)
        {
            if(check(x) && brr.contains(x)){
                se.add(x);
            }
        }
        for(Integer x: se)
        {
            System.out.println(x +" "+d1[x]+" "+d2[x]);
        }
        
    }
}
