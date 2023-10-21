/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo1;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Admin
 */
public class set {
    public static void main(String[] args) {
        int[] a =  {2,4,2,4,5,7,7 };
        Set <Integer> s = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            s.add(a[i]);
        }
        for(Integer x : s)
        {
            int dem = 0;
            for (int i = 0; i < a.length; i++) {
                if(x == a[i]){
                    dem++;
                }
            }
            System.out.println(x + " : " + dem);
        }
    }
}
