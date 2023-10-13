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
class ThiSinh{
    private String id, name;
    private float toan, ly, hoa;

    public ThiSinh() {
    }

    public ThiSinh(String id, String name, float toan, float ly, float hoa) {
        this.id = id;
        this.name = name;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
    }

    public String getId() {
        return id;
    }
    
    public float getThuong()
    {
        // co the la so thap phan hoac ko
        String tmp = getId().substring(0,3);
        float dd=0;
        if (tmp.equals("KV1")) {
            dd= 0.5f;
        }else if(tmp.equals("KV2")){
            dd = 1.0f;
        }
        else dd = 2.5f;
        return dd;
    }
    public float Tong()
    {
        return toan*2 + ly + hoa;
    }
    public String check()
    {
        float sum = Tong() + getThuong();
        if(sum>=24) return "TRUNG TUYEN";
        else return "TRUOT";
    }
    @Override
    public String toString()
    {
        return id + " " + name + " ";
    }
}
public class J04013_BaiToanTuyenSinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        ThiSinh a = new ThiSinh();
        String id = sc.next();
        sc.nextLine();
        String name = sc.nextLine();
//        sc.nextLine();
        float toan = sc.nextFloat();
        float ly = sc.nextFloat();
        float hoa = sc.nextFloat();
        a = new ThiSinh(id, name , toan, ly , hoa);
        
        System.out.print(a.toString());
        float b = a.getThuong();
        int c = (int) b;
        if ( c == b) System.out.print(c+" ");
        else System.out.print(String.format("%.1f", b)+ " ");
        
        float k = a.Tong();
        c = (int) k;
        if ( c == k) System.out.print(c +" ");
        else System.out.print(String.format("%.1f", k) + " ");
        
        System.out.println(a.check());
    }
}
/*
KV2A002
Hoang Thanh Tuan
5
6
5

KV2B123
Ly Thi Thu Ha
8
6.5
7
*/