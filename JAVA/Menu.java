/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

/**
 *
 * @author Lycuy
 */
import java.util.Scanner;
public class Menu {
    public static void main(String[] args) {
        while(true)
        {
            System.out.print("""
                1.Nhap 1 mon hoc
                2.Viet 
                3.Sap xep day
                4.Dua ra phan tu va so lan xuat hien
                5.Nhap vao 1 xau
                6.Lay ki tu dac biet ( chu, cach, so , ki tu dac biet)
                7.Chuan hoa theo tieng anh
                8.Nhap vao 1 mang tran chi nhat
                9.Tong hai ma tran chu nhat
                0. thoat             
                             """);
            System.out.println("Ban chon tu 0->9");
            int chon;
            Scanner ip = new Scanner ( System.in);
            chon= ip.nextInt();
            switch(chon)
            {
                case 0->{
                    System.out.println("bye");
                    System.exit(0);
                }
                case 1->{
                    System.out.println("Ban chon 1");
                            
                }
                case 2->{
                    System.out.println("Ban chon 2");
                            
                }
                case 3->{
                    System.out.println("Ban chon 3");
                            
                }
                case 4->{
                    System.out.println("Ban chon 4");
                            
                }
                case 5->{
                    System.out.println("Ban chon 5");
                            
                }
                case 6->{
                    System.out.println("Ban chon 6");
                            
                }
                case 7->{
                    System.out.println("Ban chon 7");
                            
                }
                case 8->{
                    System.out.println("Ban chon 8");
                            
                }
                case 9->{
                    System.out.println("Ban chon 9");
                            
                }
                default->System.out.println("chi chon ti 0->9");
            }
        }
    }
}


