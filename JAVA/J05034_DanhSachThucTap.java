/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
class SV implements Comparable <SV>{
    private String id, name, clas,email,company;
    public static int num =1;
    private int stt;
    public SV() {
    }

    public SV(String id, String name, String clas, String email, String company) {
        this.id = id;
        this.name = name;
        this.clas = clas;
        this.email = email;
        this.company = company;
        this.stt = num++;
    }

    public String getCompany() {
        return company;
    }
    
    @Override
    public String toString()
    {
        return stt+" " + id +" " + name+" " + clas+" " + email+" " + company;
    }
    @Override
    public int compareTo(SV o)
    {
        return this.id.compareTo(o.id);
    }
    
}
public class J05034_DanhSachThucTap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List <SV> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String id = sc.nextLine();
            String name = sc.nextLine();
            String clas= sc.nextLine();
            String email= sc.nextLine();
            String compa = sc.nextLine();
            a.add(new SV(id, name, clas, email, compa));
        }
        Collections.sort(a);
        int q = Integer.parseInt(sc.nextLine());
        while(q-->0)
        {
            String s = sc.nextLine();
            for(SV x : a)
            {
                if(x.getCompany().equals(s)){
                    System.out.println(x);
                }
            }
        }
        
    }
}
/*
6
B17DCCN016 
Le Khac Tuan Anh 
D17HTTT2   
test1@stu.ptit.edu.vn
VIETTEL
B17DCCN107 
Dao Thanh Dat    
D17CNPM5   
test2@stu.ptit.edu.vn
FPT
B17DCAT092 
Cao Danh Huy     
D17CQAT04-B
test3@stu.ptit.edu.vn
FPT
B17DCCN388 
Cao Sy Hai Long  
D17CNPM2   
test4@stu.ptit.edu.vn
VNPT
B17DCCN461 
Dinh Quang Nghia 
D17CNPM2   
test5@stu.ptit.edu.vn
FPT
B17DCCN554 
Bui Xuan Thai    
D17CNPM1   
test6@stu.ptit.edu.vn
GAMELOFT
1
FPT
*/