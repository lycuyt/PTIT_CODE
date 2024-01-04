
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class ThietLapDiaChiEmail {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        LinkedHashSet < String >  srr = new LinkedHashSet<>();
        while(sc.hasNext())
        {
            String s = sc.nextLine().trim().toLowerCase();
            String [] a = s.split("\\s+");
            String res ="";
            for (int i = 0; i < a.length; i++) {
                res+= a[i] +" ";
            }
            srr.add(res);
        }
//        for(String x : srr)
//        {
//            System.out.println(x);
//        }
        List <String> arr = new ArrayList<>();
        int k =0;
        for(String x : srr)
        {
            String [] a = x.split("\\s+");
            String res =a[a.length - 1];
            for (int i = 0; i < a.length-1; i++) {
                res+= a[i].substring(0,1);
            }
            arr.add(res);
        }
        int len = arr.size();
        int [] d = new int[len+1];
        for (int i = 0; i < len; i++) {
            d[i]=1;
        }
        for (int i = 1; i < arr.size(); i++) {
            for (int j = 0; j < i; j++) {
                boolean check = arr.get(i).equals(arr.get(j));
                if(check)
                {
                    d[i] = d[j]+1;
                }
            }
        }
        for (int i = 0; i < arr.size(); i++) {
            if(d[i]>1)
            {
                System.out.println(arr.get(i) + d[i] +"@ptit.edu.vn");
            }else{
                System.out.println(arr.get(i) + "@ptit.edu.vn");
            }
        }
    }
}
