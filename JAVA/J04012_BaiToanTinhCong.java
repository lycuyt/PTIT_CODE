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
class NV{
    private String name, position;
    private int wage, day;

    public NV() {
    }

    public NV(String name,int wage, int day, String position) {
        this.name = name;
        this.position = position;
        this.wage = wage;
        this.day = day;
    }
    public int getPhuCap()
    {
        if(position.equals ("GD")) return 250000 ;
        else if(position.equals ("PGD")) return 200000 ;
        else if(position.equals ("TP")) return 180000 ;
        else return 150000 ;
        
    }
    public int getLuongThang()
    {
        return wage * day;
    }
    public int getThuong()
    {
        if (day>=25) return getLuongThang()/5;
        if ( day >= 22 && day<25) return getLuongThang() /10;
        else return 0;
        
    }
    
    @Override
    public String toString()
    {
        return "NV01" + " " + name +" " + getLuongThang() + " " + getThuong() + " " + getPhuCap() + " " +(getLuongThang() + getPhuCap() + getThuong());
    }
    
}
public class J04012_BaiToanTinhCong {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String name = sc.nextLine();
        int wage= sc.nextInt();
        int day = sc.nextInt();
        String position = sc.next();
        NV a = new NV(name, wage, day, position);
        System.out.println(a);
    }
}

/*
    Bui Thi Trang
    45000
    23
    PGD
*/

