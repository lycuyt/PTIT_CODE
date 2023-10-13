/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
class student implements Comparable<student>{
    public static int num = 1;
    private String id, name, bith, clas;
    private float gpa;

    

    public student( String name, String bith, String clas, float gpa) {
        this.id = String.format("B20DCCN%03d", num++);
        this.name = formatName(name);
        this.bith = bith;
        this.clas = clas;
        this.gpa = gpa;
    }

    public Float getGpa() {
        return gpa;
    }
    
    public String formatName(String name)
    {
        String [] a = name.trim().split("\\s+");
        String res ="";
        for (String x : a)
        {
            res += x.substring(0,1).toUpperCase() + x.substring(1).toLowerCase()+" ";
        }
        return res.substring(0, res.length() -1);
    }
    @Override
    public int compareTo(student other) {
        return -(this.getGpa().compareTo(other.getGpa()));
    }
    @Override
    public String toString()
    {
        return id+" " + name + " " + clas + " " + bith + " " + String.format("%.2f", gpa);
    }
}
public class J05005_DanhScahDoiTuongSinhVien3 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner (System.in);
        SimpleDateFormat sdf = new SimpleDateFormat ("dd/mm/yyyy");
        
        int n = Integer.parseInt(sc.nextLine());
        List<student> a = new ArrayList<>(n);
        for(int i=0;i<n;i++)
        {
            String name = sc.nextLine();
            String clas = sc.nextLine();
            String birth = sdf.format(sdf.parse(sc.nextLine()));
            float gpa = Float.parseFloat(sc.nextLine());
            student sd = new student(name, birth, clas, gpa );
            a.add(sd);
        }
        Collections.sort(a);
        for(student x : a)
        {
            System.out.println(x);
        }
    }
}
/*
2
ngUYen Van NaM
D20DCCN01-B
2/12/1994
2.17
Nguyen QuanG hAi
D20DCCN02-B
1/9/1994
3.0
*/