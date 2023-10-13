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
public class J01012_UocChiaHetCho2 {
    public static Scanner ip = new Scanner(System.in);
    public static void testcase(){
        long n= ip.nextLong();
        // uoc so chia het cho 2
        int cnt=0;
        for(long i=1;i<=Math.sqrt(n);i++)
        {
            if(n%i==0 ){
                if(i%2==0) cnt++;
                if(n/i %2==0)cnt++;
                if(n/i==i && i%2==0) cnt--;
            }
            
            
        }
        System.out.println(cnt);
    }
    public static void main(String[] args) {
        int t= ip.nextInt();
        while(t-->0){
            testcase();
        }
    }
}
