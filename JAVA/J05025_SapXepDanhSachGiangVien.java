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
class GV implements Comparable <GV>{
    public static int num = 1;
    private String fullname, subject, id;

    public GV() {
    }

    public GV(String fullname, String subject) {
        this.id = String.format("GV%02d", num++);
        this.fullname = fullname;
        this.subject = subject;
    }

    public String getFullname() {
        return fullname;
    }
    
    public String getName()
    {
        String[] b = fullname.split("\\s+");
        return b[b.length - 1].toLowerCase();
    }
    public void chuanhoa()
    {
        String [] a = fullname.trim().split("\\s+");
        String res ="";
        for (String x : a)
        {
            res += x.substring(0,1).toUpperCase() + x.substring(1).toLowerCase()+" ";
        }
        this.fullname = res.substring(0, res.length() -1);
    }
    public String getNganh()
    {
        String[] b = subject.toUpperCase().split("\\s+");
        String res = "";
        for (int i = 0; i < b.length; i++) {
            String tmp = b[i];
            res+= tmp.charAt(0);
        }
        return res;
    }
    @Override 
    public String toString()
    {
        return id + " " + fullname + " " + getNganh() ;
    }
    @Override
    public int compareTo(GV o)
    {
        if(this.getName().compareTo(o.getName()) == 0)
        {
            return this.id.compareTo(o.id);
        }
        return this.getName().compareTo(o.getName());
    }
}
public class J05025_SapXepDanhSachGiangVien {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        int n = Integer.parseInt(sc.nextLine());
        GV[] arr = new GV[n];
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            String sub = sc.nextLine();
            arr [i] = new GV(name,sub);
            arr[i].chuanhoa();
        }
       
        int q = Integer.parseInt(sc.nextLine());
        while(q-->0)
        {
            String s = sc.nextLine();
            System.out.println("DANH SACH GIANG VIEN THEO TU KHOA " + s + ":");
            String ans = "";
            for (char x : s.toCharArray()) ans += Character.toLowerCase(x);
            for(GV x : arr)
            {
                String tmp = "";
                for (int i = 0; i < x.getFullname().length(); ++i) tmp += Character.toLowerCase(x.getFullname().charAt(i));
                if (tmp.contains(ans)) System.out.println(x);
            }
        }
        
    }
}
/*
3
Nguyen Manh Son
Cong nghe phan mem
Vu Hoai Nam
Khoa hoc may tinh
Dang Minh Tuan
An toan thong tin
1
aN
*/