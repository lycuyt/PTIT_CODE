/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import com.sun.source.util.TreeScanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Admin
 */
public class TangDanGiamdan {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int n = sc.nextInt();
            int [] a= new int[n];
            for (int i = 0; i < n; i++) {
                
                a[i] = sc.nextInt();
            }
            Set<Integer> chan = new TreeSet<>();
            Set<Integer> le = new TreeSet<>();
            for (int i = 0; i < n; i++) {
                if(a[i] % 2== 0)
                {
                    chan.add(a[i]);
                }else{
                    le.add(a[i]);
                }
            }
            for (int i : chan) {
                System.out.print(i+" ");
            }
            System.out.println();
             List<Integer> list = new ArrayList<>(le);
             Collections.reverse(list);
           for (int i : list) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
