/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class SoLanXuatHienCuaSoDep {
    public static boolean isSodep(int n)
    {
        String numberStr = String.valueOf(n);
        int length = numberStr.length();

        for (int i = 0; i < length - 1; i++) {
            if (numberStr.charAt(i) > numberStr.charAt(i + 1)) {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String res = "";
        while (sc.hasNext()) {
            
            String s = sc.next();
            res+=s+" ";
            if (s.isEmpty()) break;
        }
        
        String [] a= res.split("\\s+");
        LinkedHashMap<String, Integer>  mp = new LinkedHashMap<>();
        for (int i=0;i<a.length;i++)
        {
            if(isSodep(Integer.parseInt(a[i]))){
                if (mp.containsKey(a[i])){
                    mp.put(a[i], mp.get(a[i])+1);
                }else{
                    mp.put(a[i], 1);
                }
            }
            
        }
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(mp.entrySet());

        // Sắp xếp danh sách theo thứ tự số lần xuất hiện giảm dần
        Collections.sort(entryList, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> entry1, Map.Entry<String, Integer> entry2) {
                // So sánh theo giảm dần của số lần xuất hiện
                return entry2.getValue().compareTo(entry1.getValue());
            }
        });

        // In kết quả
        for (Map.Entry<String, Integer> entry : entryList) {
            System.out.println(entry.getKey() +" "+ entry.getValue() );
        }
    }
}
