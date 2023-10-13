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

class teacher {
    private String ip, name;
    private int crash;
    private int bac, phucap;
    
    public teacher(){
    }

    public teacher(String ip, String name, int crash) {
        this.ip = ip;
        this.name = name;
        this.crash = crash;
        
        bac = Integer.parseInt(ip.substring(2));
        if(ip.substring(0, 2).equals("HT")){
            phucap= 2000000;
        }else if(ip.substring(0, 2).equals("HP")){
           phucap =900000;
        }else if (ip.substring(0, 2).equals("GV")){
            phucap= 500000;
        }
    }

    public String getIp() {
        return ip;
    }
    
    
    public int getLuong()
    {
        return crash*bac + phucap;
    }
    @Override
    public String toString(){
        return ip+" "+name+" "+bac+" "+phucap+" "+getLuong();
    }
}
//HP04
//Tran Quoc Huy
//1578000
// 1 HT 2 HP
public class J05064_BangThuNhapGiaoVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        List<teacher> arr = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        int ht = 0;
        int hp = 0;
        for (int i = 0; i < n; i++) {
            String  a= sc.nextLine();
            String b= sc.nextLine();
            int c = Integer.parseInt(sc.nextLine());
            //check hieu trg hieu pho
            String tmp = a.substring(0, 2);
            if (tmp.equals("HT"))
            {
                ht++;
            }
            if(tmp.equals("HP")){
                hp++;
            }
            
            teacher tc = new teacher(a, b, c);
            if(tmp.equals("HT")  && ht <=1){
                arr.add(tc);
            }else if(tmp.equals("HP") && hp <=2)
            {
                arr.add(tc);
            
            }else if(tmp.equals("GV")){
                arr.add(tc);
            }
        }
        
        for(teacher x : arr)
        {
            System.out.println(x);
        }
        
        
    }
}
/*
3
GV01
Nguyen Kim Loan
1420000
HT05
Hoang Thanh Tua
1780000
GV02
Tran Binh Nguyen
1468000
*/