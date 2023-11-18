/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author Admin
 */
class IntSet{
    private int[] a;

    public IntSet() {
    }

    public IntSet(int[] a) {
        this.a = a;
    }

    public int[] getA() {
        return a;
    }

    public void setA(int[] a) {
        this.a = a;
    }
    public int getKT()
    {
        return a.length;
    }
    public IntSet  intersection(IntSet b)
    {
        
        TreeSet<Integer> k = new TreeSet<>();
        for (int i = 0; i < getKT(); i++) {
            for (int j = 0; j < b.getKT(); j++) {
                if(a[i]==b.getA()[j]){
                    k.add(a[i]);
                }
            }
        }
        
        int h = k.size();
        int[] c= new int[h];
        int m = 0;
        for(Integer x : k)
        {
            c[m] = x;
            m++;
        }
        IntSet n = new IntSet();
        n.setA(c);
        return n;
    }
    @Override
    public String toString()
    {
        String res ="";
        for (int i = 0; i < getKT(); i++) {
            if(a[i] >0) res+=a[i]+" ";
            
        }
        return res;
    }
}
public class J07009_LopInSet_2 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("src/codeptit/DATA.in"));
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for(int i = 0; i<n; i++) a[i] = sc.nextInt();
        for(int i = 0; i<m; i++) b[i] = sc.nextInt();
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.intersection(s2);
        System.out.println(s3);
    }
}
