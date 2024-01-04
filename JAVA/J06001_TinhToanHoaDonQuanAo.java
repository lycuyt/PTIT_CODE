/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

/**
 *
 * @author Admin
 */
class quanao{
    private String ma, ten;
    private long dg1, dg2;

    public quanao() {
    }

    public quanao(String ma, String ten, long dg1, long dg2) {
        this.ma = ma;
        this.ten = ten;
        this.dg1 = dg1;
        this.dg2 = dg2;
    }
    
}
class dohang{
    private String ma,maqa;
    private int sl;
    public static int num = 1;
    public dohang() {
    }

    public dohang(String maqa, int sl) {
        this.ma = String.format(maqa+"-%03", num++);
        this.maqa = maqa;
        this.sl = sl;
    }
    
}
public class J06001_TinhToanHoaDonQuanAo {
    public static void main(String[] args) {
        
    }
}
