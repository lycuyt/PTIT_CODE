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
class Customer implements Comparable<Customer> {
    private String SD, ma;
    private int cu, moi;
    public static int num = 1;

    public Customer() {
    }

    public Customer(String SD, int cu, int moi) {
        this.ma = String.format("KH%02d", num++);
        this.SD = SD;
        this.cu = cu;
        this.moi = moi;
    }
    public int getHS()
    {
        if(SD.equals("KD")) return 3;
        if(SD.equals("NN")) return 5;
        if(SD.equals("TT")) return 4;
        return 2;
    }
    public int TT()
    {
        return (moi - cu) * getHS() *550;
    }
    public int PT()
    {
        int a = moi - cu;
        if(a> 100) return TT() ;
        if(a>=50) return Math.round((float)(0.35 *TT()));
        return 0;
    }
    public int Tong()
    {
        return PT() + TT();
    }
    @Override
    public String toString()
    {
        return ma + " " + getHS() + " " + TT() + " " + PT()  + " " + Tong();
    }

    @Override
    public int compareTo(Customer o) {
        return - (this.Tong() - o.Tong());
    }
    
}
public class J05050_TinhTienDien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Customer> a= new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String sd = sc.nextLine();
            int cu = Integer.parseInt(sc.nextLine());
            int moi = Integer.parseInt(sc.nextLine());
            a.add(new Customer(sd, cu , moi));
        }
        Collections.sort(a);
        for(Customer x : a)
        {
            System.out.println(x);
        }
        
    }
}
/*
3
KD
400
555
NN
58
400
CN
150
700
*/