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
public class J01021_TichLuyThua {
    
    public static Scanner ip = new Scanner ( System.in);
    public static final long MOD=(int)1e9+7;
    public static long pow(long a, long b)
    {
        if(b==0){
            return 1;
        }
        if(b==1)
        {
            return a%MOD;
        }
        long tmp=pow(a, b/2);
        if(b%2==0) return (tmp*tmp)%MOD;
        return (((tmp*tmp)%MOD)*a)%MOD;
    }
    public static void main(String[] args) {
        while(true)
        {
            long a= ip.nextLong();
            long b=ip.nextLong();
            if(a==0 && b==0){
                return;
            }
            System.out.println(pow(a,b)%MOD);
        }
    }
}
