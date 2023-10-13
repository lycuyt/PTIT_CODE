/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

/**
 *
 * @author Lycuy
 * 
 */
import java.util.Scanner;
public class J01014_UocSoNguyenLonNhat {
    public static Scanner ip= new Scanner(System.in);
    public static int isprime(long n)
    {
        if(n<2) return 0;
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0) return 0;
        }
        return 1;
    }
    public static void testcase()
    {
        long n= ip.nextLong();
        long res=0;
        if(isprime(n)==1){
            System.out.println(n);
            return;
        }else{
            
            for(int i=2;i<=Math.sqrt((n));i++){
                if(n%i==0)
                {
                    if(isprime(n/i)==1){
                        System.out.println(n/i);
                        return;
                    }
                    if(isprime(i)==1){
                        res=i;
                    }
                }
            }
        }
        System.out.println(res);
    }
    public static void main(String[] args) {
        int t= ip.nextInt();
        while(t-->0)
        {
            testcase();
        }
    }
}
