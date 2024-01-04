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
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Admin
 */
public class TimSoDepTrong2File {
    public static boolean isSodep(int n)
    {
        String numberStr = String.valueOf(n);
        int length = numberStr.length();

        for (int i = 0; i < length - 1; i++) {
            if (numberStr.charAt(i) < numberStr.charAt(i + 1)) {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        List<Integer> al1 = (ArrayList<Integer>) ois1.readObject();
        Set<Integer> ts1 = new TreeSet<>();
        int[] dd1 = new int[1000001];
        for (int i : al1) {
            if (isSodep(i)) {
                ts1.add(i);
                dd1[i]++;
            }
        }

        ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        List<Integer> al2 = (ArrayList<Integer>) ois2.readObject();
        Set<Integer> ts2 = new TreeSet<>();
        int[] dd2 = new int[1000001];
        for (int i : al2) {
            if (isSodep(i)) {
                ts2.add(i);
                dd2[i]++;
            }
        }
        
        Set<Integer> giao = new TreeSet<>();
        for (int i : al1) {
            for(int j : al2)
            {
                if(i==j)
                {
                    giao.add(i);
                }
            }
        }
        for(int x : giao)
        {
            System.out.println(x+" "+dd1[x] +" "+dd2[x]);
        }
    }
}
