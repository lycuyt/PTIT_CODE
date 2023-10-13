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
import java.util.Arrays;
/**
 *
 * @author Admin
 */
class Sv implements Comparable<Sv>{
    private String id , name, clas, email;

    public Sv() {
    }
    
    public Sv(String id, String name, String clas, String email) {
        this.id = id;
        this.name = name;
        this.clas = clas;
        this.email = email;
    }

    public String getClas() {
        return clas;
    }

    public String getId() {
        return id;
    }
    
    
    @Override
    public String toString()
    {
        return id+ " " + name + " " + clas + " " + email;
    }
    @Override
    public int compareTo(Sv o)
    {
        if ( this.clas.compareTo(o.clas) == 0)
        {
            return this.id.compareTo(o.id);
        }
        return this.clas.compareTo(o.clas);
    }
}
class MangSv{
    private Sv[] a;

    public MangSv() {
    }

    public MangSv(Sv[] a) {
        this.a = a;
    }
    
    public void SapXep()
    {
        Arrays.sort(a);
    }
    
    public void out(String nganh)
    {
        String tmp = "";
        for (int i = 0; i < nganh.length(); ++i) tmp += Character.toUpperCase(nganh.charAt(i));
        String [] b = tmp.split("\\s+");
        String ans = "DC";
        for (int i = 0; i < 2; i++) {
            ans +=b[i].charAt(0);
        }
        System.out.println("DANH SACH SINH VIEN NGANH " + tmp + ":");
        for (int i = 0; i < a.length; i++) {
            String s = a[i].getId().substring(3,7);
            if(s.equals(ans) && a[i].getClas().charAt(0) != 'E'){
                System.out.println(a[i]);
            }
        }
    }
    
}
public class J05024_LietKeSinhVienTheoNganh {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = Integer.parseInt(sc.nextLine());
        Sv[] a =  new Sv[n];
        for (int i = 0; i < n; i++) {
            String id = sc.nextLine();
            String name = sc.nextLine();
            String clas = sc.nextLine();
            String email = sc.nextLine();
            a[i] = new Sv(id, name, clas, email);
            
        }
        MangSv arr = new MangSv(a);
        int q = Integer.parseInt(sc.nextLine());
        while(q-->0)
        {
            String s = sc.nextLine();
            arr.out(s);
        }
        
    }
}
/*
4
E16DCCN011
Nguyen Trong Duc Anh
D16CNPM1
sv1@stu.ptit.edu.vn
B15DCCN215
To Ngoc Hieu
B15CNPM3
sv2@stu.ptit.edu.vn
B15DCKT150
Nguyen Ngoc Son
D15CQKT02-B
sv3@stu.ptit.edu.vn
B15DCKT199
Nguyen Trong Tung
D15CQKT02-B
sv4@stu.ptit.edu.vn
1
Ke toan
*/