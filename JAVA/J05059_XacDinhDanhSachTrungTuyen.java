/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

/**
 *
 * @author Admin
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
class ThiSinh implements Comparable<ThiSinh>{
    private String id, name;
    private float toan, ly, hoa;

    public ThiSinh() {
    }

    public ThiSinh(String id, String name, float toan, float ly, float hoa) {
        this.id = id;
        this.name = chuanhoaten(name.trim());
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
    public float TongXH()
    {
        return Tong() + getThuong();
    }
    public String check(float chuan)
    {
        float sum = Tong() + getThuong();
        if(sum>=chuan) return "TRUNG TUYEN";
        else return "TRUOT";
    }
    private String chuanhoaten(String s)
    {
        String[] a= s.split("\\s+");
        String res = "";
        for (int i = 0; i < a.length; i++) {
            res+=a[i].substring(0,1).toUpperCase()+ a[i].substring(1).toLowerCase()+" ";
        }
        
        return res.substring(0, res.length() -1);
    }
    @Override
    public String toString()
    {
        return id + " " + name + " ";
    }

    @Override
    public int compareTo(ThiSinh o) {
        if(this.TongXH() == o.TongXH()){
            return this.id.compareTo(o.id);
        }else if(this.TongXH() > o.TongXH()){
            return -1;
        }else{
            return 1;
        }
        
    }
}
public class J05059_XacDinhDanhSachTrungTuyen {
    public static void main(String[] args) {
        Scanner sc = new Scanner ( System.in);
        ArrayList < ThiSinh> arr = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            ThiSinh a = new ThiSinh();
            String id = sc.next();
            sc.nextLine();
            String name = sc.nextLine();
    //        sc.nextLine();
            float toan = sc.nextFloat();
            float ly = sc.nextFloat();
            float hoa = sc.nextFloat();
            a = new ThiSinh(id, name , toan, ly , hoa);
            arr.add(a);
            

        }
        int sl = sc.nextInt();
//        System.out.println(sl);
        Collections.sort(arr);
        ArrayList < ThiSinh> brr = new ArrayList<>();
        for (int i = 0; i < sl; i++) {
            brr.add(arr.get(i));
        }
        float chuan = brr.get(sl-1).TongXH();
        for (int i = sl; i < arr.size(); i++) {
            if(arr.get(i).TongXH() == chuan){
                brr.add(arr.get(i));
                
            }else{
                break;
            }
        }
        System.out.println(String.format("%.1f", chuan));
        for(ThiSinh a : arr)
        {
            System.out.print(a.toString());
            float b = a.getThuong();
            int c = (int) b;
            if ( c == b) System.out.print(c+" ");
            else System.out.print(String.format("%.1f", b)+ " ");

            float k = a.TongXH();
            c = (int) k;
            if ( c == k) System.out.print(c +" ");
            else System.out.print(String.format("%.1f", k) + " ");

            System.out.println(a.check(chuan));
        }
    }
}
