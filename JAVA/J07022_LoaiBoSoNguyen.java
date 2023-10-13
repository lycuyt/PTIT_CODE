/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class J07022_LoaiBoSoNguyen {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("src/codeptit/DATA.in"));
        List<String> arr = new ArrayList<>();
       while(sc.hasNext())
        {
            String s = sc.next();
            
            try{
                int n = Integer.valueOf(s);
            }catch(NumberFormatException e)
            {
                arr.add(s);
            }
        }
        Collections.sort(arr);
        for(String x : arr)
        {
            System.out.print(x + ' ');
        }
        
    }
}
