package codeptit;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class J07085_TongChuSo {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException{
        ObjectInputStream ios = new ObjectInputStream(new FileInputStream("DATA.in"));
        List<String> list = (ArrayList<String>) ios.readObject();
        
        for(String x : list)
        {
            String res="";
            for (int i = 0; i < x.length(); i++) {
                if(Character.isDigit(x.charAt(i))){
                    res+=x.charAt(i);
                }
            }
            //bo nhung so 0 dang trc cua res
            int k = 0;
            while(res.charAt(k) == '0'){
                k++;
            }
            String ans = res.substring(k);
            int sum =0;
            for (int i = 0; i < ans.length(); i++) {
                sum+= ans.charAt(i)-'0';
            }
            System.out.println(ans+" "+sum);
        }
    }
}
