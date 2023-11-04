/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CODEPTIT;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
class thuNhapNV {

    private String ma, ten, chucvu;
    private int basicsalary, salarydays, totalSalary, phucap, ung;

    public thuNhapNV(int ma, String ten, String chucvu, int basicsalary, int salarydays) {
        this.ma = "NV" + String.format("%02d", ma);
        this.ten = ten;
        this.chucvu = chucvu;
        this.basicsalary = basicsalary;
        this.salarydays = salarydays;
        //xu li phu cap;
        if (chucvu.equals("GD")) {
            this.phucap = 500;
        } else if (chucvu.equals("PGD")) {
            this.phucap = 400;
        } else if (chucvu.equals("TP")) {
            this.phucap = 300;
        } else if (chucvu.equals("KT")) {
            this.phucap = 250;
        } else {
            this.phucap = 100;
        }
        //luong tong
        this.totalSalary = basicsalary * salarydays ;
        //xu li tam ung
        if ((this.phucap + this.totalSalary) * 2 / 3 < 25000) {
            this.ung = (int)Math.round((double)((phucap + totalSalary) * 2 / 3) / 1000) * 1000;
        } else {
            this.ung = 25000;
        }

    }

    public int getPhucap() {
        return phucap;
    }

    public String getChucvu() {
        return chucvu;
    }

    public int getTotalSalary() {
        return totalSalary;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + phucap + " " + totalSalary + " " + ung + " " + ( phucap + totalSalary - ung);
    }
}

public class J05043_TinhThuNhapGV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        thuNhapNV[] arr = new thuNhapNV[n];
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            arr[i] = new thuNhapNV(i + 1, sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt());
        }
        Arrays.sort(arr, new Comparator<thuNhapNV>(){
            @Override
            public int compare(thuNhapNV o1, thuNhapNV o2) {
                return (o2.getTotalSalary()+o2.getPhucap()) - (o1.getTotalSalary()+o1.getPhucap());
            
        }});
        for (thuNhapNV x : arr) {
                System.out.println(x);

            }
        }
    }
/*
4
Tran Thi Yen
NV
1000
24
Nguyen Van Thanh
BV
1000
30
Doan Truong An
TP
3000
25
Le Thanh
GD
5000 
28
*/