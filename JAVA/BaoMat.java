/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;
import java.util.TreeSet;

/**
 *
 * @author Admin
 */
public class BaoMat {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // doc ti file 1
        ObjectInputStream oi = new ObjectInputStream( new FileInputStream("DATA1.in"));
        List<String> list1 = (List<String>) oi.readObject();
        // doc tu file 2
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA2.in"));
        List<Integer> list2 = (List<Integer>) ois.readObject();
        

        TreeSet<String> s = new TreeSet<>();
        for (int i = 0; i < list1.size(); i++) {
            for (int j = 0; j < list2.size(); j++) {
                String tmp = list1.get(i) + String.valueOf(list2.get(i));
                s.add(tmp);
            }
        }
        for(String x : s){
            System.out.println(x);
        }
    }
}
