/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
class student implements Comparable <student>{
   private String id, name, clas;
   private Float diem1, diem2, diem3;
   public static int num = 1;
   private int stt;
    public student() {
    }

    public student(String id, String name, String clas, Float diem1, Float diem2, Float diem3) {
        this.id = id;
        this.name = name;
        this.clas = clas;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
        this.stt = num++;
    }
    @Override
    public String toString()
    {
        return  id + " " + name + " " + clas+" " + String.format("%.1f", diem1)+" " +String.format("%.1f", diem2)+ " "+String.format("%.1f", diem3);
    }
    @Override
    public int compareTo(student o)
    {
        return this.name.compareTo(o.name);
    }
}
public class J05030_BangDiemThanhPhan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        student []  a = new student[n];
        for (int i = 0; i < n; i++) {
            String id= sc.nextLine();
            String name =sc.nextLine();
            String clas = sc.nextLine();
            Float d1 = Float.parseFloat(sc.nextLine());
            Float d2 = Float.parseFloat(sc.nextLine());
            Float d3 = Float.parseFloat(sc.nextLine());
            a[i] = new student(id, name, clas, d1, d2, d3);
        }
        Arrays.sort(a);
        int k = 1;
        for(student x : a) {
            System.out.print(k+" ");
            k++;
            System.out.println(x);
        }
    }
}
/*
3
B20DCCN999
Nguyen Van An
D20CQCN04-B
10.0
9.0
8.0
B20DCAT001
Le Van Nam
D20CQAT02-B
6.0
6.0
4.0
B20DCCN111
Tran Hoa Binh
D20CQCN04-B
9.0
5.0
6.0
*/