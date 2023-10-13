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
public class J01009_TongGiaiThua {
    public static Scanner ip = new Scanner (System.in);
    public static void testcase()
    {
        int n= ip.nextInt();
        long res=0, ans=1;
        for(int i=1;i<=n;i++){
            ans*=i;
            res+=ans;
        }
        System.out.println(res);
    }
    public static void main(String[] args) {
        testcase();
    }
}
