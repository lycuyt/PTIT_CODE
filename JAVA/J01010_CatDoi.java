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
public class J01010_CatDoi {
    public static Scanner ip = new Scanner ( System.in);
    public static long testcase(String s)
    {
        long n=0;
        for(int i=0;i<s.length();i++){
            char c= s.charAt(i);
            switch(c)
            {
                case '0':
                case '8':
                case '9':
                    n=n*10;
                    break;
                case '1':
                    n=n*10+1;
                    break;
                default:
                    return 0;
                    
            }
            
            
        }
        return n;
    }
    public static void slove()
    {
        String s= ip.next();
        long n= testcase(s);
        if(n==0){
            System.out.println("INVALID");
        }else{
            System.out.println(n);
        }
    }
    public static void main(String[] args) {
        int t= ip.nextInt();
        while(t-->0)
        {
            slove();
        }
    }
}
