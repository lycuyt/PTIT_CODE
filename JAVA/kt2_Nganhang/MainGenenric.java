
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeMap;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class MainGenenric {
    public static void main(String[] args) {
        
//        Chung c=new Chung();
//        Integer[] intArray = { 1, 2, 3, 4, 5 };
//      Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
//      Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };
//      GiaoDichVang[] vArray={new GiaoDichVang("2/2/2022", 100, 10, "9999"),
//                             new GiaoDichVang("3/3/2022", 200, 5, "12K")};
//      System.out.println("Array integerArray contains:");
//      c.printArray(intArray);   // pass an Integer array
//
//      System.out.println("\nArray doubleArray contains:");
//      c.printArray(doubleArray);   // pass a Double array
//
//      System.out.println("\nArray characterArray contains:");
//      c.printArray(charArray);   // pass a Character array
//      c.printArray(vArray);
//        Set<String> s=new HashSet<>();
//        s.add("Ha anh");
//        s.add("Thu thu");
//        
//        s.add("Ha Anh");
//        s.add("Ha anh");
//        s.add("Tuan tu");
//        System.out.println(s);
//        Iterator i=s.iterator();
//        while(i.hasNext()){
//            System.out.println(i.next());
//        }
//           int[] a={2,4,2,4,5,7,7};
//           //viet ra cac so va so lan xuat hien
//           Map<String,String > m2=new HashMap<>();
//           Map<String,String > m1=new LinkedHashMap<>();
//           Map<String,String > m=new TreeMap<>();
//           m.put("mot", "to an an");
//           m.put("hai", "Manh ha");
//           m.put("mot", "Lan anh");
//           m.put("bon", "Tam hao");
//        for (String key : m.keySet()) {
//            System.out.println(key+":"+m.get(key));
//        }
           List<String> a=new ArrayList<>();
           a.add("To an an");
           a.add("Tuan ha");
           a.add("Minh chau");
           System.out.println(a);
           System.out.println("-------------------");
           String[] b=a.toArray(new String[a.size()]);
           System.out.println(Arrays.toString(b));
           List<String> c=Arrays.asList(b);
           System.out.println("-----------------");
           System.out.println(c);
           
    }
}
