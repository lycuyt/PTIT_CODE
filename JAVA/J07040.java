/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Admin
 */
public class J07040 {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException{
        ObjectInputStream ios = new ObjectInputStream(new FileInputStream("NHIPHAN.in"));
        List<String> list = (ArrayList<String>) ios.readObject();
        Set<String> arr = new TreeSet<>();
        for(String x: list)
        {
            String[] tmp = x.trim().toLowerCase().split("\\s+");
            arr.addAll(Arrays.asList(tmp));
        }
        Scanner sc = new Scanner (new File("VANBAN.in"));
        while(sc.hasNext()){
            String s = sc.next().toLowerCase();
            if(arr.contains(s)){
                System.out.println(s);
                arr.remove(s);
            }
        }
    }
}
