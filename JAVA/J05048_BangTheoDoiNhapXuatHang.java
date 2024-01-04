/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
class hangHoa{
    private String ma;
    private int luongNhap, luongXuat, donGia , Tien, Thue;

    public hangHoa(String ma, int luongNhap) {
        this.ma = ma;
        this.luongNhap = luongNhap;
        //xu li luong luongxuathang;
        if(ma.charAt(0) == 'A'){
            luongXuat = Math.round((float)luongNhap * 6 / 10); 
        }
        if(ma.charAt(0) == 'B'){
            luongXuat =Math.round((float)luongNhap * 7 / 10); 
        }
        //xu li don gia
        int n = 4;
        if(ma.charAt(n) == 'Y') donGia = 110000;
        if(ma.charAt(n) == 'N') donGia = 135000;
        //xu li tien
        this.Tien = luongXuat * donGia;
        //xu li thue
        if(ma.charAt(0) == 'A' && ma.charAt(4) == 'Y') this.Thue = (int)(Tien * 0.08);
        else if(ma.charAt(0) == 'A' && ma.charAt(4) == 'N') this.Thue =(int) (Tien * 0.11);
        else if(ma.charAt(0) == 'B' && ma.charAt(4) == 'Y') this.Thue = (int)(Tien * 0.17);
        else if(ma.charAt(0) == 'B' && ma.charAt(4)=='N' ) this.Thue =(int) (Tien * 0.22);
    }

    @Override
    public String toString() {
        return  ma + " " + luongNhap + " " + luongXuat + " " + donGia + " " + Tien + " " + Thue ;
    }
    
    
}
public class J05048_BangTheoDoiNhapXuatHang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        hangHoa[] arr = new hangHoa[n];
        for (int i = 0; i < n; i++) {
            
            String ma = sc.nextLine();
            int luongNhap = Integer.parseInt(sc.nextLine());
            arr[i] = new hangHoa(ma, luongNhap);
        }
        for(hangHoa x : arr){
            System.out.println(x);
        }
    }
}
/*
3
A001Y
1000
B012N
2500
B003Y
4582
*/