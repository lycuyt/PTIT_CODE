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
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
class MH implements Comparable<MH>{
    private String ten, nhom;
    private Double giamua, giaban, ln;

    public static int num = 1;
    private int stt;
    public MH(String ten, String nhom, Double giamua, Double giaban) {
        this.stt = num++;
        this.ten = ten;
        this.nhom = nhom;
        this.giamua = giamua;
        this.giaban = giaban;
        this.ln = this.giaban - this.giamua;
    }

    public Double getLn() {
        return ln;
    }
    
    @Override 
    public String toString()
    {
        return stt +" " + ten +" " + nhom + " " + String.format("%.2f", ln);
    }
    @Override
    public int compareTo(MH o)
    {
        return -this.ln.compareTo(o.ln);
    }
    
}
public class J05010_SapXepDanhSachMatHang {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = Integer.parseInt(sc.nextLine());
        
        List<MH> list = new ArrayList<>();
        
        for(int i=0;i<n;i++)
        {
            String name = sc.nextLine();
            String nhom = sc.nextLine();
            double mua = Double.parseDouble(sc.nextLine());
            double ban = Double.parseDouble(sc.nextLine());
            MH x  = new MH (name, nhom, mua , ban);
            list.add(x);
        }
        Collections.sort(list);
        
        for(MH x : list)
        {
            System.out.println(x);
        }
    }
}
/*
3
May tinh SONY VAIO
Dien tu
16400
17699
Tu lanh Side by Side
Dien lanh
18300
25999
Banh Chocopie
Tieu dung
27.5
37
*/