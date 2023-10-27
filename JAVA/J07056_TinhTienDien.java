/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
class KH{
    private String ten, ma;
    private String loai;
    private int chisodau, chisocuoi;
    private int dinhmuc;
    public static int num = 1;

    public KH() {
    }
    private String chuanhoa(String s)
    {
        String res ="";
        String[]a = s.trim().split("\\s+");
        for (int i = 0; i < a.length; i++) {
            res+=a[i].substring(0,1).toUpperCase() + a[i].substring(1).toLowerCase()+" ";
        }
        return res.substring(0, res.length() -1);
    }
    public KH(String ten, String loai, int chisodau, int chisocuoi) {
        this.ten = chuanhoa(ten);
        this.ma = String.format("KH%02d", num++);
        this.loai = loai;
        this.chisodau = chisodau;
        this.chisocuoi = chisocuoi;
        if(loai.equals("A")){
            this.dinhmuc = 100;
        }else if(loai.equals("B")){
            this.dinhmuc = 500;
        }else{
            this.dinhmuc = 200;
        }
    }
    public int tientrongdinhmuc()
    {
        if(chisocuoi - chisodau <= dinhmuc) return (chisocuoi - chisodau)*450;
        else return dinhmuc*450;
    }
    public int tienvuotmuc()
    {
        if(chisocuoi - chisodau > dinhmuc) return (chisocuoi - chisodau -dinhmuc)*1000;
        return 0;
    }
    public int thuevat()
    {
        return (int)Math.round(0.05 *tienvuotmuc());
       
    }
    public int nop(){
        return tientrongdinhmuc() + tienvuotmuc() + thuevat();
    }
    @Override
    public String toString()
    {
        return  ma +" "+ ten +" "+ tientrongdinhmuc()+" "+
                tienvuotmuc()+" "+thuevat()+" "+nop();
    }
}
public class J07056_TinhTienDien {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        List <KH> a = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String ten = sc.nextLine();
            String s = sc.nextLine();
            String loai = s.split("\\s+")[0];
            int dau = Integer.parseInt(s.split("\\s+")[1]);
            int cuoi = Integer.parseInt(s.split("\\s+")[2]);
            a.add(new KH(ten, loai, dau, cuoi));
        }
        a.sort(new Comparator<KH>(){
            @Override
            public int compare(KH o1, KH o2) {
                return o2.nop() - o1.nop();
            }
            
        });
        for(KH x : a){
            System.out.println(x);
        }
    }
}
