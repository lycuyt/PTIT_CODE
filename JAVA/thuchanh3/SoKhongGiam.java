
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class SoKhongGiam {
    public static boolean sokg(int n)
    {
        String res = String.valueOf(n);
        if(res.length()<2) return false;
        for (int i = 0; i < res.length()-1; i++) {
            if(res.charAt(i)-48 > res.charAt(i+1) -48){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, IOException{
        ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        List<Integer> arr = (ArrayList<Integer>) ois1.readObject();
        
        ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        List<Integer> brr = (ArrayList<Integer>) ois2.readObject();
//        
//        ObjectInputStream osi1 = new ObjectInputStream(new FileInputStream("DATA.in"));
//        List<String> a = (ArrayList<String>) osi1.readO
        int [] d1 = new int [10001];
        int [] d2 = new int [10001];
        
        for(Integer x : arr)
        {
            if(sokg(x)){
                d1[x]++;
            }
        }
        for(Integer x : brr)
        {
            if(sokg(x)){
                d2[x]++;
            }
        }
        
        TreeSet<Integer> se = new TreeSet<>();
        for(Integer x : arr)
        {
            if(sokg(x) && brr.contains(x)){
                se.add(x);
            }
        }
        for(Integer x : se)
        {
            System.out.println(x + " " + d1[x]+" " + d2[x]);
        }
    }
}
