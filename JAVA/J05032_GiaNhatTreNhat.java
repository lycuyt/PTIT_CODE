/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author Admin
 */
class Person implements Comparable<Person>{
    private String name, birth;

    public Person() {
    }

    public Person(String name, String birth) {
        this.name = name;
        this.birth = birth;
    }
    @Override
    public String toString()
    {
        return name;
    }
    @Override
    public int compareTo(Person o)
    {
        String[] s1 = this.birth.split("/");
        String[] s2 = o.birth.split("/");
        String res1 = s1[2] + s1[1] + s1[0];
        String res2 = s2[2] + s2[1] + s2[0];
        return res2.compareTo(res1);
    }
}
public class J05032_GiaNhatTreNhat {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = Integer.parseInt(sc.nextLine());
        Person[] a = new Person[n];
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            String [] b = s.split("\\s+");
            a[i] = new Person(b[0], b[1]);
        }
        Arrays.sort(a);
        System.out.println(a[0]);
        System.out.println(a[n-1]);
    }
}
/*
5
Nam 01/10/1991
An 30/12/1990
Binh 15/08/1993
Tam 18/09/1990
Truong 20/09/1990
*/