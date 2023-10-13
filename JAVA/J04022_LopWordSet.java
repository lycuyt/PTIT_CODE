/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
import java.util.TreeSet;
class WordSet{
    private String s;

    public WordSet() {
    }

    public WordSet(String s) {
        this.s = s;
    }

    public String getS() {
        return s;
    }
    
    public String union(WordSet b)
    {
        String[] m= s.toLowerCase().split("\\s+");
        String[] n = b.getS().toLowerCase().split("\\s+");
        TreeSet<String> u = new TreeSet<>();
        for (int i = 0; i < m.length ; i++) {
            u.add(m[i]);
        }
        for (int i = 0; i < n.length; i++) {
            u.add(n[i]);
        }
        String res = "";
        for(String x : u)
        {
            res+=x+" ";
        }
        return res;
    }
    public String intersection(WordSet b)
    {
        String res ="";
        String[] m= s.toLowerCase().split("\\s+");
        String[] n = b.getS().toLowerCase().split("\\s+");
        TreeSet<String> u = new TreeSet<>();
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < n.length; j++) {
                if(m[i].equals(n[j])){
                    u.add(m[i]);
                }
            }
        }
        for(String x : u)
        {
            res+=x+" ";
        }
        return res;
    }
    
}
public class J04022_LopWordSet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        WordSet s1 = new WordSet(in.nextLine());
        WordSet s2 = new WordSet(in.nextLine());
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}
/*
Lap trinh huong doi tuong
Ngon ngu lap trinh C++
*/