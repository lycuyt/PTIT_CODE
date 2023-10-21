
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class cau3_3 {
    public static void main(String[] args) {
        NganHang n = new NganHang();
        Scanner sc = new Scanner(System.in);
        //tim theo gia
        n.timKiemTheoGia(Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()));
        n.timTheoLoaiTien(sc.nextLine());
        n.timTheoNam(sc.nextLine());
    }
}
