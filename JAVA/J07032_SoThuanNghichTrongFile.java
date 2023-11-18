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
/**
 *
 * @author Admin
 */
public class J07032_SoThuanNghichTrongFile {
    public static boolean isValid(String s) {
        StringBuilder sb = new StringBuilder(s).reverse();
        if(!sb.toString().equals(s)){
            return false;
        }
        if (s.length() % 2 == 0 || s.length() == 1) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) - '0') % 2 == 0) {
                return false;
            }
        }
        return true;
        
    }

    
    public static void main(String[] args) throws FileNotFoundException,IOException, ClassNotFoundException{
        ObjectInputStream os1 = new ObjectInputStream( new FileInputStream("DATA1.in"));
        List <Integer> a1 = (ArrayList<Integer>) os1.readObject();
        ObjectInputStream os2 = new ObjectInputStream( new FileInputStream("DATA2.in"));
        List <Integer> a2 = (ArrayList<Integer>) os2.readObject();
        int [] d = new int [1000001];
        for(Integer i : a1)
        {
            if(isValid(i.toString()) && a2.contains(i)){
                d[i]++;
            }
        }
        for(Integer i : a2)
        {
            if(isValid(i.toString()) && d[i] != 0){
                d[i]++;
            }
            
        }
        int dem =0;
       for (int i = 0; i <= 1000000; i++)
        {
            if(d[i]>0)
            {
               System.out.println(i +" "+d[i]);
                dem++; 
            }
            
            if(dem ==10){
                break;
            }
        }
        
    }
}
