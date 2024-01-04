/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class sodaonguoc {
    public static BigInteger dao(BigInteger n)
    {
        // tim so sao cua n
        String s = String.valueOf(n);
        StringBuilder chuoiDaoNguoc = new StringBuilder(s);
        String res = chuoiDaoNguoc.reverse().toString();
        BigInteger k = new BigInteger(res);
        return n.add(k);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int dem =0;
        while(t-->0)
        {
            BigInteger n = sc.nextBigInteger();
            while(n.mod(new BigInteger("13")).equals(BigInteger.ZERO)== false)
            {
                n= dao(n);
                dem++;
                if(dem>1000) break;
            }
            if(dem > 1000){
                System.out.println(-1);
            }else  System.out.println(n);
            
           
        }
        
    }
}
