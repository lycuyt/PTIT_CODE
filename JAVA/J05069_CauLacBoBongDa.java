/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
class CLB{
    private String maclb, tenclb;
    private int gia;

    public CLB() {
    }
    
    public CLB(String maclb, String tenclb, int gia) {
        this.maclb = maclb;
        this.tenclb = tenclb;
        this.gia = gia;
    }

    public String getMaclb() {
        return maclb;
    }

    public String getTenclb() {
        return tenclb;
    }

    public int getGia() {
        return gia;
    }
    
    
}
class TranDau{
    private String matd, ten;
    private int cdv, doanhthu;

    public TranDau() {
    }

    public TranDau(String matd, int cdv) {
        this.matd = matd;
        this.cdv = cdv;
    }

    public int getDoanhthu() {
        return doanhthu;
    }
    
    public String getMatd() {
        return matd;
    }

    public String getTen() {
        return ten;
    }
    
    public int getCdv() {
        return cdv;
    }

    public void setMatd(String matd) {
        this.matd = matd;
    }

    public void setCdv(int cdv) {
        this.cdv = cdv;
    }

    public void setDoanhthu(int doanhthu) {
        this.doanhthu = doanhthu;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }
    @Override
    public String toString()
    {
        return matd + " " + ten +" " + doanhthu;
    }
    

    
    
}
public class J05069_CauLacBoBongDa {
    public static void main(String[] args) {
        // clb
        
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<CLB> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            int gia = Integer.parseInt(sc.nextLine());
            list.add(new CLB(ma, ten, gia));
        }
        
        int m = Integer.parseInt(sc.nextLine());
        List <TranDau> td = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String ma = sc.next();
            int cdv = sc.nextInt();
            td.add(new TranDau(ma, cdv));
        }
        for(TranDau x : td)
        {
            
            for(CLB y : list)
            {
                if(x.getMatd().substring(1, 3).equals(y.getMaclb())){
                    int doanhthu = x.getCdv() * y.getGia();
                    x.setDoanhthu(doanhthu);
                    x.setTen(y.getTenclb());
//                    System.out.println(x);
                    break;
                }
            }
        }
        Collections.sort(td, new Comparator<TranDau>(){
            @Override
            public int compare(TranDau o1, TranDau o2) {
                if(o1.getDoanhthu()== o2.getDoanhthu()){
                    return o1.getTen().compareTo(o2.getTen());
                }
                return o2.getDoanhthu() - o1.getDoanhthu();
            }
            
        });
        for(TranDau x: td)
        {
            System.out.println(x);
        }
    }
}
/*
2
AC
AC Milan
12
MU
Manchester United
10
2
IAC1 80000
EMU2 60000
*/