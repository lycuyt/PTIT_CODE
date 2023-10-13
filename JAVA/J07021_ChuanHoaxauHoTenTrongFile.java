/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class J07021_ChuanHoaxauHoTenTrongFile {
    public static String chuanhoa(String s)
    {
        String[]a = s.trim().split("\\s+");
        String res ="";
        for (int i = 0; i < a.length; i++) {
            res+=a[i].substring(0,1).toUpperCase() + a[i].substring(1).toLowerCase()+" ";
        }
        return res;
    }
    public static void main(String[] args) throws  FileNotFoundException{
        Scanner sc = new Scanner(new File("src/codeptit/DATA.in"));
        while(true)
        {
            String line = sc.nextLine();
            if(line.equals("END")){
                break;
            }
            System.out.println(chuanhoa(line));
        }
    }
}
// xoa src/codeptit/ ->AC