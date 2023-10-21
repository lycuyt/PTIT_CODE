
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class CauDate {
    public static void main(String[] args) {
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
        Scanner in = new Scanner(System.in);
        Date tu, den;
        long day;
        // bai 1
        try{
            
            tu  = f.parse(in.nextLine());
            den =f.parse(in.nextLine());
            long distance = den.getTime() - tu.getTime();
            day = distance/(1000 * 60 * 60 *24);
            System.out.println(day*300);
            
        }catch(ParseException e){
            System.out.println("Nhap ngay khong hop le");
        }
        // bai 2
        SimpleDateFormat f1 = new SimpleDateFormat("hh:mm:ss");
        long gio, tien;
        Date tu1, den1;
        try{
            tu1  = f1.parse(in.nextLine());
            den1 =f1.parse(in.nextLine());
            long distance = den1.getTime() - tu1.getTime();
            gio = distance/(1000 *60 * 60);
            long le = (distance/1000)%60;
            if(gio<=1)
            {
                tien = 25;
            }else if(le>0)
            {
                tien = 25 + gio*10;
            }else{
                tien = 25 +(gio -1)*10;
            }
            
            System.out.println(tien);
        }catch(ParseException e)
        {
            System.out.println("Nhap gio khong hop le");
        }
        
    }
}
