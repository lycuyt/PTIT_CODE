
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class Cau3_3 {
    public static void main(String[] args) {
        NganHang n=new NganHang();
        Scanner in=new Scanner(System.in);
        //tim theo gia
        n.timKiemTheoGia(Double.parseDouble(in.nextLine()),
                         Double.parseDouble(in.nextLine()));
        //tim theo loai tien
        n.timTheoLoaiTien(in.nextLine());
        //tim theo nam
        n.timTheoNam(Integer.parseInt(in.nextLine()));
    }
}
